package com.example.lab_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Lab_3_3_1 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_3_3_1);
        Bundle bund=getIntent().getExtras();
        tv=findViewById(R.id.textView3);
        tv.setText(bund.getString("data"));
    }
}