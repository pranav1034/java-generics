package com.bridgelabz.resumescreening;
import java.util.List;

class ResumeScreening {
    public static void screenResumes(List<? extends JobRole> resumes) {
        System.out.println("\nScreening Resumes for Multiple Roles:");
        for (JobRole resume : resumes) {
            System.out.println("Candidate: " + resume.getCandidateName() + " | Role: " + resume.getRole());
        }
    }
}