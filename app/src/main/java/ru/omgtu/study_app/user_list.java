package ru.omgtu.study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class user_list extends AppCompatActivity {

    private String[] info_array = new String[] {"John", "Anna"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        setContentView(R.layout.activity_user_list);
        listView = findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.name_item, R.id.name, info_array);
        listView.setAdapter(adapter);
    }

    public void goHome(View v){
        Intent intent = new Intent(this, Forth_page_first.class);
        startActivity(intent);
    }
}