package com.ironhack.test;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int originalHealth = 100;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    private void decrementLive(){
        lives--;
        if (lives <= 0)
        {
            System.out.println("This charcter is dead.");
            return;
        }
        health = originalHealth;
    }

    public void attack(Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth() - this.strength);
    }

    public void setHealth(int health) {
        this.health = health;
        this.checkHealth();
    }

    public void checkHealth(){
        if (health <= 0){
            this.decrementLive();
        }
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }
}
