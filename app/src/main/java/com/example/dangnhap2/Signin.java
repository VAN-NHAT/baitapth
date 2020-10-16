package com.example.dangnhap2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signin extends AppCompatActivity {


    private Button bntve;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        bntve = (Button) findViewById(R.id.btn_ve);


        bntve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Signin.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}