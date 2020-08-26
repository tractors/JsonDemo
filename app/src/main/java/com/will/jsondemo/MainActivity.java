package com.will.jsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
//        String jsonStudent = "{\"age\":20,\"name\":\"Jack\"}";
//        Student student = gson.fromJson(jsonStudent,Student.class);
        Student student = new Student("Tom",20,new Score(80,90,99));
        Student student1 = new Student("Lisa",21,new Score(90,96,89));
        String jsonStu = gson.toJson(student);

        Student[] students = {student,student1};

        String jsonStus = gson.toJson(students);

        String fromJson = "{\n" +
                "  \"age\": 20,\n" +
                "  \"name\": \"Tom\",\n" +
                "  \"score\": {\n" +
                "    \"Chinese\": 99,\n" +
                "    \"English\": 90,\n" +
                "    \"math\": 80\n" +
                "  }\n" +
                "}";
        Student stuOk = gson.fromJson(fromJson,Student.class);

        String fromJsonArray = "[\n" +
                "  {\n" +
                "    \"age\": 20,\n" +
                "    \"name\": \"Tom\",\n" +
                "    \"score\": {\n" +
                "      \"Chinese\": 99,\n" +
                "      \"English\": 90,\n" +
                "      \"math\": 80\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"age\": 21,\n" +
                "    \"name\": \"Lisa\",\n" +
                "    \"score\": {\n" +
                "      \"Chinese\": 89,\n" +
                "      \"English\": 96,\n" +
                "      \"math\": 90\n" +
                "    }\n" +
                "  }\n" +
                "]";

        Student[] arrayStudent = gson.fromJson(fromJsonArray,Student[].class);

        List<Student> studentList = new ArrayList<>();

        Type typeStudents = new TypeToken<List<Student>>(){}.getType();

        studentList = gson.fromJson(fromJsonArray,typeStudents);

    }
}