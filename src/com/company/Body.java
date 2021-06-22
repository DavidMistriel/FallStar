package com.company;

import java.awt.*;

public class Body {

    private int x;
    private int y;
    private int height;
    private int width;


    public Body(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public void moveRight() {
        this.x += 15;
    }

    public void moveLeft() {
        this.x -= 15;
    }

    public void jump(int Y) {

        if (y < 0 || y > getHeight()) {
            Y *= 2;
        }
        y += Y;
    }


    public void paint(Graphics graphics) {
        graphics.setColor(new Color(68, 75, 68));

        graphics.fill3DRect(this.x, this.y, this.width, this.height, true);
    }
}
