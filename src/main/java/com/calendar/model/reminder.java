package com.calendar.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class reminder {
    private String title;
    private String description;
    private LocalDate date;
    private LocalTime hour;

    reminder(String title, String description, LocalDate date, LocalTime hour){
        this.title = title;
        this.description = description;
        this.date = date;
        this.hour = hour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Título: "+ getTitle()+" Descripción: "+getDescription()+" Día: "+getDate()+" Hora: "+getHour();
    }
    
}