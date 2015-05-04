package sample.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/data1.fxml"));
        primaryStage.setTitle("data");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(450);
        primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.getScene().getStylesheets().add("../style/style.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
