package com.example.flappybird;

public class BackgroundImage {
    private int bgImgX, bgImgY, bgImgVelocity;

    public BackgroundImage(){
        bgImgX = 0;
        bgImgY = 0;
        bgImgVelocity = 3;
    }

    // get method for x- coordinate
    public int getBgImgX() {
        return bgImgX;
    }

    // get method for y- coordinate
    public int getBgImgY() {
        return bgImgY;
    }
    // set method for x- coordinate
    public void setBgImgX(int bgImgX) {
        this.bgImgX = bgImgX;
    }
    // set method for y- coordinate
    public void setBgImgY(int bgImgY) {
        this.bgImgY = bgImgY;
    }

    // get method for Velocity
    public int getBgImgVelocity() {
        return bgImgVelocity;
    }
}
