package Main.Java.roleCharacteristics;

import Main.Java.Coordinates;
import Main.Java.characters.Person;

import java.util.Arrays;
import java.util.List;

public abstract class Magicians extends Person {

    protected int mana;

    public Magicians(String name, String weapon, int health, int armor, float money, int strength, int dexterity,
                     int hardy, Coordinates coordinates, int initiative, boolean isAlive, int mana) {
        super(name, weapon, health, armor, money, strength, dexterity, hardy, coordinates, initiative, isAlive);
        this.mana = mana;
    }

    public int getMana(){
        return mana;
    }

    public void setMana(int mana){
        this.mana = mana;
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        if (health <= 0) {
            history = name + " Умер";
            return;
        }

        int personDie = 0;

        for (Person friend : friends){
            if (friend.getHealth() <= 0){
                personDie += 1;
            }
        }

        if (getMana() >= 10 && personDie < 3) {
            for (Person friend : friends) {
                if (friend.getHealth() > 0 && friend.getHealth() <= friend.getMaxHealth()) {
                    int healAmount = Math.min(10, friend.getMaxHealth() - friend.getHealth());
                    friend.setHealth(healAmount);
                    setMana(getMana() - 10);
                    history = "Добавил союзнику " + friend.getName() + " 10 к здоровью";
                    break;
                }
            }
        }

        else if (personDie >= 3 && mana >= 50) {
            for (Person friend : friends) {
                if (friend.getHealth() <= 0) {
                    friend.setHealth(friend.getMaxHealth());
                    setMana(getMana() - 50);
                    history = "Воскресил союзника " + friend.getName();
                    break;
                }
            }
        } else {
            history = name + " Востанавливает ману ";
            mana += 5;
        }

    }
}