package p2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * Created by carguell on 3/17/2016.
 */
public class Demo2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Button btOK = new Button("OK");
        Pane pane = new StackPane(); //stack pane will put one or more objects in the center,
        //making the most recent overlap the older
        //regular pane will start top left next objects on its right
        pane.getChildren().add(new Button("Very Very OK"));
        pane.getChildren().add(new Button("Very OK"));

        Scene scene = new Scene(pane, 200, 50);

        primaryStage.setTitle("My second JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}