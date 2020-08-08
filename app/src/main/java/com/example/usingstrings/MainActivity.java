package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TxtvMsg2 = findViewById(R.id.TvMsg2);
        TxtvMsg2.setText(R.string.Msg2);

        Log.i( "Lifecycle" ,"OnCreate called...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i( "Lifecycle" , "OnStart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i( "Lifecycle" , "OnResume called...");
    }
}