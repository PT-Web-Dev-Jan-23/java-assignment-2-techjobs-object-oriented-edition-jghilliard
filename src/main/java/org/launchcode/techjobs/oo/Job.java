package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        name = aName;
        employer = aEmployer;
        location =aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job that = (Job) o;
        return id == that.id;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, employer, location, positionType, coreCompetency);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {name = aName;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer aEmployer) {
        employer = aEmployer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location aLocation) {location = aLocation;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType aPositionType) {
        positionType = aPositionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency aCoreCompetency) {
        coreCompetency = aCoreCompetency;
    }

//    ID:  _______
//    Name: _______
//    Employer: _______
//    Location: _______
//    Position Type: _______
//    Core Competency: _______
    @Override
    public String toString(){

        String jobString = "\n" +
                "ID: " + this.id + "\n";
        if (this.name == ""){
            jobString += "Name: Data not available" + "\n";
        } else {jobString +="Name: " + this.name + "\n";}
        if (employer.getValue() == ""){
            jobString += "Employer: Data not available" + "\n";
        } else {jobString +="Employer: " + employer.getValue() + "\n";}
        if (location.getValue() == ""){
            jobString += "Location: Data not available" + "\n";
        } else {jobString +="Location: " + location.getValue() + "\n";}
        if (positionType.getValue() == ""){
            jobString += "Position Type: Data not available" + "\n";
        } else {jobString +="Position Type: " + positionType.getValue() + "\n";}
        if (coreCompetency.getValue() == ""){
            jobString += "Core Competency: Data not available" + "\n";
        } else {jobString +="Core Competency: " + coreCompetency.getValue() + "\n";}

        return jobString;
    }

}
