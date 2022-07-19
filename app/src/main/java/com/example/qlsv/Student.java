package com.example.qlsv;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Student implements Parcelable {
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

    protected Student(Parcel in) {
        mssv = in.readString();
        name = in.readString();
        email = in.readString();
        date = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(mssv);
        parcel.writeString(name);
        parcel.writeString(email);
        parcel.writeString(date);
    }
}
