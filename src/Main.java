import java.util.*;

class SolveForAnswer {
    Scanner input = new Scanner(System.in);
    double firInp;
    double secInp;
    double numAns;
    int usrChoice;
//    double firInput;
//    double secInput;


    double addNumber(){
        double numAns = firInp + secInp;
        return numAns;
    }

    double subNumber() {
        double numAns = firInp - secInp;
        return numAns;
    }

    double multNumber() {
        double numAns = firInp * secInp;
        return numAns;
    }

    double divNumber() {
        double numAns = firInp / secInp;
        return numAns;
    }

    void welcomeUser() {
        System.out.println("Welcome to Basic Calculator!");
    }

    void getIntput() {
        System.out.println("Enter first number: ");
        firInp = input.nextDouble();

        System.out.println("Enter seconds number: ");
        secInp = input.nextDouble();
    }

    void getChoice() {
        System.out.println("Enter the Method to Calculate: ");
        System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Divide");

        usrChoice= input.nextInt();
    }


}
public class Main {
    public static void main(String[] args) {
        SolveForAnswer solvedAns = new SolveForAnswer();

        solvedAns.welcomeUser();
        solvedAns.getIntput();
        solvedAns.getChoice();

        switch (solvedAns.usrChoice) {
            case 1:
                System.out.println("Answer: " +solvedAns.addNumber());
                break;
            case 2:
                System.out.println("Answer: " +solvedAns.subNumber());
                break;
            case 3:
                System.out.println("Answer: " +solvedAns.multNumber());
                break;
            case 4:
                System.out.println("Answer: " +solvedAns.divNumber());

                default:
                    System.out.println("Ok? Good Bye.");
                    break;
        }

//        System.out.println("Answer: " + solvedAns.subNumber());

//        solvedAns.addNumber();
//        System.out.println("Welcome to Basic Calculator!");

//        System.out.println("Enter First Number: ");
//        System.out.println("Enter Second Number: ");


//        System.out.println("Enter the Method to Calculate: ");
//        System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Divide");
    }
}


//TODO:
//additionMethod()
//subtractionMethod()
//multiplicationMethod()
//divideMethod()

//DIRECTORY:
//firInp --> 'first input'
//secInp --> 'second input'
//addAns --> 'add answer'
//numAns --> 'number answer'
//solvedAns --> 'solved answer'
//firInput --> 'first input'
//secInput --> 'second input'
//usrChoice --> 'user choice'



