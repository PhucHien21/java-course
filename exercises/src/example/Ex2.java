package example;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class Ex2 extends Application{

	@Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
		
        //FlowPane at the top of window has two TextFields, ComboBox and Button
        FlowPane topbar = new FlowPane();
        topbar.setAlignment(Pos.CENTER);
        topbar.setPadding(new Insets(5, 5, 5, 5));
        topbar.setHgap(10);
		
        Button calcButton = new Button("Calculate");
        ObservableList<String> options = 
                FXCollections.observableArrayList("+", "-", "*", "/");
        ComboBox<String> comboBox = new ComboBox<>(options);
        comboBox.setStyle("-fx-font: bold italic 12pt \"Arial\"");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        topbar.getChildren().add(textField1);
        topbar.getChildren().add(comboBox);
        topbar.getChildren().add(textField2);
        topbar.getChildren().add(calcButton);
		
        root.setTop(topbar);
		
        //TextArea in the center fills the available space
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        root.setCenter(textArea);
		
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Calculator");
		
        primaryStage.setScene(scene);
        primaryStage.show();	
		
        calcButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                double val1 = Double.parseDouble(textField1.getText());
                double val2 = Double.parseDouble(textField2.getText());
                String operator = comboBox.getValue();
                String result = val1 + " " + operator + " " + val2 + " = ";
                
                switch(operator) {
                    case "+": result += (val1 + val2); break;
                    case "-": result += (val1 - val2); break;
                    case "*": result += (val1 * val2); break;
                    case "/": result += (val1 / val2); break;
                }
                textArea.appendText(result + "\n");
            }
        });
    }
	public static void main(String[] args) {
		launch(args);

	}

}
