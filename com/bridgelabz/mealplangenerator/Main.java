package com.bridgelabz.mealplangenerator;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create different meal options
        Vegetarian vegMeal = new Vegetarian();
        Vegan veganMeal = new Vegan();
        Keto ketoMeal = new Keto();
        HighProtein highProteinMeal = new HighProtein();

        // Create meal plans for different users
        Meal<Vegetarian> vegPlan = new Meal<>();
        Meal<Vegan> veganPlan = new Meal<>();
        Meal<Keto> ketoPlan = new Meal<>();
        Meal<HighProtein> highProteinPlan = new Meal<>();

        // Add meals to their respective plans
        vegPlan.addMeal(vegMeal);
        veganPlan.addMeal(veganMeal);
        ketoPlan.addMeal(ketoMeal);
        highProteinPlan.addMeal(highProteinMeal);

        // Display individual plans
        vegPlan.displayMeals();
        veganPlan.displayMeals();
        ketoPlan.displayMeals();
        highProteinPlan.displayMeals();

        // Combine all meals into a single list and generate a dynamic meal plan
        List<MealPlan> customPlan = new ArrayList<>();
        customPlan.add(vegMeal);
        customPlan.add(veganMeal);
        customPlan.add(highProteinMeal);
        customPlan.add(ketoMeal);

        // Generate and display personalized meal plan
        MealPlanGenerator.generatePlan(customPlan);
    }
}
