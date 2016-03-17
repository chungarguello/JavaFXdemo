package p3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/*
 * Created by carguell on 3/17/2016.
 */

public class Demo3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();



        Circle circle = new Circle(100, 100, 50);
        //circle.setCenterX(100);  can be put inside parameters
        //circle.setCenterY(100);
        //circle.setRadius(50);    can be put inside parameters
        circle.setStroke(Color.BLUEVIOLET);     // stroke is the border line of the circle
        circle.setFill(Color.BEIGE);           //f;ll is the color inside the circle

        Circle circle1 = new Circle(200,200,50);

        Circle circle4 = new Circle(200,200,90,Color.MEDIUMVIOLETRED.darker());
        circle.centerYProperty().bind(pane.widthProperty().divide(4));
        circle.centerXProperty().bind(pane.heightProperty().divide(4));


        pane.getChildren().addAll(circle, circle4);
        //pane.getChildren().add(circle);      // in one line ^
        //pane.getChildren().add(circle1);     // in one line ^

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("My third JavaFX Project");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}