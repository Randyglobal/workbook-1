package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
   static Scanner scanner = new Scanner(System.in);
   static double electronicToll;
    static String electronicTollS;
   static double gps;
    static String gpsS;
   static double roadSideAssistance;
    static String roadSideAssistanceS;
   static int age;
   static int daysSpent;
    public static void main(String[] args) {
        getUserPrompts();
        calculateAndDisplayResult();
        scanner.close();
    }
    public static void getUserPrompts(){
        System.out.println("Please enter a pickup date: ");
        String pickUpDate = scanner.nextLine();
        System.out.println("For how many days will you need the car: ");
        daysSpent = scanner.nextInt();
        System.out.println("Need electronic toll? (Y)es (N)o: ");
        String electronicTollString = scanner.next();
        electronicTollS = electronicTollString.equalsIgnoreCase("y") ? "Y" : "N";
        System.out.println("Do you need GPS? (Y)es (N)o: ");
        String gpsToll = scanner.next();
        gpsS = gpsToll.equalsIgnoreCase("y") ? "Y" : "N";
        System.out.println("Do you need road assistance? (Y)es (N)o: ");
        String roadAssistanceString = scanner.next();
        roadSideAssistanceS = roadAssistanceString.equalsIgnoreCase("y") ? "Y" : "N";
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
    }
    public static void calculateAndDisplayResult(){
       electronicToll = 3.95;
       gps = 2.95;
       roadSideAssistance = 3.95;
       double ageReferal = 0.30;
       double carRental = 29.99;
       double totalCharge = 0;
//       Basic car rent
       totalCharge = carRental * daysSpent;
       System.out.println("Your Basic car rental is: " + totalCharge);
        if (electronicTollS.equalsIgnoreCase("Y")) {
            totalCharge += electronicToll;
//            System.out.println("Your electric option is: " + totalCharge);
        }
        if (gpsS.equalsIgnoreCase("Y")) {
            totalCharge += gps;
//            System.out.println("Your gps option is: " + totalCharge);
        }
        if (roadSideAssistanceS.equalsIgnoreCase("Y")) {
            totalCharge += roadSideAssistance;
            System.out.println("Your options cost is: " + totalCharge);
        }
            if (age <= 25) {
                totalCharge += totalCharge * ageReferal;
                System.out.println("Underage driver surchase: " + totalCharge);
            }
            System.out.println("Your total cost is: " + totalCharge);
        }
}
