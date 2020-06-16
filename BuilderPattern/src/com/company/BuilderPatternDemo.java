package com.company;

public class BuilderPatternDemo  {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("\nVeg Meal");
        vegMeal.showItems();
        System.out.println("\nTotal cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("\nTotal Cost: " + nonVegMeal.getCost());
    }
}
