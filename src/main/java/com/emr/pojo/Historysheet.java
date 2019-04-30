package com.emr.pojo;

import java.util.Date;

public class Historysheet {
    private String hId;

    private String hName;

    @Override
	public String toString() {
		return "Historysheet [hId=" + hId + ", hName=" + hName + ", hAge=" + hAge + ", hBirth=" + hBirth + ", hGender="
				+ hGender + ", hAsk=" + hAsk + ", hJudge=" + hJudge + ", hCreate=" + hCreate + ", hModified="
				+ hModified + ", hDep=" + hDep + ", hDoctor=" + hDoctor + ", hDrug=" + hDrug + "]";
	}

	private String hAge;

    private String hBirth;

    private String hGender;

    private String hAsk;

    private String hJudge;

    private Date hCreate;

    private Date hModified;

    private String hDep;

    private String hDoctor;

    private String hDrug;

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName == null ? null : hName.trim();
    }

    public String gethAge() {
        return hAge;
    }

    public void sethAge(String hAge) {
        this.hAge = hAge == null ? null : hAge.trim();
    }

    public String gethBirth() {
        return hBirth;
    }

    public void sethBirth(String hBirth) {
        this.hBirth = hBirth == null ? null : hBirth.trim();
    }

    public String gethGender() {
        return hGender;
    }

    public void sethGender(String hGender) {
        this.hGender = hGender == null ? null : hGender.trim();
    }

    public String gethAsk() {
        return hAsk;
    }

    public void sethAsk(String hAsk) {
        this.hAsk = hAsk == null ? null : hAsk.trim();
    }

    public String gethJudge() {
        return hJudge;
    }

    public void sethJudge(String hJudge) {
        this.hJudge = hJudge == null ? null : hJudge.trim();
    }

    public Date gethCreate() {
        return hCreate;
    }

    public void sethCreate(Date hCreate) {
        this.hCreate = hCreate;
    }

    public Date gethModified() {
        return hModified;
    }

    public void sethModified(Date hModified) {
        this.hModified = hModified;
    }

    public String gethDep() {
        return hDep;
    }

    public void sethDep(String hDep) {
        this.hDep = hDep == null ? null : hDep.trim();
    }

    public String gethDoctor() {
        return hDoctor;
    }

    public void sethDoctor(String hDoctor) {
        this.hDoctor = hDoctor == null ? null : hDoctor.trim();
    }

    public String gethDrug() {
        return hDrug;
    }

    public void sethDrug(String hDrug) {
        this.hDrug = hDrug == null ? null : hDrug.trim();
    }
}