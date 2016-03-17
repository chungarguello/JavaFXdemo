package p5;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Created by carguell on 3/17/2016.
 */


public class Demo5 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10)); //makes sure that the text isnt on the border
        pane.setHgap(5);  // Makes sure that the labels and txt boxes arnt jammed next to each other
        pane.setVgap(5);  // ^^ same but verticly

        //define the text field
        TextField tfFirstName = new TextField();

        TextField tfMI = new TextField();

        TextField tfLastName = new TextField();

        //place the nodes in the pane
        pane.add(new Label("First Name: "), 0, 0);
        pane.add(tfFirstName, 1, 0);
        pane.add(new Label("M.I: "), 0,1);
        pane.add(tfMI, 1, 1);
        pane.add(new Label("Last Name: "), 0,2);
        pane.add(tfLastName, 1, 2);

        //add a button
        Button btAdd = new Button("ADD NAME");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);//alligns the button to the right

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("My third JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}