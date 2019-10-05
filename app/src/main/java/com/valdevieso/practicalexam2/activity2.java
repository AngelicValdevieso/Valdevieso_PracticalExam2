package com.valdevieso.practicalexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
    }
    public void previous(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void displaySaveData(View v){
        Toast.makeText(activity2.this,"Save Data...",Toast.LENGTH_SHORT).show();
    }

}
