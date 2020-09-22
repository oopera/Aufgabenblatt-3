package de.hrw.progra2.assignment3;

public class Plant {

    private String name;

    private long numberOfLeaves;

    private double heightInCm;

    private double growthPerDayInCm;

    private long futureHeight;

    public Plant() {
        name = "Plant";
        numberOfLeaves = 1;
        heightInCm = 1;
        growthPerDayInCm = 1;

    }

    public Plant(String name, long numberOfLeaves, double heightInCm, double growthPerDayInCm, long futureHeight) {
        this.name = name;
        this.numberOfLeaves = numberOfLeaves;
        this.heightInCm = heightInCm;
        this.growthPerDayInCm = growthPerDayInCm;
        this.futureHeight = futureHeight;
    }


    public String getName() {
        return name;
    }

    public long getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public double getHeightInCm() {
        return heightInCm;
    }

    public double getGrowthPerDayInCm() {
        return growthPerDayInCm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfLeaves(long numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public void setHeightInCm(double heightInCm) {
        this.heightInCm = heightInCm;
    }

    public void setGrowthPerDayInCm(double growthPerDayInCm) {
        this.growthPerDayInCm = growthPerDayInCm;
    }

    public long getFutureHeight() {
        return futureHeight;
    }

    public String toString() {
        return "Name: " + name + ", Anzahl der Blätter: " + numberOfLeaves + ", groesse in cm: " + heightInCm + ", wachstum pro tag in cm: " + growthPerDayInCm + ", Zukünftige groesse: " + (futureHeight * growthPerDayInCm);
    }


    public static void main(String[] args) {
        Plant plant = new Plant("Pflanze", 12, 14,2,55);
        System.out.println(plant);
    }

}
