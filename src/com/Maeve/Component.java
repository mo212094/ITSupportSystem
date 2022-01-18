package com.Maeve;

public class Component extends Laptop {
    private String name;
    private double cost;


    public Component(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
