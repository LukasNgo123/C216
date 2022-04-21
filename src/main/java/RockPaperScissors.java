import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static int tie = 0;
    static int win = 0;
    static int lose = 0;
    static int numberOfRounds = getNumberOfRounds();
    static int userChoice = 0;

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame(){
        for (int i = 0; i < numberOfRounds; i++) {
            userChoice = getUserChoice();
            Play(userChoice);
        }
        System.out.println("Results: tie: " + tie + " win: " + win + " lose: " + lose);

        playAgain();
    }

    private static void playAgain(){
        System.out.println("Would you like to play again? Y/N ");
        Scanner myScanner = new Scanner(System.in);
        String scannerInput;
        scannerInput = myScanner.nextLine();
        if (scannerInput.equals("y") || scannerInput.equals("Y")){
            tie = 0;
            win = 0;
            lose = 0;
            startGame();
        }
        else System.out.println("Thanks for playing!");
    }

    private static int getNumberOfRounds() {
        Scanner myScanner = new Scanner(System.in);
        String scannerInput;
        int num = 0;
        System.out.println("How many rounds do you want to play? ");
        scannerInput = myScanner.nextLine();
        try{
            num = Integer.parseInt(scannerInput);
        }
        catch (Exception e){
            System.out.println("Enter a number between 1 - 10");
            return getNumberOfRounds();
        }

        if (num >= 1 && num <=10){
            return num;
        }
        else {
            System.out.println("Enter a number between 1 - 10");
            return getNumberOfRounds();
        }
    }

    private static int getUserChoice(){
        Scanner myScanner = new Scanner(System.in);
        String scannerInput;
        int num = 0;
        System.out.println("Choose 1 = Rock, 2 = Paper , 3 = Scissors");
        scannerInput = myScanner.nextLine();
        try{
            num = Integer.parseInt(scannerInput);
        }
        catch (Exception e){
            System.out.println("Enter a number between 1 - 3");
            return getUserChoice();
        }

        if (num >= 1 && num <=3){
            switch (num){
                case 1: System.out.println("You chose ROCK");
                    break;
                case 2: System.out.println("You chose PAPER");
                    break;
                case 3: System.out.println("You chose SCISSORS");
                    break;
            }
            return num;
        }
        else {
            System.out.println("Enter a number between 1 - 3");
            return getUserChoice();
        }
    }

    private static void Play(int userChoice){
        Random rng = new Random();
        int randomNumber = rng.nextInt(3) + 1;
        switch (randomNumber){
            case 1: System.out.println("PC chose ROCK");
                break;
            case 2: System.out.println("PC chose PAPER");
                break;
            case 3: System.out.println("PC chose SCISSORS");
                break;
        }

        if (userChoice == randomNumber){
            System.out.println("tie");
            tie++;
        }
        else if((userChoice == 1 && randomNumber == 3 )||
                (userChoice == 2 && randomNumber == 1 )||
                (userChoice == 3 && randomNumber == 2)){
            System.out.println("win");
            win++;
        }
        else {
            System.out.println("lose");
            lose++;
        }
    }

}
