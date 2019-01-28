package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.TextView;

public class feedback_display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_display);
        Intent intent =getIntent();
        String message1=intent.getStringExtra("EXTRA_MESSAGE");
        Float rating= (Float) intent.getFloatExtra("Rating",0);
        String message2=intent.getStringExtra("feedback message");
        TextView editText=findViewById(R.id.email);
        editText.setText(message1);
        String RATING1=String.valueOf(rating);
        TextView editText1=findViewById(R.id.rating);
        editText1.setText(RATING1);
        TextView editText2=findViewById(R.id.feedback);
        editText2.setText(message2);

    }
}
