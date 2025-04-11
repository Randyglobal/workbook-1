package com.pluralsight;
import java.util.Random;

import java.util.Random;

public class MathApp {

    public static void main(String[] args) {
//        Question1
        int bobSalary = 2000, garySalary = 3000;
//        Q2
        int carPrice = 2500, truckPrice = 3500;
//        Q3
        float radius = 7.25f;
        float PI = 3.14f;
//        Q4
        double squareNumber = 5.0;
//        Q5
//        Distance between points
//        finding x and y
        double x1 = 5, x2 = 85, y1 = 10, y2 = 50;
//        finding the difference in points
        double differenceInPointsX = x2 - x1;
        double differenceInPointsY = y2 - y1;
//        getting their value when squared
        double squareofValuestoAddX = Math.pow(differenceInPointsX, 2);
        double squareofValuestoAddY = Math.pow(differenceInPointsY, 2);
//        overall distance between two points \/((x2-x1)*2 + (y2 -y1)*2)
        double distanceBetweenPoints = Math.sqrt(squareofValuestoAddX + squareofValuestoAddY);

//        Q6
        double number = -3.8;
        double absAnswer = Math.abs(number);

//        Q7
        Random random = new Random();
        double randomNumber = random.nextDouble(0, 1);

        double squareRoot = Math.sqrt(squareNumber);
        double Area = PI * (radius * radius);
        int maxPrice = Math.max(carPrice, truckPrice);
        int minPrice = Math.min(carPrice, truckPrice);
        int highestSalary = Math.max(bobSalary, garySalary);
//        Answer 1
         System.out.println("The highest salary is, " + highestSalary + "$");
//         Answer2
        System.out.println("The highest Price is, " + maxPrice + "$");
        System.out.println("The lowest Price is, " + minPrice + "$");
//        Answer3
        System.out.println("The Area of a circle is, " + Area + "cm");
//        answer4
        System.out.println("The square root of " + squareNumber + " is, " + squareRoot);
//        Answer5
         System.out.println("The distance between two points is, " + distanceBetweenPoints + "cm");
//         Answer 6
         System.out.println("The square root of " + number + " is, " + absAnswer);
//         Answer7
         System.out.println("The random numbers are " + randomNumber);
    }

}
