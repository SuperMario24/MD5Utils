package com.example.saber.md5utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String md5 = MD5Utils.toMD5("Android".getBytes());
        Log.d(TAG,"Android:"+md5);



    }
}
