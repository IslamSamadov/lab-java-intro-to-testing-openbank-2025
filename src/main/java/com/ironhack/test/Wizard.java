package com.ironhack.test;

public class Wizard extends Player{
    private String spell;
    private SpellLibrary spellLibrary;

    public Wizard(int health, int strength, int lives, String spell,SpellLibrary spellLibrary) {
        super(health, strength, lives);
        this.spell = spell;
        this.spellLibrary = spellLibrary;
    }

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public SpellLibrary getSpellLibrary() {
        return spellLibrary;
    }

    public void setSpellLibrary(SpellLibrary spellLibrary) {
        this.spellLibrary = spellLibrary;
    }

    public String castRandomSpell(){
        return "Casting " + spellLibrary.getRandomSpell();
    }

    public Elf convertToElf(){
        Elf newElf = new Elf(this.getHealth(),this.getStrength(),this.getLives());
        return newElf;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
}
