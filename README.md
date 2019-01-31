Basic Calculator Project
> push from 'master'
> figure out a way to create test for certain blocks of code


01/30/2019
> decide to rewrite this entire code to match what I've been learning
    >> going good so far
> original code before new edit is commented out at bottom
>ADDED: a 'directory' at footer to help with variable naming
> finised at a 'switch/case' test
 >> plan to use the 'switch/case' to call the methods that do that math
 
 
 ORIGINAL CODE:
 import java.util.*;
 
 public class Main {
     static Scanner input = new Scanner(System.in);
     static double numOne, numTwo;
     static double finAnwer = 0;
     static int userChoice;
 
     public static void main(String[] args) {
         System.out.println("Welcome to Basic Calculator!");
 
         System.out.println("Enter First Number: ");
         numOne = input.nextDouble();
 
         System.out.println("Enter Second Number: ");
         numTwo = input.nextDouble();
 
         System.out.println("Enter the Method to Calculate: ");
         System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Divide");
         userChoice = input.nextInt();
 
         switch (userChoice) {
             case 1:
                 additionMethod();
                 break;
             case 2:
                 subtractionMethod();
                 break;
             case 3:
                 multiplicationMethod();
                 break;
             case 4:
                 divideMethod();
                 break;
             default:
                System.out.println("Okay? GoodBye!");
                break;
         }
     }
 
     public static void additionMethod() {
         finAnwer = numOne + numTwo;
         System.out.println("Answer: " +finAnwer);
         System.out.println("GoodBye.");
     }
 
     public static void subtractionMethod() {
         finAnwer = numOne - numTwo;
         System.out.println("Answer: " +finAnwer);
         System.out.println("GoodBye.");
     }
 
     public static void multiplicationMethod() {
         finAnwer = numOne * numTwo;
         System.out.println("Answer: " +finAnwer);
         System.out.println("GoodBye.");
     }
 
     public static void divideMethod() {
         finAnwer = numOne / numTwo;
         System.out.println("Answer: " +finAnwer);
         System.out.println("GoodBye.");
     }
 }