package Main.Java.roleCharacteristics;

import Main.Java.Coordinates;
import Main.Java.characters.Person;

import java.util.List;

public abstract class Arrows extends Person {

    protected int arrow;

    public Arrows(String name, String weapon, int health, int armor, float money, int strength, int dexterity,
                  int hardy, Coordinates coordinates, int initiative, boolean isAlive, int arrow) {
        super(name, weapon, health, armor, money, strength, dexterity, hardy, coordinates, initiative, isAlive);
        this.arrow = arrow;
    }

    public int getArrow(){
        return arrow;
    }

    public void setArrow(int arrow){
        this.arrow = arrow;
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        searchNearestEnemy(enemies);
    }

    public void attack(Person enemy) {
        enemy.getDamage(this.strength);
    }

    public void searchNearestEnemy(List<Person> enemies) {
        double minDistance = Double.MAX_VALUE;
        Person nearestEnemy = null;

        for (Person enemy : enemies) {
            if (!enemy.equals(this) && enemy.isAlive()) {
                double distance = this.coordinates.calculateDistance(coordinates);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestEnemy = enemy;
                }
            }
        }

        if (nearestEnemy != null) {
            attack(nearestEnemy);
            arrow--;
            history = this.name + " стреляет по ближайшей цели: " + nearestEnemy.toString() + " с координатами" + nearestEnemy.getPosition();
        } else {
            int dX = 0;
            int dY = 0;
            coordinates.moveTowards(0, dY);
            history = this.name + " нет цели рядом.";
        }
    }
}