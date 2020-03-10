package com.hiof.fredrivo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NaturalSatelite extends CelistialBody {
    private double semiMajorAxis; //Distance from parent celestial body
    private double eccentricity; //Number between 0 and 1 describing ellipse
    private int orbitalPeriod; //Duration of one orbit in earth days
    private CelistialBody centralCelestialBody;
    //Initialized with 1 for now. Should have method for changing this.
    private int bodysDegree = 0;


    public NaturalSatelite(String name, double mass, double radius, double semiMajorAxis, double eccentricity, int orbitalPeriod, CelistialBody centralCelestialBody) {
        super(name, mass, radius);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public NaturalSatelite(String name, double mass, double radius) {
        super(name, mass, radius);
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public CelistialBody getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(CelistialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }

    public int getBodysDegree() {
        return bodysDegree;
    }

    public void setBodysDegree(int planetsDegree) {
        this.bodysDegree = planetsDegree;
    }

    private double convertAUtoKM(double au){
        return au * getAuInKilometer();
    }

    public double convertKMtoM(double distance){
        return distance * 1000;
    }

    public int  distanceToCentralCelestialBody(double degree){
        double planetsAU = (this.semiMajorAxis * (1 - Math.pow(this.eccentricity, 2)) / (1 + this.eccentricity * Math.cos(degree)));
        return (int)convertAUtoKM(planetsAU);
    }

    public double orbitingVelocity(double distance){

        double v = getGRAVITYconstant() * this.centralCelestialBody.getMass() / convertKMtoM(distance);
        //Divided by 1000 to get velocity in km/s
        v = Math.sqrt(v)/1000;


        BigDecimal bd = new BigDecimal(Double.toString(v));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


}
