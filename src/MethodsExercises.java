import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        // Exercise 1
//            System.out.println(add(2, 2));
//            System.out.println(subtract(2, 2));
//            System.out.println(multiply(2, 2));
//            System.out.println(divide(2, 10));
//            System.out.println(modulus(100, 2));


        // Exercise 2
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = getInteger(1, 10);
//            System.out.println("Your integer is: " + userInput);

        // Exercise 3

//            Scanner sc = new Scanner(System.in);
//            userInteractionFactorial(sc);

        // Exercise 4

//            rollDiceGame(sc);

    }


// <=============================== EXERCISE 1 ===============================>
    //1. ADDITION method-->
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//    //2. SUBTRACT method-->
//    public static int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//    //3. MULTIPLY method-->
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//    //4. DIVIDE method-->
//    public static int divide(int num1, int num2) {
//        return num1 / num2;
//    }
//    //5. MODULUS method-->
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }



// <=============================== EXERCISE 2 ===============================>

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (!sc.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInteger(min, max);
//        }
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("Number not in range!");
//            return getInteger(min, max);
//        }
//    }

// ANOTHER WAY TO FORMAT/CODE IT---->

//    public static int getInteger(int min, int max) {
//        //prompt user for an input between min and max (V)
//        //store that user input into a variable (V)
//        //check if variable is between min and max
//        //if it is return the variable
//        //if not loop back to step 1
//
//        Scanner scan = new Scanner(System.in);
//        int userInput;
//        do {
//            System.out.println("Enter a number between " + min + " and " + max);
//            userInput = scan.nextInt();
//        } while(userInput < min || userInput > max);
//
//        System.out.println("userInput is within range!");
//        return userInput;
//    }






// <=============================== EXERCISE 3 ===============================>



//    public static long calculateFactorial(int num) {
//        int output = 1;
//        for (int i = 1; i <= num; i += 1) {
//            output *= i;
//        }
//        return output;
//    }

//    public static void userInteractionFactorial(Scanner sc) {
//        boolean willContinue;
//        String userChoice;
//        do {
//            System.out.println("Please enter an integer from 1 to 12");
//            int userInt = getInteger(1, 12);
//            System.out.println(calculateFactorial(userInt));
//            do {
//                System.out.println("Do you wish to continue? [y/n]: ");
//                userChoice = sc.next().trim();
//            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//            willContinue = userChoice.equalsIgnoreCase("y");
//        } while (willContinue);
//    }


// ANOTHER WAY TO FORMAT/CODzE IT---->
//    public static void factorial() {
//        //do the process of calculating factorial
//        //ask the user if they want to continue
//        //prompt
//        //store response into a variable
//        //see if response is "Yes"
//        int resp;
//        do {
//            //prompt user to enter a number between 1 and 10
//            //store user's input into a variable
//            int userInput = getInteger(1, 10);
//            System.out.println("Assigning user input to " + userInput);
//
//            int product = 1;
//            System.out.println("Initialize product variable to 1");
//
//            //use that variable and calculate the factorial using a for loop
//            for (int i = 1; i <= userInput; i++) {
//                System.out.println("Product was " + product);
//                product = product * i;
//                System.out.println("Product is now " + product);
//            }
//
//            //store the result of the factorial in a variable || display the results using sout immediately
//            System.out.println("The result of " + userInput + "! is " + product);
//
//            System.out.println("Hey! You wanna continue? 1) Yes  2) No");
//            resp = getInteger(1, 2);
//        } while (resp == 1);
//        System.out.println("C'ya");
//    }


// <=============================== EXERCISE 4 ===============================>


//    public static int randomWithRange(int min, int max) {
//        int range = (max - min) + 1;
//        return (int)(Math.random() * range) + min;
//    }
//
//    public static void rollDiceGame(Scanner sc) {
//        String userChoice;
//        System.out.print("Please enter the number of sides for the dice: ");
//        int nSides = getInteger(1, 20);
//        do {
//            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
//            do {
//                System.out.println("Would you like to roll again? [y/n]");
//                userChoice = sc.next().trim();
//            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//        } while (!userChoice.equals("n"));
    }
