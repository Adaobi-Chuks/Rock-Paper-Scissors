import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String answer = scan.next();
    
        if (answer.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock -- paper -- scissors, shoot!");
            String yourChoice = scan.next();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("\nDarn, some other time...!");
        }
        scan.close();
    }

    public static String computerChoice () {
        double random = Math.random() * 3;
        int intRandom = (int)random;
        if (intRandom == 1) {
            return "rock";
        } else if (intRandom == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = " ";
        if ((yourChoice.equals("rock") && computerChoice.equals("scissors")) || (yourChoice.equals("paper") && computerChoice.equals("rock")) || (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
            result = "You win";
        } else if ((yourChoice.equals("rock") && computerChoice.equals("paper")) || (yourChoice.equals("paper") && computerChoice.equals("scissors")) || (yourChoice.equals("scissors") && computerChoice.equals("rock"))) {
            result = "You loose";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie";
        } return result;
      }
 
    public static void printResult(String yourchoice, String computerchoice, String result) {
        System.out.println("\nYou chose: " + yourchoice);
        System.out.println("The computer chose: " + computerchoice);
        System.out.println("\n" + result);
    }
}
