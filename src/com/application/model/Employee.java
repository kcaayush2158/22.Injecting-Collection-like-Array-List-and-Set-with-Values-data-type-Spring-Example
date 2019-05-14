package com.application.model;

import java.util.List;
import java.util.Set;

public class Employee {
    private String namesArray[] = new String[4];
    private List<String>  namesList;
    private Set<Integer> namesSet;

    public String[] getNamesArray() {
        return namesArray;
    }

    public void setNamesArray(String[] namesArray) {
        this.namesArray = namesArray;
    }

    public List<String> getNamesList() {
        return namesList;
    }

    public void setNamesList(List<String> namesList) {
        this.namesList = namesList;
    }

    public Set<Integer> getNamesSet() {
        return namesSet;
    }

    public void setNamesSet(Set<Integer> namesSet) {
        this.namesSet = namesSet;
    }
}
