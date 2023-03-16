package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView answers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        answers = (TextView)findViewById(R.id.textAnswers);


        Intent intent = getIntent();

        String name = intent.getStringExtra("Name");
        String group = intent.getStringExtra("Group");
        String age = intent.getStringExtra("Age");

        answers.setText("Имя студента: " + name + " " + "Группа: " + group + " " + "Возраст: " + age + " " );
    }
}