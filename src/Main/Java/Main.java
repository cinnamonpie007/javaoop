package Main.Java;
import Main.Java.characters.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;


public class Main {

    private static String getNames(){
        return String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
    }

    public static void main(String[] args) {
        List<Person> hollyTeam = new ArrayList<>();
        List<Person> darkTeam = new ArrayList<>();

        for (int i = 0; i < 10 + 1; i++) {
            Coordinates hollyField = new Coordinates(i, 0);
            Coordinates darkField = new Coordinates(i, 9);

            if (i < 7) {
                hollyTeam.add(new Peasant(getNames(), hollyField));
            } else if (i == 7) {
                hollyTeam.add(new Wizard(getNames(), hollyField));
            } else if (i == 8) {
                hollyTeam.add(new Crossbowman(getNames(), hollyField));
            } else if (i == 9) {
                hollyTeam.add(new Spearman(getNames(), hollyField));
            }

            // Создаем персонажей для второй команды
            if (i < 7) {
                darkTeam.add(new Peasant(getNames(), darkField));
            } else if (i == 7) {
                darkTeam.add(new Sniper(getNames(), darkField));
            } else if (i == 8) {
                darkTeam.add(new Monk(getNames(), darkField));
            } else if (i == 9) {
                darkTeam.add(new Rogue(getNames(), darkField));
            }
        }

        List<Person> allPerson = new ArrayList<>();
        allPerson.addAll(hollyTeam);
        allPerson.addAll(darkTeam);

        allPerson.sort((p1, p2) -> Integer.compare(p2.getInitiative(), p1.getInitiative()));

        for (Person person : allPerson) {
            person.step(allPerson);
        }

        for (Person person : allPerson){
            System.out.println(person.toString() + " >>> " + person.getPosition() + " " + person.getInitiative());
        }
    }
}




