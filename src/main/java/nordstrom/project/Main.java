package nordstrom.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import nordstrom.project.Lesson_02_Classes.Person;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // launch() is used to start the JavaFX application.
        // Since this project doesn't use JavaFX, we can comment it out.
        //launch();

        // The main method is the entry point of a Java program.
        // It is the first method that is called when a Java program is executed.
        // No other code in any other file will be executed unless it is called from the main method or from a method that is called from the main method.
        // The launch method is called from the main method.
        // From the launch method the start method is called which is where the JavaFX application is started.
        // Most of your code in JavaFX applications will be written in the controller files.
        // The controller files are called from View (fxml files) or from the Initialize method inside your controllers.
    }
}