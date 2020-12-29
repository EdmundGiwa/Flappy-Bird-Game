package com.example.flappybird;

import android.graphics.Canvas;

public class GameEngine {
    BackgroundImage backgroundImg;

    public GameEngine() {
        backgroundImg = new BackgroundImage();
    }

    public void updateAndDrawBackgroundImage(Canvas canvas){
        backgroundImg.setBgImgX(backgroundImg.getBgImgX() - backgroundImg.getBgImgVelocity());
        if(backgroundImg.getBgImgX() < -AppConstants.getBitmapBank().getWidth()){
                        backgroundImg.setBgImgX(0);
        }
        canvas.drawBitmap(AppConstants.getBitmapBank().getBackground(), backgroundImg.getBgImgX(), backgroundImg.getBgImgY(), null);
   if(backgroundImg.getBgImgX() < -(AppConstants.getBitmapBank().getWidth() - AppConstants.SCREEN_WIDTH)){
       canvas.drawBitmap(AppConstants.getBitmapBank()
               .getBackground(), backgroundImg.getBgImgX() +
               AppConstants.getBitmapBank()
               .getWidth(),backgroundImg.getBgImgY(), null);
   }
    }
}
