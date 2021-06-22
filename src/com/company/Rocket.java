package com.company;

import java.awt.*;

public class Rocket extends Canvas {

    public static int Lives = 3;
    private int x;
    private int y;
    private int height;
    private int width;

    public Rocket(int x, int y, int width, int height, int Lives) {
        this.Lives = 3;
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

        if (0 == this.x || ((this.y < Def.PERSON_START_Y + 200) && (Def.PERSON_START_Y < this.y)) && (Def.PERSON_START_X - Def.LH_WIDTH < this.x) && (this.x < Def.PERSON_START_X + 80)) {
            this.y = Def.PERSON_START_Y + 50;
            this.x = 5000;
        } else {
            this.x -= 25;
        }

        if (((this.y < Def.PERSON_START_Y + 200) && (Def.PERSON_START_Y < this.y)) && (Def.PERSON_START_X - Def.LH_WIDTH < this.x) && (this.x < Def.PERSON_START_X + 80)) {
            Lives -= 1;
            this.y = Def.PERSON_START_Y + 50;
            this.x = 5000;
            System.out.println(Lives);
        }
    }


    public void paint(Graphics graphics) {
        if (Lives > 0) {
            Toolkit t = Toolkit.getDefaultToolkit();
            Image i = t.getImage("RealRocket.png");
            graphics.drawImage(i, this.x, this.y, this);
        }
        repaint();
        if (Lives <= 0) {
            graphics.setColor(Color.RED);
            graphics.setFont(new Font("GameOver", Font.PLAIN, 300));
            graphics.drawString("Game Over", 150, 600);

        }
    }

}


