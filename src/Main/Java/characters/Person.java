package Main.Java.characters;

import Main.Java.Coordinates;

import java.util.ArrayList;
import java.util.List;


public abstract class Person implements isInterface {

    protected String name;

    protected String weapon;

    protected String history;

    protected Coordinates coordinates;

    protected int health;

    protected int armor;

    protected int strength;

    protected int dexterity;

    protected int hardy;

    protected float money;

    protected int initiative;

    protected boolean isAlive;

    protected int maxHealth;

    public Person(String name, String weapon, int health, int armor, float money,
                       int strength, int dexterity, int hardy, Coordinates coordinates, int initiative,
                        boolean isAlive)
    {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.strength = strength;
        this.armor = armor;
        this.money = money;
        this.dexterity = dexterity;
        this.hardy = hardy;
        this.coordinates = coordinates;
        this.initiative = initiative;
        this.isAlive = isAlive;
        this.history = "";
        this.maxHealth = health;
    }

    @Override
    public String toString() {
        return name + " ";
    }

    @Override
    public String getInfo(){return history;};

    public List<Integer> getPosition(){
        List<Integer> list = new ArrayList<>();
        list.add(coordinates.getX());
        list.add(coordinates.getY());
        return list;
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }

    public void getDamage(int damage){
        health -= damage;
    }

    public int[] getCoords(){
        return new int[]{coordinates.getX(), coordinates.getY()};
    }

    public int getInitiative() {
        return initiative;
    }

    public boolean isAlive() {
        if (health > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int num){
        this.health += num;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public String getName(){
        return name;
    }
}
