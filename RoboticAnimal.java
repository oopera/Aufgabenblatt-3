package de.hrw.progra2.assignment3;

import java.awt.*;
import java.util.Random;


public class RoboticAnimal {

    private final Random iD = new Random();
    private String name;
    private double packageWidth, packageHeight, packageDepth;
    private long lifeSpanInHours;
    private long currentAgeInHours;
    private boolean isLiving;
    private Vector2D position;
    private Vector2D movement;

    public RoboticAnimal() {
        name = "Name";
        packageWidth = 1;
        packageHeight = 1;
        packageDepth = 1;
        lifeSpanInHours = 1;
        currentAgeInHours = 1;
        isLiving = true;
        position = new Vector2D(1,1);
        movement = new Vector2D(1,1);

    } /** StandardKonst **/

    public RoboticAnimal(String name, double packageWidth, double packageHeight, double packageDepth, long lifeSpanInHours, long currentAgeInHours, boolean isLiving, Vector2D position, Vector2D movement){
        this.name = name;
        this.packageWidth = packageWidth;
        this.packageHeight = packageHeight;
        this.packageDepth = packageDepth;
        this.lifeSpanInHours = lifeSpanInHours;
        this.currentAgeInHours = currentAgeInHours;
        this.isLiving = isLiving;
        this.position = position;
        this.movement = movement;
    } /** PublicKonstr.**/

    /** Getter
     * @return**/
    public Random getiD() {
        return iD;
    }
    public String getName() {
        return name;
    }
    public double getPackageWidth() {
        return packageWidth;
    }
    public double getPackageHeight() {
        return packageHeight;
    }
    public double getPackageDepth() {
        return packageDepth;
    }
    public long getLifeSpanInHours() {
        return lifeSpanInHours;
    }
    public long getCurrentAgeInHours() {
        return currentAgeInHours;
    }
    public Vector2D getPosition() {
        return position;
    }
    public Vector2D getMovement() {
        return movement;
    }
    public boolean isLiving() {
        return isLiving;
    }
    public long getRemainingLifeTime() {
        long remainingLifeTime = (lifeSpanInHours-currentAgeInHours);
        return remainingLifeTime;
    }
    public double getPackageVolume() {
        double packageVolumeInCB;
        packageVolumeInCB = (packageWidth*packageHeight*packageDepth);
        return packageVolumeInCB;
    }
    public Vector2D getFuturePosition(long hours){
         Vector2D FuturePosition = new Vector2D(position.getX() + (movement.getX() * hours), position.getY() + (movement.getY() * hours));
        return FuturePosition;
    }

    public double getDistanceTo(){
        RoboticAnimal Penguin = new RoboticAnimal("Birdy", 1,2,3,12,5, true,new Vector2D(41,22), new Vector2D(12,13));
        double distance = Vector2D.getDistance(position, Penguin.position);
        return distance;
    }

    public boolean IsInExplosionRadius(){
        RoboticAnimal Penguin = new RoboticAnimal("Birdy", 1,2,3,12,5, true,new Vector2D(41,22), new Vector2D(12,13));

        if(Penguin.isLiving = true){
            if (getDistanceTo()<100){
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean doesJeopardize(){
        RoboticAnimal Penguin = new RoboticAnimal("Birdy", 1,2,3,12,5, true,new Vector2D(41,22), new Vector2D(12,13));

        if(Penguin.isLiving = true){
        getFuturePosition(lifeSpanInHours-currentAgeInHours);
            getDistanceTo();
            return true;

            } else {
                return false;

        }
     }

     // Leider haben wir keine möglichkeit gefunden ein Objekt als Referenz über die Methoden zu übergeben ohne durch einen Stackoverflow abzustürzen.

    /** Setter **/
    public void setName(String name) {
        this.name = name;
    }
    public void setPackageWidth(double packageWidth) {
        this.packageWidth = packageWidth;
    }
    public void setPackageHeight(double packageHeight) {
        this.packageHeight = packageHeight;
    }
    public void setPackageDepth(double packageDepth) {
        this.packageDepth = packageDepth;
    }
    public void setLifeSpanInHours(long lifeSpanInHours) {
        this.lifeSpanInHours = lifeSpanInHours;
    }
    public void setCurrentAgeInHours(long currentAgeInHours) {
        this.currentAgeInHours = currentAgeInHours;
    }
    public void setLiving(boolean living) {
        isLiving = living;
    }
    public void setPosition(Vector2D position) {
        this.position = position;
    }
    public void setMovement(Vector2D movement) {
        this.movement = movement;
    }
    public String toString(){
        return "iD: " + iD.nextLong() + ", Name: " + name + ", Paketabemessungen: Breite: " + packageWidth + ", Hoehe: " + packageHeight + ", Tiefe: " + packageDepth + ", Lebensdauer in Std.: " + lifeSpanInHours + ", aktuelles Alter in Std.: " + currentAgeInHours + ", Lebendig?: " + isLiving + ", verbleibende Lebenszeit: " + getRemainingLifeTime() + ", Volumen des Versandpakets in Kubikmeter: " + getPackageVolume() + ",Ps" + "Position: " + getPosition() + ", Bewegung:" + getMovement() + ", Zukünftige Position: " + getFuturePosition(4) + ", Distanz zu nächsten Tier: " + getDistanceTo()+ ", Ist in explosionsradius: " + IsInExplosionRadius() + ", Does Jeopardize " + doesJeopardize();
    }

    public static void main(String[] args){

        RoboticAnimal katze = new RoboticAnimal("Meow",3,2,4,22,12,true, new Vector2D(3,4), new Vector2D(5,6));
        RoboticAnimal hund = new RoboticAnimal("Woof", 4,5,6,25,2,true,new Vector2D(5,4), new Vector2D(1,1));
        RoboticAnimal Penguin = new RoboticAnimal("Birdy", 1,2,3,12,5, true,new Vector2D(41,22), new Vector2D(12,13));
        System.out.println(katze);
        System.out.println(hund);

    }
}
