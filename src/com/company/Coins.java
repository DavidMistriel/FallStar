package com.company;

import java.awt.*;
import java.util.Random;

public class Coins extends Canvas {
    Rocket rocket = new Rocket(0, 0, 0, 0, 3);

    public int random(int min, int Max) {
        Random random = new Random();
        return random.nextInt(Max - min) + min;
    }

    private int SCoins;
    private int x;
    private int y;
    private int height;
    private int width;
    public static int SCORE;

    public Coins(int x, int y, int width, int height) {
        this.rocket.Lives = 3;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }


    public void Moving() {
        this.SCoins = 3;
        this.SCoins = this.rocket.Lives;
        if (Def.GRASS_Y == this.y || Def.PERSON_START_Y == this.y && (Def.PERSON_START_X - 40 < this.x) && (this.x < Def.PERSON_START_X + 100) || Def.PERSON_START_Y == this.y && (this.x + 40 >= Def.PERSON_START_X - 40) && (this.x + 40 < Def.PERSON_START_X + 100)) {

            this.y = 0;
            this.x = random(100, 1820);


        } else {

            if (SCoins > 0) {
                this.y += 10;
            }

        }
        if (Def.PERSON_START_Y == this.y && (Def.PERSON_START_X - 40 < this.x) && (this.x < Def.PERSON_START_X + 100) || Def.PERSON_START_Y == this.y && (this.x + 40 >= Def.PERSON_START_X - 40) && (this.x + 40 < Def.PERSON_START_X + 100)) {
            SCORE += 1;
            this.y = 0;
            this.x = random(100, 1820);
            System.out.println(SCORE);
        }

    }


    public void paint(Graphics graphics) {


        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("NewStar.png");
        graphics.drawImage(i, this.x, this.y, this);
//            graphics.setFont(new Font("SCORE", Font.PLAIN,  50));
//            graphics.drawString(s, 50, 100);

    }
}


