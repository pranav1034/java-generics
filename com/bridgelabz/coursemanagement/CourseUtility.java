package com.bridgelabz.coursemanagement;
import java.util.List;

class CourseUtility {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        System.out.println("\nAll Courses:");
        for (CourseType course : courses) {
            System.out.println(course.getCourseName() + " - Evaluation: " + course.getEvaluationMethod());
        }
    }
}
