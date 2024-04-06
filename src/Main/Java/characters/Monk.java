package Main.Java.characters;
// Монах

import Main.Java.Coordinates;
import Main.Java.roleCharacteristics.Magicians;

import java.util.List;

public class Monk extends Magicians {

    public Monk(String name, Coordinates coordinates) {
        super(name, "мечь", 400, 30, 25, 30, 90
                , 70, coordinates, 1, true, 50);
    }

    @Override
    public String getInfo() {
        return "Монах " + history;
    }

    @Override
    public String toString() {
        return "[Монах] " + this.name + " ♥ " + this.health + " ✶ " + getPosition() + getInfo();
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        super.step(enemies, friends);
    }
}
