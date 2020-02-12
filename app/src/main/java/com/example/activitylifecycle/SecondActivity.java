package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    private static final String TAG = "SecondActivity";
    TextView on_Create, on_Start, on_Resume, on_Pause, on_Stop, on_Restart, on_Destroy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        on_Create = findViewById(R.id.onCreate);
        on_Start = findViewById(R.id.onStart);
        on_Resume = findViewById(R.id.onResume);
        on_Pause = findViewById(R.id.onPause);
        on_Stop = findViewById(R.id.onStop);
        on_Restart = findViewById(R.id.onRestart);
        on_Destroy = findViewById(R.id.onDestroy);

        on_Create.setText("onCreate() method called");

        Log.d(TAG, "onCreate: " + "onCreate() method of Second Activity called ");


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: " + "onStart() method of Second Activity called ");

        on_Start.setText("onStart() method called");


    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: " + "onResume() method of Second Activity called ");

        on_Resume.setText("onResume() method called");


    }

    @Override
    protected void onPause() {
        super.onPause();

        on_Pause.setText("onPause() method called");

        Log.d(TAG, "onPause: " + "onPause() method of Second Activity called ");

        Toast.makeText(SecondActivity.this,"onPause() method on Second Activity called",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStop() {
        super.onStop();

        on_Stop.setText("onStop() method called");

        Log.d(TAG, "onStop: " + "onStop() method of Second Activity called ");

        Toast.makeText(SecondActivity.this,"onStop() method on Second Activity called",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onRestart() {
        super.onRestart();

        on_Restart.setText("onRestart() method called");

        Log.d(TAG, "onRestart: " + "onRestart() method of Second Activity called ");

        Toast.makeText(SecondActivity.this,"onStop() method on Second Activity called",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + "onDestroy() method of Second Activity called ");

        on_Destroy.setText("onDestroy() method called");

        Toast.makeText(SecondActivity.this, "onDestroy() method of Second Activty", Toast.LENGTH_LONG).show();

    }
}
