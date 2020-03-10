package com.hiof.fredrivo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Task 2.1 and 2.2. Creating a sun object and some planet objects
        Star sun = new Star("Sun", 1.98892E30, 695342, 5777);

        Planet mercury = new Planet("Mercury", 3.28E23, 2439.7);
        Planet venus = new Planet("Venus", 4.867E24, 6051.8);
        Planet earth = new Planet("Earth", 5.972E24, 6371);
        Planet mars = new Planet("Mars", 6.39E23, 3389.5);
        Planet jupiter = new Planet("Jupiter", 1.898E27, 69911);
        Planet saturn = new Planet("Saturn", 5.683E26, 58232);
        Planet uranus = new Planet("Uranus", 8.681E25, 25362);
        Planet neptune = new Planet("Neptune", 1.024E26, 24622);


        //Making an ArrayList to hold all the planets. The ArrayList called allPlanets will be used
        //when we make the PlanetSystem object later.
        ArrayList<Planet> allPlanets = new ArrayList<>();
        allPlanets.add(mercury);
        allPlanets.add(venus);
        allPlanets.add(earth);
        allPlanets.add(mars);
        allPlanets.add(jupiter);
        allPlanets.add(saturn);
        allPlanets.add(uranus);
        allPlanets.add(neptune);

        //The solar system contains the sun and an ArrayList called allPlanets of all planet objects created above.
        PlanetSystem solarSystem = new PlanetSystem("Solar System", sun, allPlanets);

        System.out.println(earth);
        System.out.println(sun);
        System.out.println(solarSystem);

        //Mjup and Rjup for Saturn:
        System.out.println(saturn.calcMassInMjup() + saturn.calcRadiusInRjup());

        //Msun and Rsun for the Sun?? Okey...? Expecting 1Ms and 1Rs.
        System.out.println(sun.calcMassInMsun() + sun.calcRadiusInRsun());

        //Surface gravity of Neptune:
        System.out.println(neptune.surfaceGravity());

        //Task 2.6
        //I give up... Zzzz...
        Planet largestPlanetBasedOnRadius;
        Planet smallestPlanetBasedOnRadius;

        for (Planet p: solarSystem.getPlanets()) {

        }



    }
}
