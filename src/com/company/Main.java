package com.company;

public class Main {
    public static int counter = 1;

    public static void main(String[] args) {
        Boss Thanos = new Boss();
        Thanos.setDamage(60);
        Thanos.setTypeOfDefence("Physical");
        Thanos.setHealth(700);
        System.out.println(Thanos.getDamage() + " " + Thanos.getHealth() + " " + Thanos.getTypeOfDefence());
        for (Hero temp : creatHeroes()) {
            for (int i = 0; i < creatHeroes().length; i++) {
                System.out.println(counter + ") HERO: ");
                System.out.println("       Name: " + temp.getNameOfHero());
                System.out.println("       Damage: " + temp.getDamage());
                if (temp.getSuperPower() == null) {
                    System.out.println("       no Superpower!");
                } else {
                    System.out.println("       Superpower: " + temp.getSuperPower());
                }
                System.out.println("_____________________________");
                counter++;
                break;
            }


        }
    }

    public static Hero[] creatHeroes() {
        Hero ironMan = new Hero("Iron Man", 300, 30, "Firing");
        Hero capitanAmerica = new Hero("Capitan of America", 300, 20);
        Hero halk = new Hero("Halk", 600, 25, "Physical power");
        return new Hero[]{ironMan, capitanAmerica, halk};
    }
}
