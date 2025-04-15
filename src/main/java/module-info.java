module com.calendar {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires javafx.base;
    requires com.fasterxml.jackson.databind; 
    opens com.calendar to javafx.fxml;
    exports com.calendar;

    exports com.calendar.view;
    opens com.calendar.view to javafx.fxml; 
    opens com.calendar.model to com.fasterxml.jackson.databind;
    exports com.calendar.controller;
    opens com.calendar.controller to javafx.fxml;
}
