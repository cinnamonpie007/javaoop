package Main.Java.characters;
//Копейщик

public class Spearman extends Person {

    public Spearman(String name) {
        super(name, "копье", 70, 30, 25, 30, 90
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

    public void atack(Person person){
        person.health -= strength;
    }
}
