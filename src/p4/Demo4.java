package p4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Created by carguell on 3/17/2016.
 */

public class Demo4 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 10, 10, 10)); //makes sure that the text isnt on the border
        pane.setHgap(5);  // Makes sure that the labels and txt boxes arnt jammed next to each other
        pane.setVgap(5);  // ^^ same but verticly

        //define the text field
        TextField tfFirstName = new TextField();

        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);

        TextField tfLastName = new TextField();

        pane.getChildren().addAll(
                new Label("First Name: "), tfFirstName,
                new Label("M.I: "), tfMI,
                new Label("Last Name: "), tfLastName );

        //pane.getChildren().addAll(tfMI, new Label("Last Name: "),
        //   new TextField());

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("My third JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}