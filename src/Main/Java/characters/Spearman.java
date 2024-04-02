package Main.Java.characters;
//Копейщик

import Main.Java.Coordinates;

import java.util.List;

public class Spearman extends Person {

    public Spearman(String name, Coordinates coordinates) {
        super(name, "копье", 70, 30, 25, 30, 90
                , 70, coordinates, 2, true);
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

    }
}
