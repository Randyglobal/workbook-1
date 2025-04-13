package com.pluralsight;
import java.util.Scanner;

public class CalInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        persforming simple calculation
        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
//        Asking operation
        System.out.println("Enter Operation: e.g -, +, %, / ");
//        i used .trim() method to remove any extra spacing
        String input = scanner.next().trim();

        int result;
        if (input.isEmpty()){
            System.out.println("Invalid Operant");
        } else if (input.equals("+")) {
            result = num1 + num2;
//            System.out.println("Sum is: " + result);
            System.out.println("\uD83D\uDE0A damn bro you got me");
//            I used the Thread.sleep method in java to give a delay, just to have fun
            try {
                Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
//                e in this case stands for error, if the try method doesnt work, the e handles it and the printStackTrace() function prints the error
                e.printStackTrace();
            }
            System.out.println("You know what, i got this \uD83D\uDE03...............");
            try {
                Thread.sleep(3000); // Pause for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("give me a sec, i am almost there \uD83D\uDE03...............");
            try {
                Thread.sleep(4000); // Pause for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I got it bro \uD83D\uDC4D");
            try {
                Thread.sleep(5000); // Pause for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is the final result: " + result);

        } else if (input.equals("-")) {
            result = num1 - num2;
            System.out.println("This is the final result: " + result);

        } else if (input.equals("%")) {
            result = num1 % num2;
            System.out.println("This is the final result: " + result);

        } else if (input.equals("/")) {
            result = num1/num2;
            System.out.println("This is the final result: " + result);

        }else {
            System.out.println("Invalid or Unknown Operant");
        }
    }
}
