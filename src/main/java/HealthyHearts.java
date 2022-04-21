import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        getAge();
    }

    private static void getAge(){
        Scanner myScanner = new Scanner(System.in);
        String scannerInput;
        System.out.println("What is your age? ");
        scannerInput = myScanner.nextLine();
        try{
            int age = Integer.parseInt(scannerInput);
            if (age >= 1 && age <=100){
                Calculate(age);
            }
            else {
                System.out.println("Enter a number between 1 - 100");
                getAge();
            }
        }
        catch (Exception e){
            System.out.println("Enter a number between 1 - 100");
            getAge();
        }
    }

    private static void Calculate(int age){
        int maxHeartRate = 220 - age;
        int hrZoneMin = maxHeartRate /2;
        int hrZoneMax = maxHeartRate /100 * 85;

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + hrZoneMin + " - " + hrZoneMax + " beats per minute");
    }
}
