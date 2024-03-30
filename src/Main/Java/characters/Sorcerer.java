package Main.Java.characters;
//Колдун

public class Sorcerer extends Person {

    protected int mana;

    public Sorcerer(String name) {
        super(name, "посох", 60, 15, 40, 50, 50
                , 10);
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
