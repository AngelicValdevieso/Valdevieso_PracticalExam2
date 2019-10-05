package com.valdevieso.practicalexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View v){
        Intent i = new Intent(this, activity2.class);
        startActivity(i);
    }

    public void displaySaveData(View v){
        Toast.makeText(MainActivity.this,"Save Data...",Toast.LENGTH_SHORT).show();
    }
}
