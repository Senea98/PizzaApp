package com.andoidapp.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ComandActivity extends AppCompatActivity {
    String text;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comand);
        Intent intent = getIntent();
        text = intent.getStringExtra("text");
        textView = findViewById(R.id.CommandtextView);
        textView.setText(text);
    }
}
