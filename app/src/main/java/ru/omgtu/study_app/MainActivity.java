package ru.omgtu.study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void page_2(View v){
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }
    public void page_3(View v){
        Intent intent = new Intent(this, Third_page.class);
        startActivity(intent);
    }
    public void page_4(View v){
        Intent intent = new Intent(this, Forth_page_first.class);
        startActivity(intent);
    }


}