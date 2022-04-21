import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String scannerInput;
        Random rng = new Random();
        int percentage = 100;

        String[] dogs = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King doberman"};

        System.out.println("What is your dog's name?");
        scannerInput = myScanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + scannerInput + "'s prestigious background right here.");

        for (int i = 0; i < dogs.length; i++) {
            if (percentage == 0){
                System.out.println(dogs[i] + percentage + "%");
            }else{
                int randomNumber = rng.nextInt(percentage) + 1;

                if (i == dogs.length -1){
                    System.out.println(dogs[i] + percentage + "%");
                }
                else{
                    System.out.println(dogs[i] + randomNumber + "%");
                    percentage -= randomNumber;
                }
            }
        }
    }
}
