![Project Status](https://img.shields.io/badge/En%20desarrollo-%F0%9F%9A%A7-yellow)

![JSON](https://img.shields.io/badge/-JSON-000000?style=flat&logo=json&logoColor=white)
![Java](https://img.shields.io/badge/-Java-007396?style=flat&logo=java&logoColor=white)
![CSS](https://img.shields.io/badge/-CSS3-1572B6?style=flat&logo=css3)
![FXML](https://img.shields.io/badge/-FXML-14354C?style=flat&logo=java&logoColor=white)

# 📆 CalendarApp

**CalendarApp** es una aplicación de escritorio desarrollada en **Java** con **JavaFX**, diseñada para ofrecer una experiencia fluida y moderna en la gestión de recordatorios. Utiliza **Maven** como herramienta de construcción, y persiste los datos localmente en archivos **JSON**, garantizando un entorno totalmente offline.

---

## ✨ Características principales

- ✅ Registro de usuarios con validación de campos
- ✅ Inicio de sesión seguro con verificación de credenciales
- ✅ Alertas visuales informativas (errores, confirmaciones)
- ✅ Persistencia local de datos mediante Jackson (JSON)
- ✅ Interfaz gráfica estilizada con CSS personalizado
- ✅ Navegación fluida entre pantallas (Login / Registro / Inicio)
- ✅ Arquitectura clara basada en MVC (Modelo-Vista-Controlador)

---

## 🧪 Tecnologías utilizadas

- ☕ Java 17+
- 🎨 JavaFX + FXML
- 🧰 Maven
- 📦 Jackson (Serialización JSON)
- 🖌️ CSS personalizado
- 🧱 SceneBuilder (diseño visual de interfaces)

---

## 🗃️ Formato del archivo `users.json`

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

```

--- 
## Licencia
Este proyecto está licenciado bajo la [MIT License](LICENSE).


## 🚧 Estado del proyecto

- [x] Módulo de registro funcional  
- [x] Validación de campos obligatorios  
- [x] Persistencia en JSON  
- [ ] Implementación de edición/eliminación de recordatorios  
- [ ] Sistema de notificaciones programadas  
- [ ] Mejora de experiencia visual (animaciones, responsividad)
