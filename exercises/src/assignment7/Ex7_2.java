package assignment7;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import assignment4.Distribution;
import assignment4.Ex4_2b;
import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.chart.*;
import javafx.scene.chart.XYChart.*;
public class Ex7_2 extends Application{

	public void start(Stage primaryStage) throws Exception	{
		primaryStage.setTitle("Assignment 7.2");
		
		Distribution distro = new Distribution(0, 5);
		String[] grades = {"0", "1", "2", "3", "4", "5"};
		int[] freq = {0,0,0,0,0,0};
		
		BorderPane root = new BorderPane();
		
		FlowPane top = new FlowPane();
        top.setAlignment(Pos.CENTER);
        top.setPadding(new Insets(5, 5, 5, 5));
        top.setHgap(10);
        
        Label label = new Label("Grade: ");
        TextField txt = new TextField();
        Button btn = new Button("Insert");
        
        top.getChildren().add(label);
        top.getChildren().add(txt);
        top.getChildren().add(btn);
        
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> bc = new BarChart<>(xAxis,yAxis);
        
        bc.setTitle("Grade Distribution");
        bc.setLegendVisible(false);
        //bc.setAnimated(false);
        xAxis.setLabel("Grade");
        yAxis.setLabel("Frequency");
        
        XYChart.Series<String, Number> series = new Series<>();
        
        root.setTop(top);
        root.setCenter(bc);
    	bc.getData().add(series);
    	for (int i = 0; i < grades.length; i++)	{
    		//series.getData().add(new Data<>(grades[i],freq[i]));
    		series.getData().add(new XYChart.Data<String, Number>(grades[i],freq[i]));
    	}
    	
        Scene scene = new Scene(root, 700, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	
        	public void handle(ActionEvent e) {
        		
        		try	{
        			int value = Integer.parseInt(txt.getText());
            		
        			if(value>=0 && value<=5) {
        				distro.insertValue(value);;
                		
                    	for (int k = 0; k < freq.length; k++)	{
                    		freq[k] = distro.frequency(k);
                    	}
                    		
                    	//for (int i = 0; i < grades.length; i++)	{
                    		//series.getData().add(new Data<>(grades[i],freq[i]));
                    		series.getData().add(new XYChart.Data<String, Number>(grades[value],freq[value]));
                    	//}
                    		
        			}
        			
        			else 	{
        				Alert alert2 = new Alert(AlertType.ERROR, "Grade must between 0 to 5!");
        				alert2.showAndWait();
        			}
        			
        		}
        		catch(NumberFormatException ex1) {
					Alert alert = new Alert(AlertType.ERROR, "Check your input!");
					alert.showAndWait();
				}
	
        	}
        	
        });
        
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
