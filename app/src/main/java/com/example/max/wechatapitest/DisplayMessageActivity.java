package com.example.max.wechatapitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("com.example.myfirstapp.MESSAGE");

        TextView txtView = (TextView) findViewById(R.id.lblMessage);
        txtView.setText(message);
    }
}
