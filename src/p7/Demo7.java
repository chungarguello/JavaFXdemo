package p7;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * Created by carguell on 3/17/2016.
 */
public class Demo7 extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
            pane.setTop(new CustomPane("Top"));
            pane.setRight(new CustomPane("Right"));
            pane.setBottom(new CustomPane("Bottom"));
            pane.setLeft(new CustomPane("Left"));
            pane.setCenter(new CustomPane("Center"));

            Scene scene = new Scene(pane);
            primaryStage.setTitle("JavaFX Project7");
            primaryStage.setScene(scene);
            primaryStage.setResizable(true);
            primaryStage.show();

    }

}
 class CustomPane extends StackPane{
     public CustomPane (String title){
         getChildren().add(new Label(title));
         setStyle("-fx-border-color: Red");
         setPadding(new Insets(10, 10, 10, 10));
     }
 }
