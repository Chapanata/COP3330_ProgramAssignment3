
import java.security.SecureRandom; // Needed for random numbers
import java.util.Scanner;

// Part 1 Completed
// Part 2 Completed
// Part 3 Completed
// Part 4 Completed
// Part 5 In Progress

// Rubric Checkpoints
// Use Secure Int 1
// Use display randomly generated questions and asks for answer 1
// Program stores students response in double precision fp variabl
public class Choudhury_p1 {

    public static double randomNumberGenerator (int difficultyLevel, int boundLevel, int problemType) {

        SecureRandom randomNumbers = new SecureRandom();
        double x = 0.0;
        double y = 0.0;
        switch (difficultyLevel){
            case 1:
                boundLevel = 10;
                break;
            case 2:
                boundLevel = 90; // 0-89
                break;
            case 3:
                boundLevel = 900; //0-899
                break;
            case 4:
                boundLevel = 9000; //0-8999
                break;
            default:
                System.out.println("Invalid difficulty level.");
                askQuestion();
        }

        if (boundLevel == 10) {
            x = randomNumbers.nextInt(boundLevel - 1) + 1; //Generate number from 1-9
            y = randomNumbers.nextInt(boundLevel - 1) + 1; // Generate number from 1-9
        }
        else if (boundLevel == 90) {
            x = randomNumbers.nextInt(boundLevel) + 10; //Generate number from 10-99
            y = randomNumbers.nextInt(boundLevel) + 10; // Generate number from 10-99
        }
        else if (boundLevel == 900) {
            x = randomNumbers.nextInt(boundLevel) + 100; //Generate number from 100-999
            y = randomNumbers.nextInt(boundLevel) + 100; // Generate number from 100-999
        }
        else if (boundLevel == 9000) {
            x = randomNumbers.nextInt(boundLevel) + 1000; //Generate number from 1000-9999
            y = randomNumbers.nextInt(boundLevel) + 1000; // Generate number from 1000-9999
        }

        if (problemType == 1) {
        System.out.println("How much is " + x + " plus " + y + "?");
        return x + y;
        }

        else if (problemType == 2) {
            System.out.println("How much is " + x + " times " + y + "?");
            return x * y;
        }

        else if (problemType == 3) {
            System.out.println("How much is " + x + " minus " + y + "?");
            return x - y;
        }

        else if (problemType == 4) {
            System.out.println("How much is " + x + " divided " + y + "?");
            return x / y;
        }
        else if (problemType == 5) {

            int randomType;
            randomType = randomNumbers.nextInt(4) + 1;

            if (randomType == 1) {
                System.out.println("How much is " + x + " plus " + y + "?");
                return x + y;
            }

            else if (randomType == 2) {
                System.out.println("How much is " + x + " times " + y + "?");
                return x * y;
            }

            else if (randomType == 3) {
                System.out.println("How much is " + x + " minus " + y + "?");
                return x - y;
            }

            else if (randomType == 4) {
                System.out.println("How much is " + x + " divided " + y + "?");
                return x / y;
            }

        }
        return 0;
    }

    public static int askQuestion() {

        Scanner scnr = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom(); // Needed for random numbers

        // User enters a difficulty number
        int difficultyNumber;
        char choiceLetter;

        System.out.println("Please enter a difficulty level from 1 -4.");
        System.out.println("1 for one-digit numbers. 2 for two-digit numbers. 3 for three-digit numbers. 4 for four-digit numbers.");

        difficultyNumber = scnr.nextInt();
        System.out.println("");
        int boundNumber = 0;


        // User enters the type of arithmetic problem to do
        int problemType;
        System.out.println("Please enter the type of arithmetic problems you would like to do.");
        System.out.println("1 for Addition Problems. 2 for Multiplication Problems. 3 for Subtraction Problems. 4 for Division Problems. 5 for a random mixture of all these");
        problemType = scnr.nextInt();
        System.out.println("");


        // Initialize i for incrementing, and a counter for correct responses
        int i = 0;
        int rightCount;
        rightCount = 0;
        int badCount = 0;

        // Ask 10 Questions
        while(i < 10) {
            System.out.print(i + 1 + ") ");
            double z = randomNumberGenerator(difficultyNumber, boundNumber, problemType);
            // Calls a separate method to generate
            // Random Numbers for Question
            int answer = scnr.nextInt(); // Enter answer

            // If correct increment correct count
            if (answer == z) {
                rightCount++;
            }
            else {
                badCount++;
            }
            System.out.println("");
            i++;
        }


        System.out.println("You got " + rightCount + " correct and " + badCount + " wrong");
        int finalGrade = (rightCount * 100) / 10; // Calculate grade

        if (finalGrade >= 75) {
            System.out.println("Your final score is: " + finalGrade +"%");
            System.out.println("Congratulations, you are ready to go to the next level!");
            System.out.println("Enter 'y' to reset the program for the next student");
            choiceLetter = scnr.next().charAt(0);
            if (choiceLetter == 'y') {
                System.out.println("");
                askQuestion();
            }
            System.out.println("Ending program....");
            return 0;
        }

        System.out.println("You scored: " + finalGrade +"%");
        System.out.println("Please ask your teacher for extra help.");
        System.out.println("Enter 'y' to reset the program for the next student. To exit enter anything else.");
        choiceLetter = scnr.next().charAt(0);
        if (choiceLetter == 'y') {
            System.out.println("");
            askQuestion();
        }
        System.out.println("Ending program....");
        return 0;
    }

    public static void main(String[] args) {
        askQuestion();
    }
}