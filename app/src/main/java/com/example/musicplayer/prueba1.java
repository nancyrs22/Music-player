package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prueba1 extends AppCompatActivity {

    Button playBtn;
    Button playBtn2;
    Button playBtn3;
    Button playBtn4;
    MediaPlayer mp;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    int totalTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba1);

        playBtn = findViewById(R.id.button);
        playBtn2 = findViewById(R.id.button2);
        playBtn3 = findViewById(R.id.button3);
        playBtn4 = findViewById(R.id.button4);

        mp = MediaPlayer.create(this, R.raw.spacemusic);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        totalTime = mp.getDuration();

        mp2 = MediaPlayer.create(this, R.raw.jump_08);
        mp2.setLooping(true);
        mp2.seekTo(0);
        mp2.setVolume(0.5f, 0.5f);
        totalTime = mp2.getDuration();

        mp3 = MediaPlayer.create(this, R.raw.win);
        mp3.setLooping(true);
        mp3.seekTo(0);
        mp3.setVolume(0.5f, 0.5f);
        totalTime = mp3.getDuration();

        mp4 = MediaPlayer.create(this, R.raw.lose);
        mp4.setLooping(true);
        mp4.seekTo(0);
        mp4.setVolume(0.5f, 0.5f);
        totalTime = mp4.getDuration();

    }

    public void playBtnClick(View view) {

        if (!mp.isPlaying()) {
            // Stopping
            mp.start();

        } else {
            // Playing
            mp.pause();
        }
    }

    public void playBtnClick2(View view) {

        if (!mp2.isPlaying()) {
            // Stopping
            mp2.start();

        } else {
            // Playing
            mp2.pause();
        }
    }

    public void playBtnClick3(View view) {

        if (!mp3.isPlaying()) {
            // Stopping
            mp3.start();
            //playBtn2.setBackgroundResource(R.drawable.stop);

        } else {
            // Playing
            mp3.pause();
            // playBtn.setBackgroundResource(R.drawable.play);
        }
    }

    public void playBtnClick4(View view) {

        if (!mp4.isPlaying()) {
            // Stopping
            mp4.start();
            //playBtn2.setBackgroundResource(R.drawable.stop);

        } else {
            // Playing
            mp4.pause();
            // playBtn.setBackgroundResource(R.drawable.play);
        }
    }


}