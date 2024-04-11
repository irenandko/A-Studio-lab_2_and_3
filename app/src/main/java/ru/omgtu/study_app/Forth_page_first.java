package ru.omgtu.study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Forth_page_first extends AppCompatActivity {

    private EditText username_field, date_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_page_first);

        username_field = findViewById(R.id.editText_username);
        date_field = findViewById(R.id.editText_date);
    }

    public void saveData(View view){

        String user_name = username_field.getText().toString();
        String date = date_field.getText().toString();

        try {
            FileOutputStream fileOutput = openFileOutput("user_data.txt", MODE_PRIVATE);
            fileOutput.write((user_name + ". " + date).getBytes());
            fileOutput.close();

            username_field.setText("");
            date_field.setText("");
            Toast.makeText(this, "Successful saving!", Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "!The data is NOT saved", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getData(View view){

        try {
            FileInputStream fileInput = openFileInput("user_data.txt");
            InputStreamReader reader = new InputStreamReader(fileInput);
            BufferedReader bR = new BufferedReader(reader);

            StringBuilder stringBuffer = new StringBuilder();
            String lines = "";
            while((lines = bR.readLine()) != null){
                stringBuffer.append(lines).append("\n");
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void goContact(View v){
        Intent intent = new Intent(this, user_list.class);
        startActivity(intent);
    }
}