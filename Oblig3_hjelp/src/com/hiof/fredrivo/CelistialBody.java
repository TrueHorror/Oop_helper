package com.hiof.fredrivo;

public abstract class CelistialBody {
    private String name;
    private double mass;
    private double radius;
    //Gravitational constant
    private static final double GRAVITY = 0.00000000006674;
    private static final int AU_IN_KILOMETER = 149597871;

    public CelistialBody(String name, double mass, double radius) {
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

    public static double getGRAVITYconstant() {
        return GRAVITY;
    }

    public static int getAuInKilometer() {
        return AU_IN_KILOMETER;
    }

    @Override
    public String toString() {
        if (this instanceof Planet){
        return name + " has a mass of " + mass + "kg and a radius of " + radius +"km.";
        }
        else if (this instanceof Star) {
            return this.toString();
        }
        return "";
    }

    //Task 2.5
    public String surfaceGravity(){
        //Surface gravity of the planet formula.
        double radiusInMeter = this.mass * 1000;
        return "The surface gravity of " + this.name + " is " + (GRAVITY * this.mass) / Math.pow(radiusInMeter, 2) + ". \n";
    }
}
