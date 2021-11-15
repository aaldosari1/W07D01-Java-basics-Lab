import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {

        Random rn = new Random(); //https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
        Scanner scan = new Scanner(System.in);
        int rand = rn.nextInt(3);

        System.out.println("----Welcome to Rock Paper Scissors game----");
        System.out.println("Press 0 for Scissors, 1 for Rock, and 2 for Paper");
        int userInput = scan.nextInt();

        if (userInput == rand)
            System.out.println("Draw");
        else if (userInput == 0 && rand == 1)
            System.out.println("You lose");
        else if (userInput == 0 && rand == 2)
            System.out.println("You Win");
        else if (userInput == 1 && rand == 0)
            System.out.println("You Win");
        else if (userInput == 1 && rand == 2)
            System.out.println("You lose");
        else if (userInput == 2 && rand == 0)
            System.out.println("You lose");
        else if (userInput == 2 && rand == 1)
            System.out.println("You Win");
        else System.out.println("Invalid input");   

        System.out.print("CPU chose: " + rand);
    }


}