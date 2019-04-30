package com.emr.pojo;

public class Drug {
    private String drId;

    private String drName;

    private String drSpec;

    private String drUse;

    private String drBelong;

    public String getDrId() {
        return drId;
    }

    public void setDrId(String drId) {
        this.drId = drId == null ? null : drId.trim();
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName == null ? null : drName.trim();
    }

    public String getDrSpec() {
        return drSpec;
    }

    public void setDrSpec(String drSpec) {
        this.drSpec = drSpec == null ? null : drSpec.trim();
    }

    public String getDrUse() {
        return drUse;
    }

    public void setDrUse(String drUse) {
        this.drUse = drUse == null ? null : drUse.trim();
    }

    public String getDrBelong() {
        return drBelong;
    }

    public void setDrBelong(String drBelong) {
        this.drBelong = drBelong == null ? null : drBelong.trim();
    }
}