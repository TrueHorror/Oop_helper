package com.hiof.fredrivo;

import java.util.Comparator;

public class Planet {

    //Radius and mass will be in Jupiter mass (Mj)
    private String name;
    private double mass;
    private double radius;
    //Constants for Mjup and Rjup
    private static final double MASS_JUP = 1.898E27;
    private static final int RADIUS_JUP = 71492;
    //Gravitational constant
    private static final double GRAVITY = 0.00000000006674;

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
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

    //Task 2.2. toString() is a method in java. We need to write @Override to tell java
    //that we'll be using it to get our own output.
    @Override
    public String toString() {
        return name + " has a mass of " + mass + "kg and a radius of " + radius +"km.";
    }

    //Task 2.4
    //Methods for calculating the planets mass in Mjup and radius in Rjup
    public String calcMassInMjup(){
        double massInMjup = this.mass / MASS_JUP;
        return "The mass of " + this.name + " in Mjup is: " + massInMjup + "Mj. \n";
    }

    public String calcRadiusInRjup(){
        double radiusInRjup = this.radius / RADIUS_JUP;
        return "The radius of " + this.name + " in Rjup is: " + radiusInRjup + "Rj. \n";
    }

    //Task 2.5
    public String surfaceGravity(){
        //Surface gravity of the planet formula.
        double radiusInMeter = this.mass * 1000;
        return "The surface gravity of " + this.name + " is " + (GRAVITY * this.mass) / Math.pow(radiusInMeter, 2) + ". \n";
    }

}
