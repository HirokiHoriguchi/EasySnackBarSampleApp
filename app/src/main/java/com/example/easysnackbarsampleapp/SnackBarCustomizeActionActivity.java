package com.example.easysnackbarsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarCustomizeActionActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar_customize_action);

        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button3);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                SetSnackBarAction(v);
                break;
            default:
                break;
        }
    }



    private void SetSnackBarAction(View v){
        Snackbar snackbar = Snackbar.make(v, R.string.ask, Snackbar.LENGTH_SHORT);
        snackbar.setDuration(10000);
        snackbar.getView().setBackgroundColor(Color.rgb(32, 125, 98));

        snackbar.setAction("Replay", new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(R.string.message);
            }
        });
        snackbar.setActionTextColor(Color.YELLOW);
        snackbar.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("");
            }
        }, 7000);
    }

}
