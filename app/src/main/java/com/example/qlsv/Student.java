package com.example.qlsv;

public class Student {
    public Student(String mssv, String name, String email, String date) {
        this.mssv = mssv;
        this.name = name;
        this.email = email;
        this.date = date;
    }

    String mssv;
    String name;
    String email;
    String date;

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
