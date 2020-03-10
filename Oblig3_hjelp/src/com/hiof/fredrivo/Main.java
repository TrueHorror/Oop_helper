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
        System.out.println(solarSystem.getLargestPlanet().getName() + " is the larges planet in " + solarSystem.getName());
        System.out.println(solarSystem.getSmallestPlanet().getName() + " is the smallest planet in " + solarSystem.getName());

        System.out.println(solarSystem.getPlanetByName("Earth"));

        //Planets with MORE data
        Planet mercury2 = new Planet("Mercury", 3.283E23,2439.7, 0.387, 0.206, 88, sun);
        Planet venus2 = new Planet("Venus", 4.867E24,6051.8, 0.723, 0.007, 225,sun);
        Planet earth2 = new Planet("Earth", 5.972E24,6371, 1, 0.017, 365,sun);
        Planet mars2 = new Planet("Mars", 6.39E23,3389.5, 1.524, 0.093, 687,sun);
        Planet jupiter2 = new Planet("Jupiter", 1.898E27,69911, 5.20440, 0.049, 4380,sun);
        Planet saturn2 = new Planet("Saturn", 5.683E26,58232, 9.5826, 0.057, 10585,sun);
        Planet uranus2 = new Planet("Uranus", 8.681E25,25362, 19.2184, 0.046, 30660,sun);
        Planet neptune2 = new Planet("Neptune", 1.024E26,24622, 30.11, 0.010, 60225, sun);

        //Degree parameter should come from another method returning degree after x days of orbit.
        System.out.println(earth2.getName() + " has a distance of " + String.format("%,d", earth2.distanceToCentralCelestialBody(0)) + "km to its center celestial body, the " + earth2.getCentralCelestialBody().getName());


        System.out.println("At a distance of " + String.format("%,d", earth2.distanceToCentralCelestialBody(0)) + "km, " + earth2.getName() + " has a velocity of " + earth2.orbitingVelocity(earth2.distanceToCentralCelestialBody(0)) + "km/s");

    }
}
