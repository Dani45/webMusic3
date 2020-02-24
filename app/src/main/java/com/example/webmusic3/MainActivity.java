package com.example.webmusic3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    VideoView video;
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4", "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"));
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = (VideoView) this.findViewById(R.id.videoView);
        MediaController mController = new MediaController(this);
        video.setMediaController(mController);
        //video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
        video.setVideoURI(Uri.parse(arrayList.get(index)));
        video.requestFocus();

    }
}