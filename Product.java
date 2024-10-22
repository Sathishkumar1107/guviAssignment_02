package com.java.Demos;

import java.util.Scanner;

public class Product {
    int pid;
    double price;
    int quantity;


    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    static class XYZ {

        // Method to calculate total spent on all products
        public double calculateTotalSpent(Product[] products) {
            double total = 0;
            for (Product product : products) {
                total += product.price * product.quantity;
            }
            return total;
        }

        // Main function
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create an array to store 5 products
            Product[] products = new Product[5];

            // Accept 5 products' information from the user
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter product " + (i + 1) + " details:");
                System.out.print("Product ID: ");
                int pid = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();

                // Store the product in the array
                products[i] = new Product(pid, price, quantity);
            }

            // Finding the product with the highest price
            int highestPricePid = products[0].pid;
            double highestPrice = products[0].price;
            for (int i = 1; i < products.length; i++) {
                if (products[i].price > highestPrice) {
                    highestPrice = products[i].price;
                    highestPricePid = products[i].pid;
                }
            }

            // Display the product ID with the highest price
            System.out.println("The Product ID with the highest price is: " + highestPricePid);

            // Creating an instance of XYZ to call calculateTotalSpent method
            XYZ xyz = new XYZ();
            double totalSpent = xyz.calculateTotalSpent(products);

            // Display the total spent on all products
            System.out.println("The total amount spent on all products is: " + totalSpent);
        }
    }
}

