package Main.Java.characters;
//Крестьянин

import Main.Java.Coordinates;
import Main.Java.roleCharacteristics.Arrows;

import java.util.List;

public class Peasant extends Person {

    protected int arrows;

    public Peasant(String name, Coordinates coordinates){
        super(name, "Стрелы", 900, 30, 30, 40, 10
                , 100, coordinates, 0, true);
        this.arrows = 5000;
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        Person pt = null;
        int min = Integer.MAX_VALUE;
        if (health <= 0){
            for (Person freand : friends){
                if (freand instanceof Arrows){
                    if (((Arrows) freand).getArrow() < min){
                        min = ((Arrows) freand).getArrow();
                        pt = freand;
                    }
                }
            }
        }
        if (pt != null){
            ((Arrows) pt).setArrow(min + 1);
        }
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + history;
    }

    @Override
    public String toString() {
        return "[Крестьянин] " + this.name + " ♥ " + this.health + " ✶ " + getPosition() + getInfo();
    }
}
