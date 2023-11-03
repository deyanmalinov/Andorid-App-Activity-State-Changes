package com.DPM.andorid_app_activity_state_changes;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String msg = "";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        Toast.makeText(this, "onCreate", 0).show();
        Log.d(this.msg, "onCreate");
    }
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", 0).show();
        Log.d(this.msg, "onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", 0).show();
        Log.d(this.msg, "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", 0).show();
        Log.d(this.msg, "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", 0).show();
        Log.d(this.msg, "onStop");
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "onDestroy", 0).show();
        Log.d(this.msg, "onDestroy");
        super.onDestroy();
    }
}