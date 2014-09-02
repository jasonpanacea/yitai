package com.yitai.utils;

import java.util.Random;

/**
 * Created by FanJiaqi on 2014/9/2.
 */
public class Utils {
    public static int getRandomColor(){
        int index = new Random().nextInt(Constants.ROUND_COLORS.length);
        return Constants.ROUND_COLORS[index];
    }
}
