package Main.Java.characters;
//Копейщик

import Main.Java.Coordinates;

import java.util.List;

public class Spearman extends Person {

    public Spearman(String name, Coordinates coordinates, int getTeam) {
        super(name, "копье", 70, 30, 25, 30, 90
                , 70, coordinates, 2, true, getTeam);
    }

    @Override
    public void defend() {
        health += 20;
    }

    @Override
    public void buy(int coast) {
        money -= coast;
    }

    public void atack(Person person){
        person.health -= strength;
    }

    @Override
    public void step(List<Person> enemies) {
        if (!isAlive()) {
            return;
        }

        Person closestEnemy = findClosestEnemy(enemies);
        if (closestEnemy != null) {
            int dX = closestEnemy.coordinates.getX() - coordinates.getX();
            int dY = closestEnemy.coordinates.getY() - coordinates.getY();

            if (Math.abs(dX) <= 1 && Math.abs(dY) <= 1) {
                atack(closestEnemy);
            } else {
                if (Math.abs(dX) > Math.abs(dY)) {
                    moveTowards(dX, 0);
                } else {
                    moveTowards(0, dY);
                }
            }
        }
    }

    private void moveTowards(int dX, int dY) {
        int newX = coordinates.getX() + Integer.signum(dX);
        int newY = coordinates.getY() + Integer.signum(dY);
        coordinates.setX(newX);
        coordinates.setY(newY);
    }

    private Person findClosestEnemy(List<Person> enemies) {
        Person closestEnemy = null;
        int minDistance = Integer.MAX_VALUE;

        for (Person enemy : enemies) {
            if (enemy.getTeam != getTeam && enemy.isAlive) {
                int distance = Math.abs(enemy.coordinates.getX() - coordinates.getX())
                        + Math.abs(enemy.coordinates.getY() - coordinates.getY());
                if (distance < minDistance) {
                    minDistance = distance;
                    closestEnemy = enemy;
                }
            }
        }

        return closestEnemy;
    }
}
