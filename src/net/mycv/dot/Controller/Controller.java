package net.mycv.dot.Controller;

import javafx.event.ActionEvent;
import net.mycv.dot.Main.Main;

import java.io.IOException;

/**
 * Created by Nebo on 16.06.2016.
 */
public class Controller {

    public void goUkr(ActionEvent event) throws IOException {
        Main.Ukr();
    }

    public void goEnglish(ActionEvent event)throws IOException {
        Main.English();
    }

    public void goMainMenu(ActionEvent event) throws IOException {
            Main.mainWindow();
        }
}

