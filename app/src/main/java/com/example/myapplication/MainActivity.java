package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private View.OnClickListener btnNew_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Act2.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btnSend_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bund = new Bundle();
            Intent intent = new Intent(MainActivity.this, Act3.class);
            intent.putExtra("KK", "Jeff");
            startActivity(intent);

        }
    };
    private View.OnClickListener btnReceive_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivityForResult(new Intent(MainActivity.this,Act4.class),606);

        }
    };
    private View.OnClickListener btnList_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,ActList.class));
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==606){
            if (data==null){
                lblTitle.setText("沒有管理員");
                return;
            }
            if (data.getExtras()==null){
                lblTitle.setText("沒有包裹");
                return;
            }
            String result=data.getExtras().getString("JJ");
            lblTitle.setText("你的選擇是:"+result);
        }
        else{
            lblTitle.setText("沒有對應到問題");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity_Demo", "Main的onStart()事件被觸發");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity_Demo", "Main的onStop()事件被觸發");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity_Demo", "Main的onPause()事件被觸發");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity_Demo", "Main的onResume()事件被觸發");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity_Demo", "Main的onRestart()事件被觸發");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity_Demo", "Main的onDestroy()事件被觸發");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity_Demo", "Main的onCreate()事件被觸發");
        InitialComponent();

    }

    private void InitialComponent() {
        btnNew=findViewById(R.id.btnNew);
        btnNew.setOnClickListener(btnNew_click);
        btnSend=findViewById(R.id.btnSend);
        btnSend.setOnClickListener(btnSend_click);
        btnReceive=findViewById(R.id.btnReceive);
        btnReceive.setOnClickListener(btnReceive_click);
        btnList=findViewById(R.id.btnList);
        btnList.setOnClickListener(btnList_click);
        lblTitle=findViewById(R.id.lblTitle);
        lblSend=findViewById(R.id.lblSend);


    }
    Button btnNew;
    Button btnSend;
    Button btnReceive;
    Button btnList;
    TextView lblTitle;
    TextView lblSend;

}
