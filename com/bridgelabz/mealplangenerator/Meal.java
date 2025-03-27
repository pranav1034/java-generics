package com.bridgelabz.mealplangenerator;
import java.util.ArrayList;
import java.util.List;

// Generic Meal Class
class Meal<T extends MealPlan> {
    private List<T> mealList = new ArrayList<>();

    public void addMeal(T meal) {
        mealList.add(meal);
    }

    // Display meal plan
    public void displayMeals() {
        System.out.println("\nPersonalized Meal Plan:");
        for (T meal : mealList) {
            System.out.println(" - " + meal.getMealType());
        }
    }
}
