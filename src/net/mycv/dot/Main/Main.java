package net.mycv.dot.Main;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;





import java.io.IOException;

/**
 * Created by Nebo on 16.06.2016.
 */
public class Main extends Application {
    static Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("../View/MainWindow.fxml"));
        window.setTitle("StartMenu");
        window.setScene(new Scene(bp));
        window.show();

    }

    static void mainWindow() throws IOException {
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("../View/MainWindow.fxml"));
        window.setTitle("StartMenu");
        window.setScene(new Scene(bp));
        window.show();

    }

    public static void Ukr()throws IOException{
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("../View/UkrWindow.fxml"));
        window.setTitle("StartMenu");
        window.setScene(new Scene(bp));
        window.show();
    }

    public static void English ()throws IOException{
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("../View/EnglishWindow.fxml"));
        window.setTitle("StartMenu");
        window.setScene(new Scene(bp));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
