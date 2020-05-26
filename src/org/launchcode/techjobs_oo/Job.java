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

        this();
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


    public String toString()
    {

        String testString = "ID: " + this.getId();
        String testString2 = "Name: " + this.getName();
        String testString3 = "Employer: " + this.getEmployer();
        String testString4 = "Location: " + this.getLocation();
        String testString5 = "Position Type: " + this.getPositionType ();
        String testString6 = "Core Competency: " + this.getCoreCompetency ();
        //String dataNotAvailable = "Data not available" +this.name;
        return testString + "\n" +
                testString2  + "\n" +
                testString3 + "\n" +
                testString4 + "\n" +
                testString5 + "\n" +
                testString6 ;



    }
}

   //?????

//TO STRING EXAMPLE?
//Student person = new Student("Violet");
//System.out.println(testString.toString());

// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

