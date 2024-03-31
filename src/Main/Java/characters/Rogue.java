package Main.Java.characters;
//Разбойник

import Main.Java.Coordinates;

public class Rogue extends Person {

    public Rogue(String name, Coordinates coordinates){
        super(name, "нож" ,100, 40, 80, 60,
                50, 90, coordinates);
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
}
