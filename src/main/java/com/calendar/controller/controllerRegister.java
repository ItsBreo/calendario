package com.calendar.controller;

import com.calendar.model.users;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controllerRegister {

    @FXML
    public TextField username;
    @FXML
    public PasswordField password;
    @FXML
    public TextField email;

    @FXML
    public void addUser(ActionEvent event) {
        String user = username.getText().trim();
        String pass = password.getText().trim();
        String mail = email.getText().trim();

        if (user.isEmpty() || pass.isEmpty() || mail.isEmpty()) {
            showError("Por favor, complete todos los campos.");
            return;
        }

        users newUser = new users(user, pass, mail);
        boolean registrado = userService.registerUser(newUser);

        if (registrado) {
            showMessage("Usuario registrado con éxito.");
            returnToLogin(event);
        } else {
            showError("El nombre de usuario ya existe.");
        }
    }

    private void returnToLogin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/calendar/login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/com/calendar/login.css").toExternalForm());

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Iniciar sesión");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            showError("Error al volver a la pantalla de login.");
        }
    }

    private void showError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Registro fallido");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void showMessage(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro exitoso");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
    }
}