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
    public Job(String name,  employer,
                   location, positionType, coreCompetency) {
        this.name = name;
        this.employer = employeer;
        this.location = location;
        this.positionType = gpa;
        this.coreCompetency = coreCompetency

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals ( name, job.name ) &&
                Objects.equals ( employer, job.employer ) &&
                Objects.equals ( location, job.location ) &&
                Objects.equals ( positionType, job.positionType ) &&
                Objects.equals ( coreCompetency, job.coreCompetency );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( id, name, employer, location, positionType, coreCompetency );
    }



// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
