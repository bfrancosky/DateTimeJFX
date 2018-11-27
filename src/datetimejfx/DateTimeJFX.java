/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimejfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Brian
 */
public class DateTimeJFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        /*
        TextField datefield = new TextField();
        
        
        
        
        Button btn = new Button();
        btn.setText("Confirm");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println(datefield.getText());
            }
        });
        
        */
        GridPane grid = new GridPane();
        //StackPane root = new StackPane();
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Calendar Date Picker");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 3, 1);

        Label enterDate = new Label("Enter Date:");
        grid.add(enterDate, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 0, 2, 3, 1);
        
        //DatePicker datepicker = new DatePicker();
        //grid.add(datepicker, 0, 2, 3, 1);

        
        //grid.setGridLinesVisible(true);
        
        /*
        Button btn = new Button("OK");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 3);
        */
        
        final Label tableLabel = new Label("Calendar");
        tableLabel.setFont(new Font("Arial", 20));
        
        
        TableView table = new TableView();
        
        table.setEditable(true);
        
        
        TableColumn monCol = new TableColumn("S");
        TableColumn tueCol = new TableColumn("M");
        TableColumn wedCol = new TableColumn("T");
        TableColumn thuCol = new TableColumn("W");
        TableColumn friCol = new TableColumn("T");
        TableColumn satCol = new TableColumn("F");
        TableColumn sunCol = new TableColumn("S");
        
        monCol.setMaxWidth(30);
        tueCol.setMaxWidth(30);
        wedCol.setMaxWidth(30);
        thuCol.setMaxWidth(30);
        friCol.setMaxWidth(30);
        satCol.setMaxWidth(30);
        sunCol.setMaxWidth(30);
        
        
        table.getColumns().addAll(monCol, tueCol, wedCol, thuCol, friCol, satCol, sunCol);
        
        grid.add(table, 0, 3, 3, 1);
        
        
        
        //root.getChildren().add(datefield);
        //root.getChildren().add(btn);
        //grid.getChildren().add(datefield);
        //grid.getChildren().add(btn);
        
        
        //Scene scene = new Scene(root, 300, 250);
        Scene scene = new Scene(grid, 250, 350);
        
        
        primaryStage.setTitle("Calendar Date Picker");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
