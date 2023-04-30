package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int iD;
    private int nextId = 1;
    private String value;

    public JobField() {
        this.iD = nextId;
        nextId++;
    }
    public JobField(String aValue){
        this();
        this.value = aValue;
    }

    public int getId() {
        return iD;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return iD == that.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(iD, value);
//    }
}
