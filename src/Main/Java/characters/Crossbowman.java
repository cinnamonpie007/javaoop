package Main.Java.characters;
//Арбалетчик

import Main.Java.Coordinates;
import Main.Java.roleCharacteristics.Arrows;

import java.util.List;

public class Crossbowman extends Arrows {

    protected int arrow;

    public Crossbowman(String name, Coordinates coordinates) {
        super(name, "арбалет", 500, 30, 25, 30, 90
                , 70, coordinates, 3, true, 10);}

    @Override
    public void defend() {
        health += 20;
    }

    @Override
    public void buy(int coast) {
        money -= coast;
    }

    @Override
    public String getInfo() {
        return "Арбалетчик" + history;
    }

    @Override
    public void addArrow(int count){
        arrow += count;
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        super.step(enemies, friends);}

    @Override
    public String toString() {
        return "[Арбалетчик]," + this.name + " Здоровье:" + this.health + " Координаты: " + getPosition();
    }
}