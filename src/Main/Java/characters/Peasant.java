package Main.Java.characters;
//Крестьянин

import Main.Java.Coordinates;

import java.util.List;

public class Peasant extends Person {

    protected int arrows;

    boolean inGame = true;

    public Peasant(String name, Coordinates coordinates, int getTeam){
        super(name, "arrow", 80, 30, 30, 40, 10
                , 100, coordinates, 0, true, getTeam);
        int arrows = 20;
    }

    public void givArrows(int val){
        this.arrows -= val;
        if (!isInGame()){
            inGame = false;
        }
    }

    public boolean isInGame() {
        return this.arrows == 0 ? false : true;
    }

    @Override
    public void defend() {
        health += 15;
    }

    @Override
    public void buy(int coast) {
        money -= coast;
    }

    @Override
    public void step(List<Person> enemies) {
    }


}
