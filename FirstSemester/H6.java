package School.FirstSemester;

//Input         =       Process of entering a data in a software (java.util.Scanner)
//Output        =       Process of displaying the data in a visible devices (System.out sent to output, then console)
//Java.lang     =       Automatically imported to the Java files

import java.util.Scanner;
public class H6 {
    public static void main(String argsp[]) {

        //Scanner package is instantiated to be used in the main() method
        Scanner scanner = new Scanner(System.in);

        //How to Use a Scanner package in Java?
        System.out.println("What is your name? ");
        String myName = scanner.nextLine();

        System.out.println("How old are you? ");
        int myAge = scanner.nextInt();

        System.out.println("What is your height? (cm)");
        double myHeight = scanner.nextDouble();

        System.out.println("What is your weight? (kg)");
        float myWeigth = scanner.nextFloat();

        System.out.println("What is your favorite letter? ");
        char myFavorite = scanner.next().charAt(0);

        System.out.println("Are you a BSIT student? (true/false)");
        boolean Ans = scanner.nextBoolean();

        //Each Primitive Data Types have their own .next() method name

        System.out.println();

        System.out.println(
            "Name: " + myName + '\n' +
            "Age: " + myAge + "years-old" + '\n' +
            "Height: " + myHeight + "cm" + '\n' +
            "Weight: " + myWeigth + "kg" + '\n' +
            "Favorite: " + myFavorite + '\n' +
            "Am I BSIT? " + Ans
        );

        //It is always important to close a scanner after use to prevent information leakage
        scanner.close();
    }
}
