package net.mycv.dot.Main;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
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
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/main.fxml"));
        window.setTitle("StartMenu");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        window.setScene(scene);
        window.show();


    }

    public static void mainWindow() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/main.fxml"));
        window.setTitle("StartMenu");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        window.setMinWidth(700);
        window.setMinHeight(500);
        window.setResizable(false);
        window.setScene(scene);
        window.show();

    }

    public static void Ukr()throws IOException{
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("../View/UkrWindow.fxml"));
        window.setTitle("StartMenu");
        window.setScene(new Scene(bp));
        window.show();
    }

    public static void English ()throws IOException{
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/EnglishWindow.fxml"));
        window.setTitle("StartMenu");
        window.setScene(new Scene(bp));
        window.setMinWidth(500);
        window.setMinHeight(600);
        window.setResizable(false);
        window.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
