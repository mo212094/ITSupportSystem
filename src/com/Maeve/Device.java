package com.Maeve;

public class Device {
    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String Owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected int Priority;

    public Device(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        IdentificationCode = identificationCode;
        MakeAndModel = makeAndModel;
        Owner = owner;
        ProblemDescription = problemDescription;
        RepairNotes = repairNotes;
        Priority = priority;
    }

    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        IdentificationCode = identificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        MakeAndModel = makeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        ProblemDescription = problemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setRepairNotes(String repairNotes) {
        RepairNotes = repairNotes;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    @Override
    public String toString() {
        return "Device{" +
                "IdentificationCode='" + IdentificationCode + '\'' +
                ", MakeAndModel='" + MakeAndModel + '\'' +
                ", Owner='" + Owner + '\'' +
                ", ProblemDescription='" + ProblemDescription + '\'' +
                ", RepairNotes='" + RepairNotes + '\'' +
                ", Priority=" + Priority +
                '}';
    }
}
