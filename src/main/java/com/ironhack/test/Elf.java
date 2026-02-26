package com.ironhack.test;

public class Elf extends Player{
    private int speed;

    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        this.speed = speed;
    }

    public Elf(int health, int strength, int lives){
        super(health, strength, lives);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
