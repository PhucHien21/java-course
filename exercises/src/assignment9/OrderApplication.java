package assignment9;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import assignment9new.Date;
import assignment9new.Order;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/*
 * Application for handling orders. Features:
 * Read products and prices from specific file
 * Create new order and add order lines to it
 * Show selected order 
 * Remove selected order
 * Save orders to file
 * Read orders from file
 */
public class OrderApplication extends Application{

	private final ComboBox<String> productCmb = new ComboBox<>();
	private final HashMap<String, Double> products = new HashMap<>();
	private final TextField idField = new TextField();
	private final TextField customerField = new TextField();
	private final TextField dateField = new TextField();
	private final TextField quantityField = new TextField();
	private final TextArea textArea = new TextArea();
	private final ComboBox<Integer> orderidCmb = new ComboBox<>();
	private final FileChooser fileChooser = new FileChooser();
	
	//File products.txt should be in the same package folder as this class.
	//Here the filename should be in form "package_name/filename":
	private final String productfile = "assignment9/products.txt";
	
	ArrayList<Manager> order = new ArrayList<>();

	private StringBuilder str1 = new StringBuilder();

	@Override
	public void start(Stage primaryStage)  {
		try {
			readProducts();
		} catch(Exception ex) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Problems with the products file.");
			alert.setContentText("Check that it's path is correct in the program code.");
			alert.showAndWait();
			return;
		}
		
		BorderPane mainpanel = new BorderPane();

		//Controls for creating new order
		GridPane grid1 = new GridPane();
		grid1.setAlignment(Pos.CENTER);
		grid1.setHgap(10); //Horizontal space between columns
		grid1.setVgap(10); //Vertical space between rows
		grid1.setPadding(new Insets(25, 25, 25, 25));
		// Text control for instructions
		Text instrText = new Text("Give OrderID, Customer, Order date, and create new order.\n"
				+ "If Order date is empty, today's date will be used.");
		// In column 0, row 0, column span 2 and row span 1
		grid1.add(instrText, 0, 0, 2, 1);

		// Label in column 0, row 1
		Label label1 = new Label("OrderID:");
		grid1.add(label1, 0, 1);
		// TextField in column 1, row 1
		grid1.add(idField, 1, 1);

		Label label2 = new Label("Customer:");
		grid1.add(label2, 0, 2);
		grid1.add(customerField, 1, 2);
		
		Label label5 = new Label("Order date:");
		grid1.add(label5, 0, 3);
		grid1.add(dateField, 1, 3);

		Button createBtn = new Button("Create order");
		grid1.add(createBtn, 1, 4);
		
		//Controls for adding new orderline to order
		Text instrText2 = new Text("Choose product, give quantity and add to order");
		// In column 0, row 0, column span 2 and row span 1
		grid1.add(instrText2, 0, 5, 2, 1);

		// Label in column 0, row 1
		Label label3 = new Label("Product:");
		grid1.add(label3, 0, 6);
		// ComboBox in column 1, row 1
		grid1.add(productCmb, 1, 6);

		Label label4 = new Label("Quantity:");
		grid1.add(label4, 0, 7);
		grid1.add(quantityField, 1, 7);

		Button addBtn = new Button("Add");
		grid1.add(addBtn, 1, 8);

		//Controls to choose and remove order
		Text instrText3 = new Text("Choose order to view it. You can also remove selected order.");
		grid1.add(instrText3, 0, 9, 2, 1);
		Label label6 = new Label("Show order:");
		grid1.add(label6, 0, 10);
		grid1.add(orderidCmb, 1, 10);
		
		Button removeBtn = new Button("Remove order");
		grid1.add(removeBtn, 1, 11);
		
		//Grid1 left on borderpane
		mainpanel.setLeft(grid1);
		
		//TextArea center of borderpane
		textArea.setEditable(false);
		textArea.setFont(Font.font("Courier New", FontWeight.NORMAL, 12));
		mainpanel.setCenter(textArea);
		
		//Create menubar and File menu
		MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        menuBar.getMenus().add(menuFile);
        
        MenuItem startNew = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem saveAs = new MenuItem("Save As");
        MenuItem exit = new MenuItem("Exit");
        menuFile.getItems().addAll(startNew, open, saveAs, new SeparatorMenuItem(),  exit);
		mainpanel.setTop(menuBar);
	        
			
		Scene scene = new Scene(mainpanel, 900, 600);
		
		primaryStage.setTitle("Orders");		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Event handlers
		createBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				createNewOrder(e);
			}


		});
		
		addBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				addOrderLine(e);
			}
		});
		
		orderidCmb.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				showOrder(e);
			}
		});
		
		removeBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				removeOrder(e);
			}
		});
		
		saveAs.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				 File file = fileChooser.showSaveDialog(primaryStage);
                 if (file != null) {
                    saveOrdersToFile(file);
                 }

			}
		});
		
		open.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				 File file = fileChooser.showOpenDialog(primaryStage);
                 if (file != null) {
                    readOrdersFromFile(file);
                 }

			}
		});
		
		exit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				//System.exit(0);
				Platform.exit();
			}
		});
		
		startNew.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				//TODO
				idField.setText(null);
				customerField.setText(null);
				dateField.setText(null);
				quantityField.setText(null);
				textArea.setText(null);
				productCmb.setValue(null);
				orderidCmb.setValue(null);
				str1.delete(0, str1.length());
				//str2.delete(0, str2.length());
			}
		});

	}
	
	
	//Reads products and prices from text file
	public void readProducts() throws Exception{
		ClassLoader cl = this.getClass().getClassLoader();
		URL url = cl.getResource(productfile); 

		try(InputStream in = url.openStream(); BufferedReader input = new BufferedReader(new InputStreamReader(in))){
			String line;
			while((line = input.readLine()) != null) {
				double price = new Double(input.readLine());
				products.put(line,  price);
			}
			List<String> names = products.keySet().stream().sorted().collect(Collectors.toList());
			productCmb.setItems(FXCollections.observableArrayList(names));
		}
	}
	
	//Creates new order and adds it to collection
	private void createNewOrder(ActionEvent e) {
		//TODO
		int ID = Integer.parseInt(idField.getText());
		String cus = customerField.getText();
		Date date = new Date(dateField.getText());
		
		order.add(new Customer(ID, cus, date));
		
		orderidCmb.getItems().addAll(ID);
		str1.append(order.get(ID));
		orderCus2.put(ID, str1.toString());
		textArea.setText(str1.toString());
	}
	
	//Adds new orderline to current order.
	private void addOrderLine(ActionEvent e) {
		//TODO
		int id;
		double sum = 0;
		StringBuilder str2 = new StringBuilder();
		if (orderidCmb.getValue() != null)	{
			id = orderidCmb.getValue();
		}
		else {
			id = Integer.parseInt(idField.getText());
		}
		String pro = productCmb.getValue();
		double price = products.get(pro);
		int quan = Integer.parseInt(quantityField.getText());
		
		order.add(new OrderLine(id, pro, price, quan));
		
		str2.append("\nProducts\t\tPrice\tQuantity\tSum");
		for(OrderLine li: orderPro)	{
			if(li.getID() == id) {
				str2.append(li.toString());
				sum += li.total();
			}
		}
		str2.append("\nTotal price: " + sum);
		orderPro2.put(id, str2.toString());
		textArea.setText(str1.toString());
		textArea.appendText(str2.toString());
		//textArea.appendText("\n" + orderPro.toString());
		//textArea.appendText(orderCus.toString());
	}
	
	//Shows selected order
	private void showOrder(ActionEvent e) {
		//TODO
		try {
			int choice = orderidCmb.getValue();
			StringBuilder str3 = new StringBuilder();
			str1.delete(0, str1.length());
			str3.delete(0, str1.length());
			str1.append(orderCus2.get(choice));
			str3.append(orderPro2.get(choice));
			textArea.setText(str1.toString());
			textArea.appendText(str3.toString());
		}
		catch(NullPointerException ex2) {
			System.out.println("");
		}
	}
	
	//Removes selected order from collection
	private void removeOrder(ActionEvent e) {
		
		try	{
			Integer choice = orderidCmb.getValue();
			orderCus.remove(choice);
			orderCus2.remove(choice);
			orderPro2.remove(choice);
			textArea.setText(null);
			idField.setText(null);
			customerField.setText(null);
			dateField.setText(null);
			quantityField.setText(null);
			productCmb.setValue(null);
			orderidCmb.setValue(null);
			str1.delete(0, str1.length());
			orderidCmb.getItems().remove(choice.intValue());	//Somehow, I cannot remove it absolutely
			for(OrderLine list: orderPro) {
				if(list.getID() == choice) {
					orderPro.remove(list);
				}
			}
		}
		catch(NullPointerException | IndexOutOfBoundsException ex1) {
			System.out.println("");
		}
		
		
	}
	
	
	//Writes orders to file 
	private void saveOrdersToFile(File file) {
		System.out.println(file.getAbsolutePath());
		
		//TODO
	}
	
	//Reads orders from file
	private void readOrdersFromFile(File file) {
		//TODO
	}
	
	//Clears GUI controls
	private void clearControls() {
		idField.setText(null);
		customerField.setText(null);
		quantityField.setText(null);
		textArea.setText(null);;
		productCmb.getSelectionModel().clearSelection();
		orderidCmb.getSelectionModel().clearSelection();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
