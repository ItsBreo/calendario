package com.calendar.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class register extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carga el FXML del registro
            Parent root = FXMLLoader.load(getClass().getResource("/com/calendar/register.fxml"));

            // Crea la escena
            Scene scene = new Scene(root);

            // Agrega CSS
            scene.getStylesheets().add(getClass().getResource("/com/calendar/register.css").toExternalForm());

            // Configura la ventana
            primaryStage.setTitle("Registro");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método main para lanzarlo directamente
    public static void main(String[] args) {
        launch(args);
    }
}
