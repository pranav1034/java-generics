package com.bridgelabz.mealplangenerator;
import java.util.List;

class MealPlanGenerator {
    public static void generatePlan(List<? extends MealPlan> meals) {
        System.out.println("\nCustomised Meal Plan:");
        for (MealPlan meal : meals) {
            System.out.println(" - " + meal.getMealType());
        }
    }
}
