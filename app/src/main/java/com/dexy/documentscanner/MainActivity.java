package com.dexy.documentscanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "MainActivity";

    static {
        if (!OpenCVLoader.initDebug()) {
            Log.i(TAG, "OpenCV load not successfully");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
