package Main.Java.characters;
//Снайпер

import Main.Java.Coordinates;

import java.util.List;

public class Sniper extends Person {

    protected int arrow;

    public Sniper(String name, Coordinates coordinates) {
        super(name, "винтовка", 70, 30, 25, 30, 90
                , 70, coordinates);
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

    public void atack(Person person){ person.health -= strength; }

    public void searchNearestEnemy(List<Person> enemies) {
        double minDistance = Double.MAX_VALUE;
        Person nearestEnemy = null;

        for (Person enemy : enemies) {
            if (!enemy.equals(this)) {
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
    }
}
