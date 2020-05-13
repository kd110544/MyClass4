package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Act4 extends AppCompatActivity {

    private View.OnClickListener btnYes_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MakeMyChoice("贊成");

        }
    };
    private View.OnClickListener btnNo_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MakeMyChoice("不贊成");
        }
    };

    private void MakeMyChoice(String p) {
        Bundle bund = new Bundle();
        bund.putString("JJ", p);
        Intent intent = new Intent();
        intent.putExtras(bund);

        setResult(0,intent);
        finish();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act4);
        InitialComponent();
    }

    private void InitialComponent() {
        btnYes=findViewById(R.id.btnYes);
        btnYes.setOnClickListener(btnYes_click);
        btnNo=findViewById(R.id.btnNo);
        btnNo.setOnClickListener(btnNo_click);
        lblView=findViewById(R.id.lblView);
    }
    Button btnYes;
    Button btnNo;
    TextView lblView;
}
