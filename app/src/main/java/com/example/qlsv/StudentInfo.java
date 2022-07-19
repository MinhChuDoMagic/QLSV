package com.example.qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StudentInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info);

        Intent i = getIntent();

        Student student = (Student) i.getParcelableExtra("name_of_extra");

        TextView mssvTv = findViewById(R.id.student_id_tv);
        TextView nameTv = findViewById(R.id.student_full_name_tv);
        TextView emailTv = findViewById(R.id.student_email_tv);
        TextView dateTv = findViewById(R.id.student_date_tv);

        Button editBtn = findViewById(R.id.edit_btn);
        Button deleteBtn = findViewById(R.id.delete_btn);

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Student> listStudent = MainActivity.getListStudent();
                for(int j=0; j<listStudent.size(); j++){
                    Student i = listStudent.get(j);
                    if(i.getDate() == student.getDate() && i.getEmail() == student.getEmail()
                    && i.getMssv() == student.getMssv() && i.getName() == student.getName()){
                        listStudent.remove(j);

                        MainActivity main = new MainActivity();
                        main.setListStudent(listStudent);

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        getApplicationContext().startActivity(intent);
                    }
                }
            }
        });

        mssvTv.setText(student.getMssv());
        nameTv.setText(student.getName());
        emailTv.setText(student.getEmail());
        dateTv.setText(student.getDate());
    }
}
