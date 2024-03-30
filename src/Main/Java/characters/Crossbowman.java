package Main.Java.characters;
//Арбалетчик

public class Crossbowman extends Person {

    protected int arrow;

    public Crossbowman(String name) {
        super(name, "арбалет", 70, 30, 25, 30, 90
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

    public void addArrow(int count){
        arrow += count;
    }

    public void atack(Person person){ person.health -= strength; }
}
