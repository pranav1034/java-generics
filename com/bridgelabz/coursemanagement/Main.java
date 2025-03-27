package com.bridgelabz.coursemanagement;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Create courses
        ExamCourse math101 = new ExamCourse("Mathematics 101");
        AssignmentCourse cs101 = new AssignmentCourse("Computer Science 102");
        ResearchCourse aiResearch = new ResearchCourse("AI Research");

        // Create course management systems for each type
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Add courses to their respective lists
        examCourses.addCourse(math101);
        assignmentCourses.addCourse(cs101);
        researchCourses.addCourse(aiResearch);

        // Display individual course lists
        examCourses.displayCourses();
        assignmentCourses.displayCourses();
        researchCourses.displayCourses();

        // Combine all courses into a single list and display using wildcards
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math101);
        allCourses.add(cs101);
        allCourses.add(aiResearch);

        // Display all courses dynamically
        CourseUtility.displayAllCourses(allCourses);
    }
}