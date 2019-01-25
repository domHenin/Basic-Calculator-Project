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


//TODO:
//additionMethod()
//subtractionMethod()
//multiplicationMethod()
//divideMethod()