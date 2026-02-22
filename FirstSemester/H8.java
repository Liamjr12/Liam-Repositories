package School.FirstSemester;

public class H8 {
    public static void main(String args[]) {
        
        //String            =       Sentence of characters (considered as object and has specific methods)
        //String index      =       A character on a specific position
        //String literals   =       Series of characters found enclosed in double quotes (constant)
        //Constructor       =       Block of code that utilizes a newly created object

        //Defualt implemetation of String Data Type
        String defaultString = new String("This is a constructor");
        System.out.println(defaultString);

        //Used to iterate an array of characters
        char chars[] = {'L', 'I', 'A', 'M'};

        //Fully iteration
        String charString = new String(chars);
        System.out.println(charString);

        //Selective iteration
        String CharString = new String(chars, 0, 4);
        System.out.println(CharString);

        //Used to iterate an array of characters using UNICODE system
        byte byteChar[] = {76, 73, 65, 77};

        //Fully iteration
        String byteString = new String(byteChar);
        System.out.println(byteString);

        //Selective iteration
        String ByteString = new String(byteChar, 0, 4);
        System.out.println(ByteString);

        System.out.println();

        //String methods to learn:
        //charAt()                  =           returns a character on a specific index
        //trim()                    =           removes the leading and trailing whitespaces from a string
        //replace()                 =           changes the matching occurrences of a text
        //equals()                  =           returns true if two strings are identical and false otherwise
        //toLowerCase()             =           changes all characters in the string to lowercase 
        //toUpperCase()             =           changes all characters in the string to uppercase
        //length()                  =           returns the number of characters in the string
        //concat()                  =           method returns a new string based on two concatenated or joined strings
        //indexOf()                 =           returns the position in number of the text 
        //compareTo()               =           compares two strings based on their dictionary order

        //Examples:
        String ex = " My Name is Liam Jr, it is nice to meet you! ";
        System.out.println(ex.charAt(10));
        System.out.println(ex.trim());
        System.out.println(ex.replace("Name", "(I replace this part)"));
        System.out.println(ex.equals(defaultString));
        System.out.println(ex.toLowerCase());
        System.out.println(ex.toUpperCase());
        System.out.println(ex.length());
        System.out.println(ex.indexOf("L"));
        System.out.println(ex.compareTo(defaultString));

        System.out.println();

        //Arrays                    =           represents the data in a connected space in the computer's memory
        //                          =           collection of similar data types
        //One-Dimensional Array     =           a list of same type of variable
        //Two-Dimensional Array     =           refers as array of an array

        //Example of How a One-Dimention Array is Used:
        String strArray[] = new String[5];      //the first step is the array's instantiation
        strArray[0] = "Apple";                  //the second step is initialization (set)
        strArray[1] = "Banana";
        strArray[2] = "Orange";
        strArray[3] = "Pinable";
        strArray[4] = "Melon";
        System.out.println(strArray[0]);        //the last step is iteration (get)
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println(strArray[3]);
        System.out.println(strArray[4]);

        System.out.println();

        //Example of How a Two-Dimentional Array is Used:
        int intArray[] = new int[100];
        int iterator = 0;

        //Efficient way to iterate an array effectively (while loop)
        while (iterator < 100) {                        
            intArray[iterator] = iterator + 1;
            System.out.println(intArray[iterator]);
            iterator++;
        }

        //Efficient way to iterate an array effectively (for loop)
        for (int i = 0; i < 100; i++) {
            System.out.println(intArray[i]);
        }

        //Using the same technique on Two-Dimensional Array
        double readNumber[][] = new double[100][100];
        double baseNumber = 1.2;

        for (int row = 0; row < readNumber.length; row++) {
            for (int colm = 0; colm < readNumber[row].length; colm++) {
                readNumber[row][colm] += baseNumber;
                System.out.println(readNumber[row][colm]);
                baseNumber += 1.2;
            }
        }

    }

}