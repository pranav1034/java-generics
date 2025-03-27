package com.bridgelabz.coursemanagement;

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignments & Projects";
    }
}
