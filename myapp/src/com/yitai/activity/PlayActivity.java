package com.yitai.activity;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by FanJiaqi on 2014/8/27.
 */
public class PlayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_layout);
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.clip;
        VideoView vv = (VideoView)this.findViewById(R.id.vv);
        MediaController mc = new MediaController(this);
        mc.setAnchorView(vv);
        vv.setMediaController(mc);
        vv.setVideoURI(Uri.parse(uri));
        vv.start();
//        this.playbeep(R.raw.clip);
//        getWindow().setFormat(PixelFormat.TRANSLUCENT);
//        VideoView videoHolder = new VideoView(this);
////if you want the controls to appear
//        videoHolder.setMediaController(new MediaController(this));
//        Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
//                + R.raw.clip); //do not add any extension
////if your file is named sherif.mp4 and placed in /raw
////use R.raw.sherif
//        videoHolder.setVideoURI(video);
//        setContentView(videoHolder);
//        videoHolder.start();
    }

    private void playbeep(int id) {

        MediaPlayer mPlayer;
        mPlayer = MediaPlayer.create(this, id);
        mPlayer.start();
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}
