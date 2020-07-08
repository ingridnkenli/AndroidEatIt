package com.example.androideatit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonSignIn, buttonSignUp;
    TextView textSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSignIn = (Button) findViewById(R.id.buttonSignIn);
        buttonSignUp = (Button) findViewById(R.id.buttonSignUp);
        textSlogan = (TextView) findViewById(R.id.textSlogan);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/NABILA.rar");

        textSlogan.setTypeface(face);
        buttonSignIn.setOnClickListener();

    }
}
