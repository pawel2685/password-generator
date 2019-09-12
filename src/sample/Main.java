package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/main.fxml"));
        primaryStage.setTitle("Password Generator");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setMaxWidth(610.0);
        primaryStage.setMaxHeight(450.0);
        primaryStage.setMinWidth(600.0);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
