package com.example.qlsv;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentListViewAdapter extends BaseAdapter {

    ArrayList<Student> listStudent;
    Context context;
    StudentListViewAdapter adapter;

    public StudentListViewAdapter(ArrayList<Student> listStudent, Context context) {
        this.listStudent = listStudent;
        this.context = context;
        this.adapter = this;
    }

    @Override
    public int getCount() {
        return listStudent.size();
    }

    @Override
    public Object getItem(int i) {
        return listStudent.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //convertView là View của phần tử ListView, nếu convertView != null nghĩa là
        //View này được sử dụng lại, chỉ việc cập nhật nội dung mới
        //Nếu null cần tạo mới

        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.student_list, null);
        } else viewProduct = convertView;

        //Bind sữ liệu phần tử vào View
        Student student = (Student) getItem(position);
        ((TextView) viewProduct.findViewById(R.id.student_id_tv)).setText(student.getMssv());
        ((TextView) viewProduct.findViewById(R.id.student_full_name_tv)).setText(student.getName());

        viewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, StudentInfo.class);
                intent.putExtra("name_of_extra", student);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
                adapter.notifyDataSetChanged();
            }
        });

        return viewProduct;
    }



}
