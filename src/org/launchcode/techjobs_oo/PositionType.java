package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType(String value) {
        super(value);
    }
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }

//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }

   //IS THIS RIGHT?!?!? /
        public String toString() {
        return getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return id == that.id &&
                Objects.equals ( value, that.value );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( id, value );
    }
    //return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    //}
    //
    //Student person = new Student("Violet");
    //System.out.println(person.toString());

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
