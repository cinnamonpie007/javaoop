package Main.Java.characters;
//Колдун

import Main.Java.Coordinates;
import Main.Java.roleCharacteristics.Magicians;

import java.util.List;

public class Wizard extends Magicians {


    public Wizard(String name, Coordinates coordinates) {
        super(name, "посох", 400, 15, 40, 50, 50
                , 10, coordinates, 1, true, 50);
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {
        super.step(enemies, friends);
    }

    @Override
    public String getInfo() {
        return "Волшебнник" + history;
    }

    @Override
    public String toString() {
        return "[Волшебник]" + this.name + " Здоровье: " + this.health + " Координаты: " + getPosition() + getInfo();
    }

}
