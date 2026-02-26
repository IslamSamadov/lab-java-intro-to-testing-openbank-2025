package com.ironhack.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Warrior warrior;
    private Elf elf;
    private Wizard wizard;

    @BeforeEach
    public void setUp(){
        warrior = new Warrior(100,40,2,50);
        elf = new Elf(100,30,1,50);
        wizard = new Wizard(30,10,1,"Fireball");
    }

    @Test
    public void attackReducesHealth(){
        warrior.attack(elf);
        assertEquals(60,elf.getHealth());
    }

    @Test
    public void attackDecrementsLive(){
        warrior.attack(wizard);
        assertEquals(0,wizard.getLives());
    }

    @Test
    public void warriorToElf(){
        Elf convetedElf = warrior.convertToElf();
        assertEquals(100,convetedElf.getHealth());
        assertEquals(40,convetedElf.getStrength());
        assertEquals(2,convetedElf.getLives());
    }
}
