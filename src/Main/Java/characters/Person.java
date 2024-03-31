package Main.Java.characters;

import Main.Java.Coordinates;

import java.util.List;


public abstract class Person {

    protected String name;

    protected String weapon;

    Coordinates coordinates;

    protected int health;

    protected int armor;

    protected int strength;

    protected int dexterity;

    protected int hardy;

    protected float money;

    public Person(String name, String weapon, int health, int armor, float money,
                       int strength, int dexterity, int hardy, Coordinates coordinates) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.strength = strength;
        this.armor = armor;
        this.money = money;
        this.dexterity = dexterity;
        this.hardy = hardy;
        this.coordinates = coordinates;
    }

    public abstract void defend();

    public abstract void buy(int coast);

    @Override
    public String toString() {
        return name;
    }

    public List<Integer> getPosition(){
        return coordinates.getCoordinats();
    }

//    public int toCoordinatsX() {
//        return coordinates.getX();
//    }
//
//    public int toCoordinatsY() {
//        return coordinates.getY();
//    }
}
