package com.hiof.fredrivo;

public class Star extends CelistialBody{

    ////Radius and mass will be in Sun mass (Ms)
    private String name;
    private double mass;
    private double radius;
    private int effectiveTemp;
    //Constants for Msun and Rsun
    private static final double MASS_SUN = 1.98892E30;
    private static final int RADIUS_SUN = 695342;

    public Star(String name, double mass, double radius, int effectiveTemp) {
        super(name, mass, radius);
        this.effectiveTemp = effectiveTemp;
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
        return super.getName() + " has a mass of " + super.getMass() + "kg, a radius of " + super.getRadius() +"km and an effective temperature of " + effectiveTemp + "K.";
    }

    //Task 2.4
    //Methods for calculating the stars mass in Msun and radius in Rsun
    public String calcMassInMsun(){
        double massInMsun = super.getMass() / MASS_SUN;
        return "The mass of " + super.getName() + " in Msun is: " + massInMsun + "Ms. \n";
    }

    public String calcRadiusInRsun(){
        double radiusInRsun = super.getRadius() / RADIUS_SUN;
        return "The radius of " + super.getName() + " in Rsun is: " + radiusInRsun + "Rs. \n";
    }
}
