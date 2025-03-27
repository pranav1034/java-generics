package com.bridgelabz.resumescreening;
import java.util.*;

class Resume<T extends JobRole> {
    private List<T> resumeList = new ArrayList<>();

    // Add a resume to the system
    public void addResume(T resume) {
        resumeList.add(resume);
    }

    // Display resumes being processed
    public void displayResumes() {
        for (T resume : resumeList) {
            System.out.println("Candidate: " + resume.getCandidateName());
        }
    }
}