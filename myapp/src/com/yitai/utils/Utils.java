package com.yitai.utils;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yitai.activity.R;

import java.util.Random;

/**
 * Created by FanJiaqi on 2014/9/2.
 */
public class Utils {
    private static LayoutInflater inflater;

    public static int getRandomRibbon() {
        int index = new Random().nextInt(Constants.ROUND_RIBBONS.length);
        return Constants.ROUND_RIBBONS[index];
    }


}
