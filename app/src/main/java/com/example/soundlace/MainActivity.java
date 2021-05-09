package com.example.soundlace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.txt);
        text.setText("Hello!");
    }

    public void onTestButtonClick (View view) {
        TextView text = findViewById(R.id.txt);
    }
}