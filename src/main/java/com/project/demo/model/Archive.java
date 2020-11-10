package com.project.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String size;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDownloads() {
        return Downloads;
    }

    public void setDownloads(String downloads) {
        Downloads = downloads;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String firstName;

    private String lastName;

    private String Downloads;

    private String date;

    private String path;

    public Archive(String name, String size, String firstName, String lastName, String downloads, String date, String path) {
        this.name = name;
        this.size = size;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Downloads = downloads;
        this.date = date;
        this.path = path;
    }

    public Archive() {

    }

}
