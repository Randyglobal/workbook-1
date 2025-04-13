package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please Select an option:");
        System.out.println("Possible Calculations: \n (A)dd \n (S)ubtract \n (M)ultiply \n (D)ivide");
         String action = scanner.next().trim();
        int result;
        if(action.isEmpty()){
           System.out.print("Invalid Action");
        }else if(action.equalsIgnoreCase("a")){
            result = firstNumber * secondNumber;
            System.out.println("Result = " + result);
        }else if(action.equalsIgnoreCase("s")){
            result = firstNumber * secondNumber;
            System.out.println("Result = " + result);
        }else if(action.equalsIgnoreCase("m")){
            result = firstNumber * secondNumber;
            System.out.println("Result = " + result);
        }else if(action.equalsIgnoreCase("d")){
            result = firstNumber * secondNumber;
            System.out.println("Result = " + result);
        }else{
            System.out.println("Invalid Access");
        }

    }
}
