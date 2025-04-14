package com.pluralsight;
import java.util.Scanner;

public class SandwishShop {
    static Scanner scanner = new Scanner(System.in);
    static double sandwishRegularPrice;
    static double sandwishLargePrice;
    static String sandwishSize;
    static int age;
    public static void main(String[] args) {
//        declaring the variables
        getSandwishSize();
        getUserAge();
        calculateAndDisplayTotalPrice();
        scanner.close();
    }
     public static void getSandwishSize(){
//        first method to get the sandwish size from user
        System.out.println("Please select you sandwish size: \n 1) Regular \n 2) Large");
        String sandwishStringSize = scanner.next().trim();
        sandwishSize = sandwishStringSize.equalsIgnoreCase("1") ? "1" : "2";
//         sandwishSize = scanner.next().trim();
     }
     public static void getUserAge(){
//        second method to get the users age
      System.out.println("Please enter your age: ");
      age = scanner.nextInt();
     }
     public static void calculateAndDisplayTotalPrice(){
//        third method to calculate the total based on the discount and price.
        sandwishRegularPrice = 5.45;
         sandwishLargePrice = 8.95;
         double discountStudent = 0.10;
         double discountSenior = 0.20;
        if (sandwishSize.equals("1")) {
            if (age <= 17) {
                double sandwishTotalPrice = sandwishRegularPrice - (sandwishRegularPrice * discountStudent);
                float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
            } else if (age >= 65) {
                double sandwishTotalPrice = sandwishRegularPrice - (sandwishRegularPrice * discountSenior);
                float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
            } else {
                System.out.println("Invalid Input");
            }
        }else if (sandwishSize.equals("2") ) {
            if (age <= 17) {
                double sandwishTotalPrice = sandwishLargePrice - (sandwishLargePrice * discountStudent);
                float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
            } else if (age >= 65) {
                double sandwishTotalPrice = sandwishLargePrice - (sandwishLargePrice * discountSenior);
                float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
            } else {
                System.out.println("Invalid Input");
            }
        } else{
            System.out.println("Invalid Input");
        }
     }

}
