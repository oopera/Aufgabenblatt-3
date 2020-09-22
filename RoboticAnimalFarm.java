package de.hrw.progra2.assignment3;
import java.util.ArrayList;
import java.util.List;


public class RoboticAnimalFarm {

    private List<RoboticAnimal> cage;

    public RoboticAnimalFarm() {
        cage = new ArrayList<>();
    }

    public void addAnimal(RoboticAnimal roboticAnimal) {
        cage.add(roboticAnimal);
    }

    public void removeAnimal(RoboticAnimal roboticAnimal){
        cage.remove(roboticAnimal);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Anzahl der Tiere: " + cage.size() + "\n");
        for (RoboticAnimal roboticAnimal : cage) {
            builder.append("- " + roboticAnimal.toString() + "\n");
        }
        return builder.toString();
    }

    public static void main(String[] args){

        RoboticAnimal katze = new RoboticAnimal("Meow",3,2,4,22,12,true, new Vector2D(3,4), new Vector2D(5,6));
        RoboticAnimal hund = new RoboticAnimal("Woof", 4,5,6,25,2,true,new Vector2D(5,4), new Vector2D(1,1));
        RoboticAnimal Ratte = new RoboticAnimal("ratboi", 1,2,3,12,5, true,new Vector2D(12,19), new Vector2D(3,25));


        RoboticAnimalFarm gehege = new RoboticAnimalFarm();
        gehege.addAnimal(katze);
        gehege.addAnimal(hund);
        gehege.addAnimal(Ratte);
        System.out.println(gehege);
        gehege.removeAnimal(Ratte);
        System.out.println(gehege);
    }
}