package Main.Java.characters;
// Монах

import Main.Java.Coordinates;

import java.util.List;

public class Monk extends Person {

    protected int followers;

    public Monk(String name, Coordinates coordinates, int getTeam) {
        super(name, "мечь", 70, 30, 25, 30, 90
                , 70, coordinates, 1, true, getTeam);
    }

    @Override
    public void defend() {
        health += 20;
    }

    @Override
    public void buy(int coast) {
        money -= coast;
    }

    public void atack(Person person){person.health -= strength; }

    public void follow(int val) {followers += 1;}

    @Override
    public void step(List<Person> enemies) {

    }
}
