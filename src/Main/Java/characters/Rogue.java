package Main.Java.characters;
//Вор

import Main.Java.Coordinates;
import Main.Java.roleCharacteristics.Infantry;

import java.util.List;

public class Rogue extends Infantry {

    public Rogue(String name, Coordinates coordinates) {
        super(name, "нож", 700, 40, 80, 60, 50, 90,
                coordinates, 3, true);
    }

    @Override
    public String getInfo() {
        return "Вор " + history;
    }

    @Override
    public String toString() {
        return "[Вор] " + this.name + " ♥ " + this.health + " ✶ " + getPosition() + getInfo();
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        super.step(enemies, friends);
    }}