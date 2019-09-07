package com.example.taskmanager;

import java.io.Serializable;

public class Task implements Serializable {
    public String title;
    public String description;
    public boolean isDone;

    public Task(String title, String description, boolean isDone) {
        this.title = title;
        this.description = description;
        this.isDone = isDone;
    }
 public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }





}
