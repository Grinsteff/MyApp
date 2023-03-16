package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText group;
    EditText age;
    Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.editAnswer1);
        group = (EditText)findViewById(R.id.editAnswer2);
        age = (EditText)findViewById(R.id.editAnswer3);
        btn_start = (Button)findViewById(R.id.btn_start);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Потдвердить", Snackbar.LENGTH_LONG);
                StartActivity2();
            }
        });
    }

    private void StartActivity2()
    {
        Intent intent = new Intent (this, Activity2.class);
        intent.putExtra("Name", name.getText().toString());
        intent.putExtra("Group", group.getText().toString());
        intent.putExtra("Age", age.getText().toString());
        startActivity(intent);
    }
}