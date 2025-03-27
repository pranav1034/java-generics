package com.bridgelabz.coursemanagement;

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Final Exam";
    }
}
