package com.bridgelabz.resumescreening;

abstract class JobRole {
    protected String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getRole() {
        return this.getClass().getSimpleName();
    }

    public String getCandidateName() {
        return candidateName;
    }
}
