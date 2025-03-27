package com.bridgelabz.coursemanagement;
import java.util.ArrayList;
import java.util.List;

// Generic Course Class
class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    // Method to add a course
    public void addCourse(T course) {
        courseList.add(course);
    }

    // Method to display courses
    public void displayCourses() {
        System.out.println("\nCourses Offered:");
        for (T course : courseList) {
            System.out.println(course.getCourseName() + " - Evaluation: " + course.getEvaluationMethod());
        }
    }
}
