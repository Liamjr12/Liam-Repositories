package School.FirstSemester;

import java.util.Scanner;

public class H7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //Control Structure         =       Used to control the excution flow of the program

        //Selection Statements (Decision making statements)
        //if statements, if-else statements, and switch statements

        //Example of Using Selection Statements
        int myChoice;
        System.out.print("Choose a number from 1-5: ");
        myChoice = sc.nextInt();

        if (myChoice == 1) {
            System.out.println("Do your assignments");
        } else if (myChoice == 2) {
            System.out.println("Do your dishes");
        } else if (myChoice == 3) {
            System.out.println("Sleep early tonight");
        } else if (myChoice == 4) {
            System.out.println("Read 10-page of your module today");
        } else if (myChoice == 5) {
            System.out.println("Do whatever you want today");
        } else {
            System.out.println("Invalid input!");
        }

        //Similar idea different technique

        //switch statements are the best to use when there are many choices
        System.out.print("Choose a number from 1-7: ");
        myChoice = sc.nextInt();

        switch (myChoice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        System.out.println();

        //Repetition Statements (looping statements)
        //while loop statement, do-while loop statements, for loop statements

        //Example of Using a Repetition Statements
        System.out.print("Press a number to start: ");
        myChoice = sc.nextInt();

        while (myChoice > 0 && myChoice < 101) {
            System.out.println(myChoice);
            myChoice += 2;
        } 

        do {
            System.out.print("Press a number to start: ");
            myChoice = sc.nextInt();
        } while (myChoice != 100);

        System.out.print("Press a number to start: ");

        for (myChoice = sc.nextInt(); myChoice < 100; myChoice += 2) {
            System.out.println(myChoice);
        }

        System.out.println();

        //Branching statements (transfer control to another program)
        //break, continue, and return

        //Break statement       =       used to break out of loop
        //Continue statement    =       used in  looping statement to skip current iteration of loop and resume to the next
        //Return statement      =       transfers the control to the caller of the method

        //Example of Using the Branching Statements
        int i = 32;
        while (i > 0) {
            System.out.println(i);
            if (i == 55) {
                break;
            }   
            i++;

            if (i > 100) {
                break;
            }
        }
        
        System.out.println();

        mySchedule("");
        sc.close();
    }

    public static String mySchedule(String str) {
        System.out.println("Monday: 9AM to 5PM");
        System.out.println("Tuesday: 7AM to 4PM");
        System.out.println("Wednesday: 10AM to 4PM");
        System.out.println("Thursday: 9AM to 5PM");
        System.out.println("Friday: 7AM to 4PM");
        return str;
    }

}
