package com.example.foodapk.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.foodapk.MainActivity;
import com.example.foodapk.R;

public class RegistraionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registraion);
    }

    public void login(View view) {
        startActivity(new Intent(RegistraionActivity.this, LoginActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(RegistraionActivity.this, MainActivity.class));
    }
}