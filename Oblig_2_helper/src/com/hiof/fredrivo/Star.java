package com.hiof.fredrivo;

public class Star {

    ////Radius and mass will be in Sun mass (Ms)
    private String name;
    private double mass;
    private double radius;
    private int effectiveTemp;
    //Constants for Msun and Rsun
    private static final double MASS_SUN = 1.98892E30;
    private static final int RADIUS_SUN = 695342;

    public Star(String name, double mass, double radius, int effectiveTemp) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.effectiveTemp = effectiveTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    //Task 2.2. toString() is a method in java. We need to write @Override to tell java
    //that we'll be using it to get our own output.
    @Override
    public String toString() {
        return name + " has a mass of " + mass + "kg, a radius of " + radius +"km and an effective temperature of " + effectiveTemp + "C\u00B0.";
    }

    //Task 2.4
    //Methods for calculating the stars mass in Msun and radius in Rsun
    public String calcMassInMsun(){
        double massInMsun = this.mass / MASS_SUN;
        return "The mass of " + this.name + " in Msun is: " + massInMsun + "Ms. \n";
    }

    public String calcRadiusInRsun(){
        double radiusInRsun = this.radius / RADIUS_SUN;
        return "The radius of " + this.name + " in Rsun is: " + radiusInRsun + "Rs. \n";
    }
}
