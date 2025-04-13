package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you name: ");
        String name = scanner.nextLine();
        System.out.print("Enter working hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter your pay rate: ");
        float payRate = scanner.nextFloat();
        System.out.print("Worked extra hours?:  \n (Y)es \n (N)o");
//        reading the users input as a string
        String overTimeString = scanner.next();
        boolean overTime = overTimeString.equalsIgnoreCase("y");
//        grossPay
        float grossPay;
//        boolean overtime = true;
        int expectedHours = 40;
        float overTimeRate = 1.5f;
//        Passing condition if the user did overtime
        if (hours >= expectedHours && overTime){
            grossPay = overTimeRate * (hours * payRate) ;
            System.out.println("Hello " + name + " your gross pay and over time is " + grossPay);
        }else{
            grossPay = hours * payRate;
            System.out.println("Hello " + name + " your gross pay is " + grossPay);
        }

    }
}
