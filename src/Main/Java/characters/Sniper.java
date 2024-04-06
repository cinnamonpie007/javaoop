package Main.Java.characters;
//Снайпер

import Main.Java.Coordinates;
import Main.Java.roleCharacteristics.Arrows;

import java.util.List;

public class Sniper extends Arrows {

    protected int arrow;

    public Sniper(String name, Coordinates coordinates) {
        super(name, "винтовка", 500, 30, 25, 30, 90
                , 70, coordinates, 3, true, 10);
    }

    @Override
    public String getInfo() {
        return "Снайпер" + history;
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends){
        super.step(enemies, friends);}

    @Override
    public String toString() {
        return "[Снайпер]," + this.name + " Здоровье:" + this.health  + " Координаты: " + getPosition();
    }
}