package com.company;


import java.awt.*;



public class Face {

    private int x;
    private int y;
    private int height;
    private int width;

    private int yIncrement = 100;

    public Face(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }


    

    public void moveRight() { this.x+=15; }
    public void moveLeft() { this.x-=15; }
    public void jump(int Y) {

        if (y < 0 || y > getHeight()) {
            Y *= 2;
        }
        y += Y;
    }






    public void paint(Graphics graphics) {
        graphics.setColor(new Color(19, 18, 18));
        graphics.fillRect(this.x, this.y, this.width, this.height);
    }

}
