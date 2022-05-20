package com.example.demo.controller;

import java.util.Objects;

public class User {
    String name;
    String id;
    String school;
    int so;

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public String getId() {
        System.out.println("getId");
        return id;
    }

    public void setId(String id) {
        System.out.println("setId");
        this.id = id;
    }

    public String getSchool() {
        System.out.println("getSchool");
        return school;
    }

    public void setSchool(String school) {
        System.out.println("setSchool");
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return so == user.so &&
                Objects.equals(name, user.name) &&
                Objects.equals(id, user.id) &&
                Objects.equals(school, user.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, school, so);
    }
}
