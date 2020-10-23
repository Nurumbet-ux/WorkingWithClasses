package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superPower;
    private String nameOfHero;



    public Hero(String nameOfHero,int health, int damage, String superPower) {
        this.nameOfHero = nameOfHero;
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero( String nameOfHero,int health, int damage){
        this.nameOfHero = nameOfHero;
        this.health = health;
        this.damage = damage;
    }

    public  int getDamage() {
            return damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getHealth() {
        return health;
    }

    public String getNameOfHero() {
        return nameOfHero;
    }
}
