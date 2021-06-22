package com.company;

import java.awt.*;

public class Grass extends Canvas{

    private int x;
    private int y;
    private int height;
    private int width;

    public Grass(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

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

    public int getWidth() {
        return width;
    }



    public void paint(Graphics graphics) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Ograss.png");
        graphics.drawImage(i, this.x,this.y, this);
    }
}
