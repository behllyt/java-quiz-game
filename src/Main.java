import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to store score
        int score = 0;

        // =========================
        // Question 1
        // =========================
        System.out.println("1. What is the capital of Kenya?");
        System.out.println("A. Nairobi\nB. Mombasa\nC. Kisumu\nD. Nakuru");

        char q1Answer;
        do {
            System.out.print("Enter A, B, C or D: ");
            q1Answer = input.next().toUpperCase().charAt(0);
        } while (q1Answer < 'A' || q1Answer > 'D');

        if (q1Answer == 'A') {
            score++;
        }

        // =========================
        // Question 2
        // =========================
        System.out.println("\n2. Which language are you learning?");
        System.out.println("A. Python\nB. Java\nC. C++\nD. HTML");

        char q2Answer;
        do {
            System.out.print("Enter A, B, C or D: ");
            q2Answer = input.next().toUpperCase().charAt(0);
        } while (q2Answer < 'A' || q2Answer > 'D');

        switch (q2Answer) {
            case 'B':
                score++;
                break;
        }

        // =========================
        // Question 3
        // =========================
        System.out.println("\n3. What does CPU stand for?");
        System.out.println("A. Central Processing Unit\nB. Computer Power Unit\nC. Control Unit\nD. Central Power Unit");

        char q3Answer;
        do {
            System.out.print("Enter A, B, C or D: ");
            q3Answer = input.next().toUpperCase().charAt(0);
        } while (q3Answer < 'A' || q3Answer > 'D');

        if (q3Answer == 'A') {
            score++;
        }

        // =========================
        // Question 4
        // =========================
        System.out.println("\n4. Which is an output device?");
        System.out.println("A. Keyboard\nB. Mouse\nC. Monitor\nD. Scanner");

        char q4Answer;
        do {
            System.out.print("Enter A, B, C or D: ");
            q4Answer = input.next().toUpperCase().charAt(0);
        } while (q4Answer < 'A' || q4Answer > 'D');

        switch (q4Answer) {
            case 'C':
                score++;
                break;
        }

        // =========================
        // Question 5
        // =========================
        System.out.println("\n5. Which is used to print in Java?");
        System.out.println("A. print()\nB. echo()\nC. System.out.println()\nD. write()");

        char q5Answer;
        do {
            System.out.print("Enter A, B, C or D: ");
            q5Answer = input.next().toUpperCase().charAt(0);
        } while (q5Answer < 'A' || q5Answer > 'D');

        if (q5Answer == 'C') {
            score++;
        }

        // =========================
        // FINAL RESULTS
        // =========================
        double percentage = (score / 5.0) * 100;

        System.out.println("\n=======================");
        System.out.println("Final Score: " + score + "/5");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("=======================");

        // Performance message
        if (percentage >= 80) {
            System.out.println("Excellent work!");
        } else if (percentage >= 50) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep practicing!");
        }

        // Close scanner
        input.close();
    }
}