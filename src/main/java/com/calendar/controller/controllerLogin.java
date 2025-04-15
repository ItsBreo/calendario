package com.calendar.controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controllerLogin {

    @FXML
    public PasswordField password;
    public TextField username;

    public void login(){
        String user = username.getText().trim();
        String pass = password.getText().trim();

        if (pass.isEmpty() || user.isEmpty()){
            mostrarError("Por favor, rellene los campos.");
            return;
        } 
        
        if (userService.verifyCredentials(user, pass)) {
            // Llamar al calendario
        } else {
            mostrarError("Usuario o contraseña incorrectos.");
        }

    }
    
    @FXML
    public void openRegister(ActionEvent event) {
        try {
            // Cargás la vista de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/calendar/register.fxml"));
            Parent root = loader.load();

            // Crear nueva escena y ventana
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            scene.getStylesheets().add(getClass().getResource("/com/calendar/register.css").toExternalForm());
            stage.setScene(scene);
            stage.setTitle("Registro");
            stage.show();

            // Cerrar la ventana actual de login
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
}



    public void mostrarError(String mensaje) {
    Alert alert = new Alert(AlertType.ERROR);
    alert.setTitle("Error de inicio de sesión");
    alert.setHeaderText(null);
    alert.setContentText(mensaje);
    alert.showAndWait();
    }

    


}
