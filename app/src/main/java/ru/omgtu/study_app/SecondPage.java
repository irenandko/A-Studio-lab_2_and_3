package ru.omgtu.study_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import android.os.AsyncTask;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SecondPage extends AppCompatActivity {

    private ImageButton img_1, img_2, img_3, img_4, img_5;
    private MediaPlayer img1_sound, img2_sound, img3_sound, img4_sound, img5_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        img_1 = findViewById(R.id.music_1);
        img_2 = findViewById(R.id.music_2);
        img_3 = findViewById(R.id.music_3);
        img_4 = findViewById(R.id.music_4);
        img_5 = findViewById(R.id.music_5);

        img1_sound = MediaPlayer.create(this, R.raw.smooth);
        img2_sound = MediaPlayer.create(this, R.raw.careless);
        img3_sound= MediaPlayer.create(this, R.raw.pony);
        img4_sound= MediaPlayer.create(this, R.raw.smile);
        img5_sound= MediaPlayer.create(this, R.raw.next);

        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(img1_sound, img2_sound, img3_sound, img4_sound, img5_sound);
            }
        });

        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(img2_sound, img1_sound, img3_sound, img4_sound, img5_sound);
            }
        });

        img_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(img3_sound, img2_sound, img1_sound, img4_sound, img5_sound);
            }
        });

        img_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(img4_sound, img2_sound, img3_sound, img1_sound, img5_sound);
            }
        });

        img_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(img5_sound, img2_sound, img3_sound, img4_sound, img1_sound);
            }
        });

    }
    private void soundPlayButton(MediaPlayer sound1, MediaPlayer sound2, MediaPlayer sound3, MediaPlayer sound4,MediaPlayer sound5)
    {
        if(sound1.isPlaying()){
            sound1.pause();
            sound1.seekTo(0);
            sound1.setLooping(false);
        }
        if(sound2.isPlaying()) {
            sound2.pause();
            sound2.seekTo(0);
            sound2.setLooping(false);
        }
        if(sound3.isPlaying()) {
            sound3.pause();
            sound3.seekTo(0);
            sound3.setLooping(false);
        }
        if(sound4.isPlaying()) {
            sound4.pause();
            sound4.seekTo(0);
            sound4.setLooping(false);
        }
        if(sound5.isPlaying()) {
            sound5.pause();
            sound5.seekTo(0);
            sound5.setLooping(false);
        }

        sound1.start();
        sound1.setLooping(true);
    }
    public void back_to_main(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        img1_sound.stop();
        img2_sound.stop();
        img3_sound.stop();
        img4_sound.stop();
        img5_sound.stop();
        startActivity(intent);
    }

}