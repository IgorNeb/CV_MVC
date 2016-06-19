package net.mycv.dot.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class English {
    static Stage win;

    public static void Object() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Objective.fxml"));
        win.setTitle("Objective");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();

    }

    public static void Summary() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Summary.fxml"));
        win.setTitle("Summary");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();

    }

    public static void Experience() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Experience.fxml"));
        win.setTitle("Experience");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();

    }

    public static void Course() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Course.fxml"));
        win.setTitle("Courses, Trainings, Certification");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();
    }
    public static void Language() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Language.fxml"));
        win.setTitle("Language");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();
    }
    public static void Education() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Education.fxml"));
        win.setTitle("Education");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();
    }
    public static void Additional() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/Additional.fxml"));
        win.setTitle("Additional");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();
    }
}
