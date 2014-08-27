package com.yitai.activity;

import android.app.Activity;
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
        this.setContentView(R.layout.play_layout);
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.clip;
        VideoView vv = (VideoView)this.findViewById(R.id.vv);
        MediaController mc = new MediaController(this);
        mc.setAnchorView(vv);
        vv.setMediaController(mc);
        vv.setVideoURI(Uri.parse(uri));
        vv.start();
    }
}
