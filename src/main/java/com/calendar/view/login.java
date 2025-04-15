package com.calendar.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class login extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Cargamos el FXML
            Parent root = FXMLLoader.load(getClass().getResource("/com/calendar/login.fxml"));

            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/com/calendar/login.css").toExternalForm());

            primaryStage.setTitle("Iniciar Sesión");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args); // <-- lanza la app
    }
}
