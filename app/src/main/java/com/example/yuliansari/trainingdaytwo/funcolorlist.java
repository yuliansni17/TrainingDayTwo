package com.example.yuliansari.trainingdaytwo;

import java.util.Random;

/**
 * Created by Yuliansari on 11/1/2016.
 */

public class funcolorlist {
    funcolor[] funcolours = {
            new funcolor(0XFF4DD0E1),
            new funcolor(0XFF64B5F6),
            new funcolor(0XFF7986CB),
            new funcolor(0XFF9575CD),
            new funcolor(0XFFBA68C8),
            new funcolor(0XFFF06292),
            new funcolor(0XFFEF5350),
            new funcolor(0XFFAED581),
            new funcolor(0XFFDCE775)
    };

    public int createFunColor(){
        Random colorGenerator = new Random();
        int randomColor = colorGenerator.nextInt(funcolours.length);
        funcolor funcolor = funcolours[randomColor];
        return funcolor.getBgcolor();
    }
}
