package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act3);

        Intent intent = getIntent();
        //Bundle bund = intent.getExtras();
        Bundle bund = intent.getExtras();
        String user = bund.getString("KK");

        TextView lblSend = findViewById(R.id.lblSend);
        lblSend.setText("Hello , " + user);
    }
}
