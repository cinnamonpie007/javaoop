package Main.Java.characters;
// Монах

public class Monk extends Person {

    protected int followers;

    public Monk(String name) {
        super(name, "мечь", 70, 30, 25, 30, 90
                , 70);
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
}
