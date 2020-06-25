package com.example.easysnackbarsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button1);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Snackbar.make(v, "message", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                Intent intent = new Intent(this, SnackBarCustomizeActionActivity.class);
                startActivity(intent);
        }
    }
}
