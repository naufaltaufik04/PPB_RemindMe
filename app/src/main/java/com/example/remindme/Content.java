package com.example.remindme;

import java.util.Date;

public class Content {
    private String title;
    private String details;
    private String difficulty;
    private Date dueDate;
    private Date today;

    public Content(String title, String details, String difficulty, Date dueDate, Date today) {
        this.title = title;
        this.details = details;
        this.difficulty = difficulty;
        this.dueDate = dueDate;
        this.today = today;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDificulty() {
        return difficulty;
    }

    public void setDificulty(String dificulty) {
        this.difficulty = dificulty;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}