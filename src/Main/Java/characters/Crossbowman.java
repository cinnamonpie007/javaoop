package Main.Java.characters;
//Арбалетчик

import Main.Java.Coordinates;

import java.util.List;

public class Crossbowman extends Person {

    protected int arrow;

    public Crossbowman(String name, Coordinates coordinates) {
        super(name, "арбалет", 70, 30, 25, 30, 90
                , 70, coordinates, 3, true);
    }

    @Override
    public void defend() {
        health += 20;
    }

    @Override
    public void buy(int coast) {
        money -= coast;
    }

    public void addArrow(int count){
        arrow += count;
    }

    public void attack(Person person){ person.health -= strength; }

    public Person searchNearestEnemy(List<Person> enemies) {
        double minDistance = Double.MAX_VALUE;
        Person nearestEnemy = null;

        for (Person enemy : enemies) {
            if (!enemy.equals(this) && enemy.isAlive) {
                double distance = this.coordinates.calculateDistance(enemy.coordinates);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestEnemy = enemy;
                }
            }
        }

        if (nearestEnemy != null) {
            System.out.println(this.name + " is targeting the nearest enemy: " + nearestEnemy.name);
        } else {
            System.out.println(this.name + " has no enemies nearby.");
        }
        return nearestEnemy;
    }

    @Override
    public void step(List<Person> enemies) {
        if (isAlive && arrow > 0) {
            Person nearestEnemy = searchNearestEnemy(enemies);
            if (nearestEnemy != null) {
                attack(nearestEnemy);
                System.out.println("Sniper " + name + " shoots at the nearest enemy.");
                arrow--;
            }
        } else {
            if (!isAlive) {
                System.out.println("Sniper " + name + " is dead.");
            } else {
                System.out.println("Sniper " + name + " is out of arrows.");
            }
        }
    }
}