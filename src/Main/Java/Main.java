package Main.Java;
import Main.Java.characters.*;
import Main.Java.view.View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static ArrayList<Person> allPerson = new ArrayList<>();
    public static ArrayList<Person> hollyTeam = new ArrayList<>();
    public static ArrayList<Person> darkTeam = new ArrayList<>();

    public static void main(String[] args) {
        hollyTeam = hollyTeamCreator();
        darkTeam = darkTeamCreator();

        allPerson.addAll(hollyTeam);
        allPerson.addAll(darkTeam);

        allPerson.sort((p1, p2) -> Integer.compare(p2.getInitiative(), p1.getInitiative()));

        Scanner in = new Scanner(System.in);
        while (true){
            View.view();
            for (Person p : allPerson){
                if (hollyTeam.contains(p)){
                    p.step(darkTeam, hollyTeam);
                } else {
                    if (darkTeam.contains(p)){
                        p.step(hollyTeam, darkTeam);
                    }
                }
            }
            in.nextLine();
            if (isLiving(hollyTeam)){
                System.out.println("победа света");
                break;
            }
            if (isLiving(darkTeam)) {
                System.out.println("победа тьмы");
                break;
            }
        }
    }

    private static boolean isLiving(ArrayList<Person> team){
        int teams = 0;
        for (Person person : team){
            if (person.getHealth() <= 0) {
                teams += 1;
            }
        }
        return teams == 10;
    }


    private static String getNames(){
        return String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
    }

    private static ArrayList<Person> hollyTeamCreator(){
        ArrayList<Person> teamHolly = new ArrayList<Person>();

        for (int i = 1; i <= 10; i++){
            Coordinates hollyField = new Coordinates(i, 1);
            switch (new Random().nextInt(4)){
                case 0:
                    teamHolly.add(new Crossbowman(getNames(), hollyField));
                    break;
                case 1:
                    teamHolly.add(new Monk(getNames(), hollyField));
                    break;
                case 2:
                    teamHolly.add(new Spearman(getNames(), hollyField ));
                    break;
                case 3:
                    teamHolly.add(new Peasant(getNames(), hollyField));
                    break;
            }
        }
        return teamHolly;
    }
    private static ArrayList<Person> darkTeamCreator(){
        ArrayList<Person> teamDark = new ArrayList<Person>();

        for (int i = 1; i <= 10; i++){
            Coordinates darkField = new Coordinates(i, 10);
            switch (new Random().nextInt(4)){
                case 0:
                    teamDark.add(new Peasant(getNames(), darkField));
                    break;
                case 1:
                    teamDark.add(new Sniper(getNames(), darkField));
                    break;
                case 2:
                    teamDark.add(new Wizard(getNames(), darkField));
                    break;
                case 3:
                    teamDark.add(new Rogue(getNames(),darkField));
                    break;
            }
        }
        return teamDark;
    }
}