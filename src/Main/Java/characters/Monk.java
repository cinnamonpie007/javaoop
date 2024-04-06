package Main.Java.characters;
// Монах

import Main.Java.Coordinates;

import java.util.List;

public class Monk extends Person {

    protected int followers;

    public Monk(String name, Coordinates coordinates) {
        super(name, "мечь", 400, 30, 25, 30, 90
                , 70, coordinates, 1, true);
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
    public String getInfo() {
        return "Монах" + history;
    }

    public void follow(int val) {followers += 1;}

    @Override
    public String toString() {
        return "[Монах]" + this.name + " Здоровье: " + this.health + " Координаты: " + getPosition();
    }

    @Override
    public void step(List<Person> hollyTeam, List<Person> darkTeam) {

    }
}
