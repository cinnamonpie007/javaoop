package Main.Java.characters;
//Снайпер

public class Sniper extends Person {

    protected int arrow;

    public Sniper(String name) {
        super(name, "винтовка", 70, 30, 25, 30, 90
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
