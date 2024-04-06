package Main.Java.characters;
//Колдун

import Main.Java.Coordinates;

import java.util.List;

public class Wizard extends Person {

    protected int mana;

    public Wizard(String name, Coordinates coordinates) {
        super(name, "посох", 400, 15, 40, 50, 50
                , 10, coordinates, 1, true);
        this.mana = 20;
    }

    @Override
    public void defend() {
        health += 20;
    }

    @Override
    public void buy(int coast) {
        money -= coast;
    }

    @Override
    public void step(List<Person> enemies, List<Person> friends) {

    }

    @Override
    public String getInfo() {
        return "Волшебнник" + history;
    }

    @Override
    public String toString() {
        return "[Волшебник]" + this.name + " Здоровье: " + this.health + " Координаты: " + getPosition();
    }

    public void helth(Person person){
        person.health += 15;
    }

}
