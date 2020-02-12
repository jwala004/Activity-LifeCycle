package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    TextView on_Create, on_Start, on_Resume, on_Pause, on_Stop, on_Restart, on_Destroy;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        on_Create = findViewById(R.id.onCreate);
        on_Start = findViewById(R.id.onStart);
        on_Resume = findViewById(R.id.onResume);
        on_Pause = findViewById(R.id.onPause);
        on_Stop = findViewById(R.id.onStop);
        on_Restart = findViewById(R.id.onRestart);
        on_Destroy = findViewById(R.id.onDestroy);

        click = findViewById(R.id.click);

        on_Create.setText("onCreate() method called");

        Log.d(TAG, "onCreate: "+"onCreate() method called ");


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });





    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: "+"onStart() method called ");

        on_Start.setText("onStart() method called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: "+"onResume() method called ");

        on_Resume.setText("onResume() method called");


    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: "+"onPause() method called ");

        on_Pause.setText("onPause() method called");


        Toast.makeText(MainActivity.this,"onPause() method on First/Main Activity called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: "+"onStop() method called ");

        on_Stop.setText("onStop() method called");

        Toast.makeText(MainActivity.this,"onStop() method on First/Main Activity called",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: "+"onRestart() method called ");

        on_Restart.setText("onRestart() method called");

        Toast.makeText(MainActivity.this,"onRestart() method on First/Main Activity called",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: "+"onDestroy() method called ");

        on_Destroy.setText("onDestroy() method called");

        Toast.makeText(MainActivity.this,"onDestroy() method on First/Main Activity called",Toast.LENGTH_LONG).show();


    }
}
