package com.example.mm2activity.Explicit;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mm2activity.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findViewById(R.id.btnExplicit).setOnClickListener(v -> {
            Intent i = new Intent(FirstActivity.this, SecondActivity.class);
            startActivity(i);
        });
    }
}