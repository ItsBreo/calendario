package com.calendar.controller;

import com.calendar.model.users;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class userService {

    public static final String JSON_PATH = "src/main/resources/com/calendar/data/users.json"; // Ruta donde tengas el JSON

    public static boolean verifyCredentials(String username, String password) {
        try {
            ObjectMapper mapper = new ObjectMapper(); // Lee JSON como objetos Java
            usersWrapper data = mapper.readValue(new File(JSON_PATH), usersWrapper.class); // El fichero JSON se convierte a un objeto en Java
            List<users> usuarios = data.getUsers(); // Se pasa a una lista de usuarios para poder recorrerla

            for (users u : usuarios) {
                if (u.getUsername().equals(username) && u.getPassword().equals(password)) { // En toda la lista debemos encontrar el usuario y contraseña
                    return true; // Credenciales válidas
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false; // No se encontró el usuario o la contraseña no coincide
    }

    public static boolean registerUser(users newUser) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            usersWrapper wrapper;

            File file = new File(JSON_PATH);

            if (file.exists()) {
                wrapper = mapper.readValue(file, usersWrapper.class);
            } else {
                wrapper = new usersWrapper(); // si no existe, creamos una lista nueva
            }

            List<users> usuarios = wrapper.getUsers();

            // Verifica que no exista otro usuario con el mismo nombre
            for (users u : usuarios) {
                if (u.getUsername().equals(newUser.getUsername())) {
                    return false; // usuario ya existe
                }
            }

            usuarios.add(newUser);
            wrapper.setUsers(usuarios);
            mapper.writeValue(file, wrapper); // Guardamos de nuevo el JSON

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}

