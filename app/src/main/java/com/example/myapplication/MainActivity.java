package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float value;
    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void sendmessage(View view)
        {
            EditText editText=findViewById(R.id.user_email);
            String message1=editText.getText().toString();
            rb=(RatingBar) findViewById(R.id.ratingBar);
            rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    value=rating;
                }
            });
            EditText feedback=findViewById(R.id.user_feedback);
            String message2=feedback.getText().toString();
            Intent intent=new Intent(this,feedback_display.class);
            intent.putExtra("EXTRA_MESSAGE",message1);
            intent.putExtra("Rating",value);
            intent.putExtra("feedback message",message2);

            startActivity(intent);
        }


    }


