package com.example.flappybird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank  {
Bitmap background;

    public BitmapBank(Resources res){
        background = BitmapFactory.decodeResource(res, R.drawable.bgfloppybird);
        background = scaleImage(background);
    }

    public Bitmap getBackground(){
        return background;
    }
    public int getWidth(){
        return background.getWidth();
    }

    public int getHeight(){
        return background.getHeight();
    }

    public Bitmap scaleImage(Bitmap bitmap){
        float widthHeightRatio = getWidth() / getHeight();

        int backgroundScaleWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return bitmap.createScaledBitmap(bitmap, backgroundScaleWidth, AppConstants.SCREEN_HEIGHT, false);
    }
}
