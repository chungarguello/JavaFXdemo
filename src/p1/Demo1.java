package p1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


/*
 * Created by carguell on 3/17/2016.
 */
public class Demo1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 300);
        primaryStage.setTitle("My first JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}