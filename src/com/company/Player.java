package com.company;

import java.awt.*;

public class Player extends Canvas {

    private Body person;
    private Body leftLeg;
    private Body rightLeg;
    private Body head;
    private Body leftHand;
    private Body rightHand;
    private Grass grass;
    private Floor ground;
    private Face leftEye;
    private Face rightEye;
    private Face mouth;
    private Coins coin1;
    private Coins coin2;
    private Coins coin3;
    private Coins coin4;
    private Coins coin5;
    private Bomb bomb;
    private Rocket rocket;
    private Bomb bomb2;

    public Player() {
        this.person = new Body(Def.PERSON_START_X, Def.PERSON_START_Y, Def.PERSON_WIDTH, Def.PERSON_HEIGHT);
        this.rightLeg = new Body(person.getX() + 50, person.getY() + 100, Def.RL_WIDTH, person.getHeight());
        this.leftLeg = new Body(person.getX(), person.getY() + 100, Def.LL_WIDTH, person.getHeight());
        this.head = new Body(person.getX() + 10, person.getY() - 53, Def.HEAD_WIDTH, person.getHeight() - 49);
        this.rightHand = new Body(person.getX() - 26, person.getY(), Def.RH_WIDTH, person.getHeight());
        this.leftHand = new Body(person.getX() + 81, person.getY(), Def.LH_WIDTH, person.getHeight());
        this.grass = new Grass(Def.GRASS_X, Def.GRASS_Y, Def.GRASS_WIDTH, Def.GRASS_HEIGHT);
        this.ground = new Floor(grass.getX(), grass.getY() + grass.getHeight(), grass.getWidth(), Def.WINDOW_HEIGHT - grass.getHeight() - grass.getY());
        this.leftEye = new Face(person.getX() + 20, person.getY() - 41, Def.EYE_WIDTH, person.getHeight() - 90);
        this.rightEye = new Face(person.getX() + 50, person.getY() - 41, Def.EYE_WIDTH, person.getHeight() - 90);
        this.mouth = new Face(person.getX() + 25, person.getY() - 20, Def.MOUTH_WIDTH, person.getHeight() - 90);
        this.coin1 = new Coins(100, -100, Def.COIN_WIDTH, Def.COIN_HEIGHT);
        this.coin2 = new Coins(300, -150, Def.COIN_WIDTH, Def.COIN_HEIGHT);
        this.coin3 = new Coins(500, -200, Def.COIN_WIDTH, Def.COIN_HEIGHT);
        this.coin4 = new Coins(700, -250, Def.COIN_WIDTH, Def.COIN_HEIGHT);
        this.coin5 = new Coins(900, -300, Def.COIN_WIDTH, Def.COIN_HEIGHT);
        this.bomb = new Bomb(1100, -1000, Def.COIN_WIDTH, Def.COIN_HEIGHT);
        this.rocket = new Rocket(5000, Def.PERSON_START_Y + 50, Def.ROCKET_WIDTH, Def.ROCKET_HEIGHT, 0);
        this.bomb2 = new Bomb(1600, -1500, Def.COIN_WIDTH, Def.COIN_HEIGHT);

    }


    public void moveRight() {
        if (Rocket.Lives > 0) {
            this.person.moveRight();
            this.rightLeg.moveRight();
            this.leftLeg.moveRight();
            this.head.moveRight();
            this.rightHand.moveRight();
            this.leftHand.moveRight();
            this.mouth.moveRight();
            this.leftEye.moveRight();
            this.rightEye.moveRight();
        }
    }


    public void moveLeft() {
        if (Rocket.Lives > 0) {
            this.person.moveLeft();
            this.rightLeg.moveLeft();
            this.leftLeg.moveLeft();
            this.head.moveLeft();
            this.rightHand.moveLeft();
            this.leftHand.moveLeft();
            this.mouth.moveLeft();
            this.leftEye.moveLeft();
            this.rightEye.moveLeft();
        }
    }

    public void jump(int jump) {
        if (Rocket.Lives > 0) {
            this.person.jump(jump);
            this.rightLeg.jump(jump);
            this.leftLeg.jump(jump);
            this.head.jump(jump);
            this.rightHand.jump(jump);
            this.leftHand.jump(jump);
            this.mouth.jump(jump);
            this.leftEye.jump(jump);
            this.rightEye.jump(jump);
        }
    }

    public void Moving() {
        if (Rocket.Lives > 0) {
            this.coin1.Moving(coin1.getY(), coin1.getX());
            this.coin2.Moving(coin2.getY(), coin2.getX());
            this.coin3.Moving(coin3.getY(), coin3.getX());
            this.coin4.Moving(coin4.getY(), coin4.getX());
            this.coin5.Moving(coin5.getY(), coin5.getX());
            this.bomb.Moving(bomb.getY(), bomb.getX());
            this.bomb2.Moving(bomb.getY(), bomb.getX());
            this.rocket.Moving(rocket.getY(), rocket.getX());

        }

    }

    public void paint(Graphics graphics) {
        if (Rocket.Lives > 0) {
            this.coin1.paint(graphics);
            this.coin2.paint(graphics);
            this.coin3.paint(graphics);
            this.coin4.paint(graphics);
            this.coin5.paint(graphics);
            this.bomb.paint(graphics);
            this.bomb2.paint(graphics);
        }
        this.rocket.paint(graphics);
        if (Rocket.Lives > 0) {
            this.person.paint(graphics);
            this.leftLeg.paint(graphics);
            this.rightLeg.paint(graphics);
            this.head.paint(graphics);
            this.leftHand.paint(graphics);
            this.rightHand.paint(graphics);
            this.leftEye.paint(graphics);
            this.rightEye.paint(graphics);
            this.mouth.paint(graphics);
            this.grass.paint(graphics);
            this.ground.paint(graphics);
        }
        graphics.setColor(Color.RED);
        graphics.setFont(new Font("SCORE", Font.BOLD, 20));
        graphics.drawString("Score: " + Coins.SCORE, 10, 40);


        graphics.setFont(new Font("Lives", Font.BOLD, 25));
        graphics.drawString("Lives Left: " + Rocket.Lives, 1725, 40);
    }
}


