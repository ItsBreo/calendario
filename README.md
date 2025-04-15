# 🗓️ CalendarApp

**CalendarApp** es una aplicación de escritorio desarrollada en **Java** utilizando **JavaFX** para la interfaz gráfica y **Maven** como herramienta de construcción. El proyecto permite a los usuarios **registrarse, iniciar sesión y gestionar recordatorios**, todo almacenado de forma local en un archivo JSON.

---

## ✨ Características

- ✅ Registro de nuevos usuarios con validación de campos obligatorios
- ✅ Inicio de sesión con verificación de credenciales
- ✅ Alerta visual para errores y confirmaciones (usando `Alert` de JavaFX)
- ✅ Persistencia de datos en JSON usando Jackson
- ✅ Interfaz moderna personalizada con CSS
- ✅ Separación clara entre lógica, vista y modelo
- ✅ Navegación entre pantallas (login → registro → login)

---

## 🧠 Tecnologías usadas

- Java 17+
- JavaFX
- Maven
- Jackson (para manejo de JSON)
- FXML + SceneBuilder
- CSS personalizado para JavaFX

---

## 📁 Estructura del proyecto

├── pom.xml
├── README.md
├── src
│   └── 📁 main
│       ├── 📁 java
│       │   ├── 📁 com
│       │   │   └── 📁 calendar
│       │   │       ├── 📁 controller
│       │   │       │   ├── controllerCalendar.java
│       │   │       │   ├── controllerLogin.java
│       │   │       │   ├── controllerRegister.java
│       │   │       │   ├── userService.java
│       │   │       │   └── usersWrapper.java
│       │   │       ├── MainApp.java📁
│       │   │       ├── 📁 model
│       │   │       │   ├── reminder.java
│       │   │       │   └── users.java
│       │   │       └── 📁 view
│       │   │           ├── login.java
│       │   │           └── register.java
│       │   └── module-info.java
│       └── 📁 resources
│           └── 📁 com
│               └── 📁 calendar
│                   ├── calendar.css
│                   ├── calendar.fxml
│                   ├── 📁 data
│                   │   └── users.json
│                   ├── login.css
│                   ├── login.fxml
│                   ├── register.css
│                   └── register.fxml


---

## 🗂️ Formato de datos JSON

Este es el formato básico del archivo `users.json`:

```json
{
  "usuarios": [
    {
      "username": "ejemplo",
      "password": "1234",
      "email": "ejemplo@mail.com",
      "recordatorios": [
        {
          "titulo": "Cita médica",
          "descripcion": "Lunes a las 10am",
          "fecha": "2025-04-20T10:00:00"
        }
      ]
    }
  ]
}
