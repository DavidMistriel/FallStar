package com.company;

import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {


    private Player human;

    public Panel() {
        this.setLayout(null);
        this.setDoubleBuffered(true);
        this.human = new Player();
        JOptionPane.showMessageDialog(null, "Welcome to FallStars.\nThe Rules are simple, Catch stars to get points, you have a total of 3 lives and if you get hit by a rocket you lose 1 life .\nThere are 2 types of stars the red ones and the gold ones. The gold stars give you 1 point each and the red stars take down 7 points each so stay away from the red stars.\nTo move left all you need to do is click the left arrow on the keyboard and the same idea for moving right.\nTo jump you need to do is press down on the space bar and let go when you want to go back down.\nIf you stay in the air while jumping you wont be able to collect any coins so try and stay on the floor so you can catch all of the coins.\nYou can also jump on the Rockets to get rid of them \n \n Game Developers: David Mistriel, Paz Tabachnic and Ezra Margolin.\n \n \n                                                                                                                                Press OK to start playing ");
        this.mainGameLoop();
    }
    public void paint(Graphics g) {
        super.paint(g);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("Ogsky.jpg");
        g.drawImage(image, 0, 0, this);
        this.human.paint(g);

    }

    public Player getHuman() {
        return human;
    }

    public void mainGameLoop() {

        new Thread(() -> {

            while (true) {
                try {

                    repaint();
                    this.human.Moving();
                    Thread.sleep(20);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
