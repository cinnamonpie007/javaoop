package Main.Java.roleCharacteristics;

import Main.Java.Coordinates;
import Main.Java.characters.Person;

import java.util.Arrays;
import java.util.List;

public class Infantry extends Person {

    public Infantry(String name, String weapon, int health, int armor, float money, int strength, int dexterity, int hardy, Coordinates coordinates, int initiative, boolean isAlive) {
        super(name, weapon, health, armor, money, strength, dexterity, hardy, coordinates, initiative, isAlive);
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        if (!isAlive()) {
            history = name + " Умер ";
            return;
        }
        Person closestEnemy = findClosestEnemy(enemies);
        if (closestEnemy != null) {
            Coordinates enemyCoordinates = closestEnemy.getCoordinates();
            int dX = enemyCoordinates.getX() - coordinates.getX();
            int dY = enemyCoordinates.getY() - coordinates.getY();
            if (Math.abs(dX) <= 1 && Math.abs(dY) <= 1) {
                closestEnemy.getDamage(this.strength);
                history = name + " Атакует цель рядом" + closestEnemy + " с координатами: " + closestEnemy.getPosition();
            } else {
                if (Math.abs(dX) > 1 && Math.abs(dY) > 1) {
                    coordinates.moveTowards(dX, 0);
                } else {
                    coordinates.moveTowards(0, dY);
                }
                history = name + " Ходит на позицию: " + Arrays.toString(getCoords()); ;
            }
        }
    }

    private Person findClosestEnemy(List<Person> enemies) {
        Person closestEnemy = null;
        int minDistance = Integer.MAX_VALUE;

        for (Person enemy : enemies) {
            if (enemy.isAlive()) {
                Coordinates enemyCoordinates = enemy.getCoordinates();
                int distance = Math.abs(enemyCoordinates.getX() - coordinates.getX())
                        + Math.abs(enemyCoordinates.getY() - coordinates.getY());
                if (distance < minDistance) {
                    minDistance = distance;
                    closestEnemy = enemy;
                }
            }
        }
        return closestEnemy;
    }
}