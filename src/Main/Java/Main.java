package Main.Java;
import Main.Java.characters.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("andrey");
        Rogue bandit = new Rogue("vasy");
        Sniper sniper = new Sniper("john");
        Sorcerer sorcerer = new Sorcerer("adam");
        Spearman spearman = new Spearman("anton");
        Crossbowman crossbowman = new Crossbowman("danil");
        Monk monk = new Monk("artem");

        System.out.println(peasant.toString());
        System.out.println(bandit.toString());
        System.out.println(sniper.toString());
        System.out.println(sorcerer.toString());
        System.out.println(spearman.toString());
        System.out.println(crossbowman.toString());
        System.out.println(monk.toString());
    }
}

