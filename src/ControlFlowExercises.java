import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//#1.
// ============================== while loop problem ==================================>

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//#2.
// ============================== do while problem ==============================

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);


//#3.
// <===================== altering same loop to count down from 100 to -5 ======================>

 //count backwards-->

//         int i = 100;
//         do {
//             System.out.println(i);
//             i -= 5;
//         } while(i >= -10);

//--> Done with "FOR LOOP"

//        for(int i = 5; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//#4.
// ============================== NUMBER SQUARED ==============================>

//         long i = 2;
//         do {
//             System.out.println(i);
//             i *= i;
//         } while(i < 1000000L);

//--> Done with "FOR LOOP"

//       for(int i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }



//#2. ============================ FIZZ BUZZ ========================

//        boolean fizzBuzz = true;
//
//        for(int i = 0; i <= 100; i++) {
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//                fizzBuzz = false;
//            }
//
//            if(i % 5 == 0) {
//                System.out.println("Buzz");
//                fizzBuzz = false;
//            }
//
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            }
//
//            if (fizzBuzz) {
//                System.out.println(i);
//            }
//            fizzBuzz = true;
//        }

// another way to format/code it


//        for(int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }



// ================================ DISPLAY A TABLE OF POWERS ==============================>


//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output

        //EX.
        //What number would you like to go up to? 5


/*
                        number | squared | cubed
                        ------ | ------- | -----
                        1      | 1       | 1
                        2      | 4       | 8
                        3      | 9       | 27
                        4      | 16      | 64
                        5      | 25      | 125
*/


//ANSWER-->

//   Scanner sc = new Scanner(System.in);
//            boolean willContinue = true;
//
//            do {
//                System.out.print("What number would you like to go up to? ");
//                int userInt = sc.nextInt();
//
//                System.out.println("\nHere is your table!");
//                System.out.println("\nnumber | squared | cubed");
//                System.out.println("------ | ------- | -----");
//
//                for (int i = 1; i <= userInt; i += 1) {
//                    String output = "";
//                    output += String.format("%-7d", i);
//                    output += String.format("|%-9d", i * i);
//                    output += String.format("|%d", i * i * i);
//                    System.out.println(output);
//                }
//
//                System.out.print("\nDo you wish to continue? [y/n]");
//                String userChoice = sc.next();
//                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//                    willContinue = true;
//                } else {
//                    willContinue = false;
//                }
//
//            } while (willContinue);


 // ============================ CONVERT GIVEN NUMBER GRADES INTO LETTER GRADES ========================>

//        Scanner scc = new Scanner(System.in);
//        String userChoice;
//
//        do {
//
//            System.out.print("Please enter a numeric grade: ");
//            int gradeEntered = scc.nextInt();
//            char letterGrade = ' ';
//
//            if (gradeEntered >= 88) {
//                letterGrade = 'A';
//            } else if (gradeEntered >= 80) {
//                letterGrade = 'B';
//            } else if (gradeEntered >= 67) {
//                letterGrade = 'C';
//            } else if (gradeEntered >= 60) {
//                letterGrade = 'D';
//            } else if (gradeEntered >= 0) {
//                letterGrade = 'F';
//            }
//
//            System.out.println(letterGrade);
//
//            System.out.println("\nDo you wish to continue? [y/n] ");
//            userChoice = scc.next();
//
//        } while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));
    }
}