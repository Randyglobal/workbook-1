package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
//    making the Scanner static so it can be accessible by other methods
    static Scanner scanner = new Scanner(System.in);
//    Declaring all static variables to be able to use along the code.
    static int hours;
    static float payRate;
    static int expectedHours;
    static float overTimeRate;
    static  boolean overTime;
    static String name;

    public static void main(String[] args) {
        simplePayRoll();
        conditionalPayRoll();
        closingScanner();
    }
    public static void simplePayRoll(){
        expectedHours = 40;
        overTimeRate = 1.5f;

        System.out.println("Enter you name: ");
         name = scanner.nextLine();
        System.out.print("Enter working hours: ");
        hours = scanner.nextInt();
        System.out.print("Enter your pay rate: ");
        payRate = scanner.nextFloat();
        System.out.print("Worked extra hours?:  \n (Y)es \n (N)o");
//        reading the users input as a string
        String overTimeString = scanner.next();
        overTime = overTimeString.equalsIgnoreCase("y");
//        grossPay


    }
    public static void conditionalPayRoll(){
        //        Passing condition if the user did overtime
        float grossPay;
        if (hours >= expectedHours && overTime){
            grossPay = overTimeRate * (hours * payRate) ;
            System.out.println("Hello " + name + " your gross pay and over time is " + grossPay);
        }else{
            grossPay = hours * payRate;
            System.out.println("Hello " + name + " your gross pay is " + grossPay);
        }
    }

    public static void closingScanner() {
        scanner.close();
    }
}
