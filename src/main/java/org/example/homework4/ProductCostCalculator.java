package org.example.homework4;

public class ProductCostCalculator {
    public static void main(String[] args) {
        double unitPrice = 10.0;
        int quantity = 15;
        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total Cost of the product: " + totalCost);
    }
    public static double calculateTotalCost(double unitPrice, int quantity) {
        double totalCost = unitPrice * quantity;
        if (quantity > 10 && quantity <= 20) {
            totalCost *= 0.95;
        } else if (quantity > 20 && quantity <= 30) {
            totalCost *= 0.90;
        } else if (quantity > 30 && quantity <= 80) {
            totalCost *= 0.88;

            int extraUnits = quantity - 30;
            totalCost -= extraUnits * (unitPrice * 0.004);
        } else if (quantity > 80) {
            totalCost *= 0.87;
        }
        return totalCost;
    }
}
