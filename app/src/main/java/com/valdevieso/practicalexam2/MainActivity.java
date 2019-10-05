package com.valdevieso.practicalexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText comment;
    CheckBox S1,S2,S3,S4,S5,S6,
            S7,S8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comment = findViewById(R.id.comment);
        S1 = findViewById(R.id.S1);
        S2 = findViewById(R.id.S2);
        S3 = findViewById(R.id.S3);
        S4 = findViewById(R.id.S4);
        S5 = findViewById(R.id.S5);
        S6 = findViewById(R.id.S6);
        S7 = findViewById(R.id.S7);
        S8 = findViewById(R.id.S8);

    }

    public void displaySaveData (View v) {
        String commentData = comment.getText().toString();
        //String subject1Data = subject1.getText().toString();
        //String subject2Data = subject2.getText().toString();
        //String subject3Data = subject3.getText().toString();
        //String subject4Data = subject4.getText().toString();
        //String subject5Data = subject5.getText().toString();
        //String subject6Data = subject6.getText().toString();
        //String subject7Data = subject7.getText().toString();
        //String subject8Data = subject8.getText().toString();

        String subjects = "";
        if (S1.isChecked()) {
            subjects = subjects + S1.getText().toString() + "\n";
        }
        if (S2.isChecked()) {
            subjects = subjects + S2.getText().toString()+ "\n" ;
        }
        if (S3.isChecked()) {
            subjects = subjects + S3.getText().toString()+ "\n";
        }
        if (S4.isChecked()) {
            subjects = subjects + S4.getText().toString()+ "\n";
        }
        if (S5.isChecked()) {
            subjects = subjects + S5.getText().toString()+ "\n";
        }
        if (S6.isChecked()) {
            subjects = subjects + S6.getText().toString()+ "\n";
        }
        if (S7.isChecked()) {
            subjects = subjects + S7.getText().toString()+ "\n";
        }
        if (S8.isChecked()) {
            subjects = subjects + S8.getText().toString()+ "\n";
        }



        FileOutputStream writer = null;
        FileOutputStream writer1 = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer1 = openFileOutput("data2.txt", MODE_PRIVATE);
            writer1.write(subjects.getBytes());
            writer.write(commentData.getBytes());
        } catch(FileNotFoundException e) {
            Log.d("Error", "File not found.");
        } catch (IOException e) {
            Log.d("Error", "IO Error.");
        } finally {
            try {
                writer.close();
                writer1.close();
            } catch (IOException e) {
                Log.d("Error", "File not found.");
            }
        }

            Toast.makeText(this, "Data Saved.", Toast.LENGTH_SHORT).show();

    }
    public void next(View v){
        Intent i = new Intent(this, activity2.class);
        startActivity(i);
    }


}
