package com.bridgelabz.coursemanagement;

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research Paper Submission";
    }
}
