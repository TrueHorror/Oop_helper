package com.hiof.fredrivo;

import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets;


    //Adding multiple planets with an ArrayList
    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    //Task 2.2. toString() is a method in java. We need to write @Override to tell java
    //that we'll be using it to get our own output.
    @Override
    public String toString() {
        return name + " has a total mass of " + calcMass() + "kg and all planets and the star has a combined radius of " + calcRadius() +"km.";
    }

    public double calcMass(){
        double totalMass = 0;
        for (Planet p: this.planets) {
            totalMass += p.getMass();

        }
        totalMass += centerStar.getMass();

        return totalMass;
    }

    public double calcRadius(){
        double totalRadius = 0;
        for (Planet p: this.planets) {
            totalRadius += p.getRadius();

        }

        totalRadius += centerStar.getRadius();

        return totalRadius;
    }

    public Planet getSmallestPlanet(){
        Planet smallestPlanet = planets.get(0);
        for (Planet p: planets) {
            if(p.getRadius() < smallestPlanet.getRadius()){
                smallestPlanet = p;
            }
            else if (p.getRadius() == smallestPlanet.getRadius()){
                if (p.getMass() > smallestPlanet.getMass()){
                    smallestPlanet = p;
                }
            }

        }
        return smallestPlanet;
    }

    public Planet getLargestPlanet(){
        Planet largestPlanet = planets.get(0);
        for (Planet p: planets) {
            if(p.getRadius() > largestPlanet.getRadius()){
                largestPlanet = p;
            }
            else if (p.getRadius() == largestPlanet.getRadius()){
                if (p.getMass() > largestPlanet.getMass()){
                    largestPlanet = p;
                }
            }

        }
        return largestPlanet;
    }

    public Planet getPlanetByName(String planetName){
        for (Planet p: planets) {
            if (p.getName() == planetName) {
                return p;
            }
        }
        return null;
    }
}
