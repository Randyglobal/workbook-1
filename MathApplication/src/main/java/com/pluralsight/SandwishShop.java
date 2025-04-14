package com.pluralsight;
import java.util.Scanner;

public class SandwishShop {
    static Scanner scanner = new Scanner(System.in);
    static double sandwishRegularPrice;
    static double sandwishLargePrice;
    static String sandwishSize;
    static  String sandwishLoaded;
    static  double sandwishRegularLoaded;
    static  double sandwishLargeLoaded;
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
        System.out.println("Do you want the sandwish loaded?: \n (Y)es \n (N)o");
        String sandwishStringLoaded = scanner.next().trim();
        sandwishLoaded = sandwishStringLoaded.equalsIgnoreCase("Y") ? "Y" : "N";
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
         sandwishRegularLoaded = 1.00;
         sandwishLargeLoaded = 1.75;
         double discountStudent = 0.10;
         double discountSenior = 0.20;
        if (sandwishSize.equals("1")) {
            if (age <= 17) {
                double sandwishTotalPrice = sandwishRegularPrice - (sandwishRegularPrice * discountStudent);
                if (sandwishLoaded.equals("Y")) {
                    sandwishTotalPrice = sandwishTotalPrice + sandwishRegularLoaded;
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }else{
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }

            } else if (age >= 65) {
                double sandwishTotalPrice = sandwishRegularPrice - (sandwishLargePrice * discountSenior);
                if (sandwishLoaded.equals("Y")) {
                    sandwishTotalPrice = sandwishTotalPrice + sandwishLargeLoaded;
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }else{
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }
            } else {
                System.out.println("Invalid Input");
            }
        }else if (sandwishSize.equals("2") ) {
            if (age <= 17) {
                double sandwishTotalPrice = sandwishRegularPrice - (sandwishRegularPrice * discountStudent);
                if (sandwishLoaded.equals("Y")) {
                    sandwishTotalPrice = sandwishTotalPrice + sandwishRegularLoaded;
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }else{
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }
            } else if (age >= 65) {
                double sandwishTotalPrice = sandwishLargePrice - (sandwishLargePrice * discountSenior);
                if (sandwishLoaded.equals("Y")) {
                    sandwishTotalPrice = sandwishTotalPrice + sandwishLargeLoaded;
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }else{
                    float sandwishTotalPriceFloat = (float) sandwishTotalPrice;
                    System.out.println("Your total price is $ " + sandwishTotalPriceFloat);
                }
            } else {
                System.out.println("Invalid Input");
            }
        } else{
            System.out.println("Invalid Input");
        }
     }

}
