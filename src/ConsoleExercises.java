import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput;
        String userInput2;
        String userInput3;
        String userInput4;


        //int input------>
        System.out.println("enter your favorite number");
        userInput = scan.nextInt();
        //sout reply to "int" user input
        System.out.println(userInput + " is the best number...");
        System.out.println("                  ");

        System.out.println("Enter a word");
        userInput2 = scan.next();
        System.out.println("You entered " + userInput2);

        System.out.println("Enter another word");
        userInput3 = scan.next();
        System.out.println("You entered " + userInput3);

        System.out.println("Enter 1 more word");
        userInput4 = scan.next();
        System.out.println("You entered " + userInput4);

        System.out.println(userInput2);
        System.out.println(userInput3);
        System.out.println(userInput4);
        userInput2 = scan.next();
        //sout reply to "string" user input
        System.out.println(userInput2 + " is the best word");


          int userNumber = scan.nextInt();
          System.out.println("You told me that your favorite number is " + userNumber);


          String userString = scan.nextLine();
          System.out.println("You told me that your favorite number is " + userString);




// <===================== another way to format it =====================>

//        System.out.print("Please enter an integer: ");
//        int userInt = sc.nextInt();
//        System.out.println(userInt);
//
//        sc.nextLine(); // enables to skip \n
//
//        System.out.println("Please enter three words");
//
//        String firstWord, secondWord, thirdWord;
//
//
//        firstWord = sc.nextLine();
//        secondWord = sc.nextLine();
//        thirdWord = sc.nextLine();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

        // next() won't capture the whole sentence
//        System.out.println("Enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);



//           <------------ codeup room problem ------------>
//
//        System.out.print("Please enter the room length: ");
//        String lengthString = sc.nextLine();
//        double length = Double.parseDouble(lengthString);
//
//        System.out.print("Please enter the room width: ");
//        String widthString = sc.nextLine();
//        double width = Double.parseDouble(widthString);
//
//
//        double area = width * length;
//        double perimeter = width * 2 + length * 2;
//
//        System.out.printf("%.2f = %.2f x %.2f\n", area, length, width);
//        System.out.printf("%.2f = 2 x %.2f + 2 x %.2f\n", perimeter, length, width);
//        System.out.println(length);

    }
}