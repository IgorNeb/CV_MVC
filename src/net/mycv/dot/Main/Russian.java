package net.mycv.dot.Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Russian{

    static Stage win;

    public static void ObjectRu() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/ObjectiveRu.fxml"));
        win.setTitle("Objective");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();

    }

    public static void SummaryRu() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/SummaryEu.fxml"));
        win.setTitle("Summary");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();

    }

    public static void ExperienceRu() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/ExperienceRu.fxml"));
        win.setTitle("Experience");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();

    }

    public static void CourseRu() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/CourseRu.fxml"));
        win.setTitle("Courses, Trainings, Certification");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();
    }

    public static void LanguageRu() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/LanguageRu.fxml"));
        win.setTitle("Language");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();
    }

    public static void EducationRu() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/EducationRu.fxml"));
        win.setTitle("Education");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add("/net/mycv/dot/Style/mystyle.css");
        win.setMinWidth(600);
        win.setMinHeight(160);
        win.setResizable(false);
        win.setScene(scene);
        win.show();
    }

    public static void AdditionalRu() throws IOException {
        AnchorPane bp = (AnchorPane) FXMLLoader.load(Main.class.getResource("../View/AdditionalRu.fxml"));
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