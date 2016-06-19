package net.mycv.dot.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import net.mycv.dot.Main.Main;

import java.io.IOException;


public class Controller {

    public void goUkr(ActionEvent event) throws IOException {
        Main.Ukr();
    }

    public void goEnglish(ActionEvent event) throws IOException {
        Main.English();
    }

    public void goMainMenu(ActionEvent event) throws IOException {
        Main.mainWindow();
    }

    public void goObject(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane AP = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/Objective.fxml"));
        Scene scene = new Scene(AP);
        stage.setTitle("Objective");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(160);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();

    }

    public void goSummary(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane AP = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/Summary.fxml"));
        Scene scene = new Scene(AP);
        stage.setTitle("Summary");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(160);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();

    }

    public void goExperience(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane AP = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/Experience.fxml"));
        Scene scene = new Scene(AP);
        stage.setTitle("Experience");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(160);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }

    public void goCourse(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane AP = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/Course.fxml"));
        Scene scene = new Scene(AP);
        stage.setTitle("Courses, Trainings, Certification");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(160);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();

    }
    public void goLanguage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane AP = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/Language.fxml"));
        Scene scene = new Scene(AP);
        stage.setTitle("Language");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(160);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }
    public void goEducation(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane AP = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/Education.fxml"));
        Scene scene = new Scene(AP);
        stage.setTitle("Education");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(160);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }
    public void goAdditional(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        AnchorPane AP = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/Additional.fxml"));
        Scene scene = new Scene(AP);
        stage.setTitle("Additional Information");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(160);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }
}
