package com.company;

import javax.swing.*;


public class Game extends JFrame {
    private Player human;


    public Game() {


        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Fall Stars");
        Panel panel = new Panel();
        this.add(panel);


        panel.setSize(1920, 1080);
        this.human = panel.getHuman();
        this.setVisible(true);


        PlayerMover playerMover = new PlayerMover(human);
        this.addKeyListener(playerMover);

    }


}