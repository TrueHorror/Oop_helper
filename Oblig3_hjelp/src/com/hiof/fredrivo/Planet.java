package com.hiof.fredrivo;

import java.util.Comparator;

public class Planet extends NaturalSatelite{
    //Constants for Mjup and Rjup
    private static final double MASS_JUP = 1.898E27;
    private static final int RADIUS_JUP = 71492;


    public Planet(String name, double mass, double radius, double semiMajorAxis, double eccentricity, int orbitalPeriod, CelistialBody centralCelestialBody) {
        super(name, mass, radius, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    public Planet(String name, double mass, double radius) {
        super(name, mass, radius);
    }

    //Task 2.2. toString() is a method in java. We need to write @Override to tell java
    //that we'll be using it to get our own output.

    //Task 2.4
    //Methods for calculating the planets mass in Mjup and radius in Rjup
    public String calcMassInMjup(){
        double massInMjup = super.getMass() / MASS_JUP;
        return "The mass of " + super.getName() + " in Mjup is: " + massInMjup + "Mj. \n";
    }

    public String calcRadiusInRjup(){
        double radiusInRjup = super.getRadius() / RADIUS_JUP;
        return "The radius of " + super.getName() + " in Rjup is: " + radiusInRjup + "Rj. \n";
    }



}
