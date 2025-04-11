package com.pluralsight;

public class OpExamples {
    public static void main(String[] args) {
        /*
        * you can equally use float or you can try to explore other data types for operations
        * */
        int a = 20;
        int b = 3;
        int result;
        result = a + b;
        System.out.println("Result is " + result + ". no remainder");
        result = a - b;
        System.out.println("Result is " + result + ". no remainder");
        result = a * b;
        System.out.println("Result is " + result + ". no remainder");
        result = a / b;
        System.out.println("Result is " + result + ". no remainder");
        result = a % b;
        System.out.println("Result is " + result + ". no remainder");


//        Pre/post Increment and Decrement
//        with the Post, the initial value is been used before it is been incremented or decremented
//        With Pre, the value is been incremented or decremented and the new value is used

        /*
        * Looping and Iteration:
        These operators are very common in for loops, while loops, and other iterative structures. They provide a concise way to update loop counters or index values.
           Understanding the pre/post difference is crucial for ensuring that loop conditions and array accesses behave as intended.
        Concise Code:
            They allow for more compact code, especially in situations where you need to increment or decrement a variable within an expression.
         Potential for Errors:
             However, they can also lead to subtle bugs if not used carefully. The order of operations can be tricky, and misusing pre/post operators can result in unexpected values.
         Performance:
              In some very specific low level situations, there can be very slight performance differences between pre and post increment operators. However, in most every day coding, this performance difference is so small it is not worth worrying about.
        * */

//        Post
        int x = 4;
        int y = x++;
//        Here, y takes the original value and increment and stores the original value
        System.out.println("x is " + x);
        System.out.println("y is " + y);


//        Pre
        int z = 4;
        int W = ++z;
//        Here, the original value is being incremented and W uses the new value
        System.out.println("z is " + z);
        System.out.println("W is " + W);


//        lets explore more
        int count = 0;
        while (count < 5){
//            Copies the original value before incrementing or decrementing
            System.out.println("Count is " + count);
            count++;
        }
        System.out.println("\n");
        while (count > 0){
            count--;
            System.out.println("Count is " + count);
        }
        System.out.println("\n");
        while (count < 5){
//            increments or decrements before using the value
            System.out.println("Count is " + ++count);
        }
        System.out.println("\n");
        while (count > 1){
            System.out.println("Count is " + --count);
        }



//        the Maths class returns a double
//        Assignments in Java
//        They include: += -= *= /= %=
    }
}
