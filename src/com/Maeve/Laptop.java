package com.Maeve;

import java.util.ArrayList;

public class Laptop extends Device{
    private Arraylist<Component> Components = new Arraylist<>();

    public Laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority, Arraylist<Component> components) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
        Components = components;
    }

    public Arraylist<Component> getComponents() {
        return Components;
    }
}
