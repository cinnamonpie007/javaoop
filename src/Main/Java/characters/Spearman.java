package Main.Java.characters;
//Копейщик

import Main.Java.Coordinates;
import Main.Java.roleCharacteristics.Infantry;

import java.util.List;

public class Spearman extends Infantry {

    public Spearman(String name, Coordinates coordinates) {
        super(name, "копье", 700, 30, 25, 30, 90
                , 70, coordinates, 2, true);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + history;
    }

    @Override
    public String toString() {
        return "[Копейщик] " + this.name + " ♥ " + this.health + " ✶ " + getPosition() + getInfo();
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        super.step(enemies, friends);
    }
}
