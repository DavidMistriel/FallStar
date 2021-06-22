package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMover implements KeyListener {
    private boolean jump=false;
    private Player human;

    public PlayerMover(Player human) {
        this.human = human;
    }
   int JumpCounter = 0;
   int j = Def.PERSON_START_Y;
    public void keyTyped(KeyEvent e) {


        }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_RIGHT:
                if (Def.PERSON_START_X != 1805) {
                    System.out.println("Moving Right");
                    this.human.moveRight();

                    Def.PERSON_START_X += 15;
                }

                break;
            case KeyEvent.VK_LEFT:
                if (Def.PERSON_START_X != 20) {
                    System.out.println("Moving Left");
                    this.human.moveLeft();
                    Def.PERSON_START_X -= 15;
                }
                break;
            case KeyEvent.VK_SPACE:
                System.out.println("Jumping");
                if(!jump)
                this.human.jump(-100);
                jump=true;
                Def.PERSON_START_Y+=200;
                JumpCounter+=10;
                break;

        }
    }


    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_SPACE:
                this.human.jump(100);
                jump=false;
                Def.PERSON_START_Y=j;


        }


    }
}

