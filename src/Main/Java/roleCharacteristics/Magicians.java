package Main.Java.roleCharacteristics;

import Main.Java.Coordinates;
import Main.Java.characters.Person;

import java.util.Arrays;
import java.util.List;

public abstract class Magicians extends Person {

    protected int mana;
    protected int revivedWarriors;

    public Magicians(String name, String weapon, int health, int armor, float money, int strength, int dexterity,
                     int hardy, Coordinates coordinates, int initiative, boolean isAlive, int mana) {
        super(name, weapon, health, armor, money, strength, dexterity, hardy, coordinates, initiative, isAlive);
        this.mana = mana;
        this.revivedWarriors = 0;
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
            return;
        }

        if (getMana() >= 10) {
            boolean healed = false;
            for (Person friend : friends) {
                if (friend.getHealth() <= friend.getMaxHealth()) {
                    int healAmount = Math.min(50, friend.getMaxHealth() - friend.getHealth());
                    friend.setHealth(friend.getHealth() + healAmount);
                    setMana(-10);
                    healed = true;
                    history = "Добавил союзнику " + friend.getName() + " 50 к здоровью";
                    break;
                } else {
                    break;
                }
            }

            if (!healed && revivedWarriors >= 3 && mana == 50) {
                for (Person friend : friends) {
                    if (friend.getHealth() <= 0) {
                        friend.setHealth(friend.getMaxHealth());
                        setMana(-50);
                        revivedWarriors -= 1;
                        history = "Воскресил союзника" + friend.getName();
                        break;
                    }
                }
            }
        } else {
            mana += 5;
        }
    }
}