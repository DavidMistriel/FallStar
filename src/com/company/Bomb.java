package com.company;

import java.awt.*;
import java.util.Random;

public class Bomb extends Canvas {


    public int random(int min, int Max) {
        Random random = new Random();
        return random.nextInt(Max - min) + min;
    }

    private int x;
    private int y;
    private int height;
    private int width;

    public Bomb(int x, int y, int width, int height) {
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

    public int getWidth() {
        return width;
    }

    public void Moving() {
        if (Def.GRASS_Y == this.y || Def.PERSON_START_Y == this.y && (Def.PERSON_START_X - 40 < this.x) && (this.x < Def.PERSON_START_X + 100) || Def.PERSON_START_Y == this.y && (this.x + 40 >= Def.PERSON_START_X - 40) && (this.x + 40 < Def.PERSON_START_X + 100)) {
            this.y = -1000;
            this.x = random(100, 1820);
        } else {
            this.y += 20;


        }
        if (Def.PERSON_START_Y == this.y && (Def.PERSON_START_X - 40 < this.x) && (this.x < Def.PERSON_START_X + 100) || Def.PERSON_START_Y == this.y && (this.x + 40 >= Def.PERSON_START_X - 40) && (this.x + 40 < Def.PERSON_START_X + 100)) {
            Coins.SCORE -= 7;
            this.y = -1000;
            this.x = random(100, 1820);
            System.out.println(Coins.SCORE);
        }
    }

    public void paint(Graphics graphics) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("NewRedStar.png");
        graphics.drawImage(i, this.x, this.y, this);

    }

}
