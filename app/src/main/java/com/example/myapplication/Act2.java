package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class Act2 extends Activity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity_Demo", "Act2的onStart()事件被觸發");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity_Demo", "Act2的onStop()事件被觸發");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity_Demo", "Act2的onPause()事件被觸發");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity_Demo", "Act2的onResume()事件被觸發");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity_Demo", "Act2的onRestart()事件被觸發");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity_Demo", "Act2的onDestroy()事件被觸發");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);
        Log.i("Activity_Demo","Act2的onCreate()事件被觸發");
    }
}
