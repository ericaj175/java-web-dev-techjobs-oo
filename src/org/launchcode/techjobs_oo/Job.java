package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
/////////////////////////

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer,
               Location location, PositionType positionType, CoreCompetency coreCompetency) {

        this ();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( id, name, employer, location, positionType, coreCompetency );
    }

    public String toString() {
    String testString = "ID: " + this.getId ();
//        String testString2 = "Name: " + this.getName ();
//        String testString3 = "Employer: " + this.getEmployer ();
//        String testString4 = "Location: " + this.getLocation ();
//        String testString5 = "Position Type: " + this.getPositionType ();
//        String testString6 = "Core Competency: " + this.getCoreCompetency ();
//        String dataNotAvailable = "Data not available";

        String nameString;
        if (this.getName() == null ||
        this.getName().isEmpty ()){
            nameString = "Name: " + "Data not available";
        } else
            nameString = "Name: " + this.getName ();
        ////////////

        String employerString;
        if (this.getEmployer () == null) {
            employerString = "Employer: " + "Data not available";
        } else {
            employerString = "Employer: " + this.getEmployer ();
        }
        /////////

        String locationString;
        if (this.getLocation () == null) {
            locationString = "Location: " + "Data not available";
        } else {
            locationString = "Location: " + this.getLocation ();
        }
        ////////

        String positionTypeString;
        if (this.getPositionType () == null) {
            positionTypeString = "Position Type: " + "Data not available";
        } else {
            positionTypeString = "Position Type: " + this.getPositionType ();
        }
        //////////

        String CoreCompetencyString;
        if (this.getCoreCompetency () == null) {
            CoreCompetencyString = "Core Competency: " + "Data not available";
        } else CoreCompetencyString = "Core Competency: " + this.getCoreCompetency ();

    return testString +"\n"+
    nameString +"\n"+
    employerString +"\n"+
    locationString +"\n"+
    positionTypeString +"\n"+
    CoreCompetencyString;

}}