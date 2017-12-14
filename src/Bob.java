import java.util.Scanner;

// Create a class Bob for the following exercise with a main method.
// Bob is a lackadaisical teenager. In conversation, his responses
// are very limited.
//
// 1. Bob answers 'Sure.' if you ask him a question.
//
// 2. He answers 'Whoa, chill out!' if you yell at him.
//
// 3. He says 'Fine. Be that way!' if you address him without actually saying anything.
//
// 4. He answers 'Whatever.' to anything else.

public class Bob {

    public static void main(String[] args) {

        System.out.println("Say something to Bob!");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        // Bob answers 'Sure.' if you ask him a question.
        boolean endsWithQuestionMark = userInput.endsWith("?");

        // Bob answers "Whoa, chill out!" if you yell (Yelling is all uppercase or ending with a ! character
        boolean isYelling = userInput.equals(userInput.toUpperCase()) || userInput.endsWith("!");

        // Bob says "Fine. Be that way" if you don't actually say anything
        boolean didNotSayAnything = userInput.trim().isEmpty();

        if(endsWithQuestionMark) {
            System.out.println("Sure.");
        } else if(didNotSayAnything) {
            System.out.println("Fine. Be that way.");
        } else if(isYelling) {
            System.out.println("Whoah, chill out.");
        } else {
            System.out.println("Whatever");
        }
    }
}



































//            Scanner sc = new Scanner(System.in);
//            String userChoice;
//
//            do {
//                statement = sc.next();
//                String letterGrade = " ";
//
//                if (statement >= 88) {
//                    letterGrade = "Sure";
//                } else if (statement >= 80) {
//                    letterGrade = "Whoa, chill out!";
//                } else if (statement >= 67) {
//                    letterGrade = "Fine. Be that way!";
//                } else {
//                    letterGrade ="Whatever.";
//                }
//
//
//                System.out.println(letterGrade);
//
//                System.out.println("\nDo you wish to continue? [y/n] ");
//                userChoice = sc.next();
//
//            } while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));
//    }
//}
