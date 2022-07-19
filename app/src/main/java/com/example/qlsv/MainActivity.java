package com.example.qlsv;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    static ArrayList<Student> listStudent;
    StudentListViewAdapter studentListViewAdapter;
    ListView listViewStudent;

    public static ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listStudent = new ArrayList<Student>();
        listStudent.add(new Student("20194115", "Chu Nhat Minh", "minh@gmail.com", "1/7/2001"));
        listStudent.add(new Student("20194116", "Nguyen Van Hau", "hau@gmail.com", "1/7/2001"));
        listStudent.add(new Student("20194117", "Phan Tan Tai", "tai@gmail.com", "1/7/2001"));

        studentListViewAdapter = new StudentListViewAdapter(listStudent, getApplicationContext());
        listViewStudent = findViewById(R.id.list_Student);
        listViewStudent.setAdapter(studentListViewAdapter);
    }
}