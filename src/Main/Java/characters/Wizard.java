package Main.Java.characters;
//Колдун

import Main.Java.Coordinates;

public class Wizard extends Person {

    protected int mana;

    public Wizard(String name, Coordinates coordinates) {
        super(name, "посох", 60, 15, 40, 50, 50
                , 10, coordinates);
    }

    @Override
    public void defend() {
        health += 20;
    }

    @Override
    public void buy(int coast) {
        money -= coast;
    }

    public void helth(Person person){
        person.health += 15;
    }

    public void atack(Person person){
        person.health -= strength;
    }
}
