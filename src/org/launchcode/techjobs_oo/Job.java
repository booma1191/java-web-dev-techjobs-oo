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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        //this.employer.setValue(employer.getValue());
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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
    public String toString() {
        String nameVar;
        String employerVar;
        String locationVar;
        String positionTypeVar;
        String coreCompetencyVar;

//        if (nameVar.equals("")) nameVar = "Data not available";
//        if (employerVar.equals("")) employerVar = "Data not available";
//        if (locationVar.equals("")) locationVar = "Data not available";
//        if (positionTypeVar.equals("")) positionTypeVar = "Data not available";
//        if (coreCompetencyVar.equals("")) coreCompetencyVar = "Data not available";

        if (name == null || name.equals("")) {nameVar = "Data not available";} else {nameVar = name;}
        if (employer == null || employer.getValue().equals("")) {employerVar = "Data not available";} else {employerVar = employer.getValue();}
        if (location == null || location.getValue().equals("")) {locationVar = "Data not available";} else {locationVar = location.getValue();}
        if (positionType == null || positionType.getValue().equals("")) {positionTypeVar = "Data not available";} else {positionTypeVar = positionType.getValue();}
        if (coreCompetency == null || coreCompetency.getValue().equals("")) {coreCompetencyVar = "Data not available";} else {coreCompetencyVar = coreCompetency.getValue();}



        return "\n" +
                "ID: " + id + "\n" +
                "Name: " + nameVar + "\n" +
                "Employer: " + employerVar + "\n" +
                "Location: " + locationVar + "\n" +
                "Position Type: " + positionTypeVar + "\n" +
                "Core Competency: " + coreCompetencyVar + "\n";

//        return "\n" +
//                "ID: " + id + "\n" +
//                "Name: " + name + "\n" +
//                "Employer: " + employer + "\n" +
//                "Location: " + location + "\n" +
//                "Position Type: " + positionType + "\n" +
//                "Core Competency: " + coreCompetency + "\n";
    }
}
