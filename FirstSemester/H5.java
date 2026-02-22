package School.FirstSemester;

public class H5 {
    public static void main(String args[]) {
        
        //Operators     =   used to compute and compare values and test multiple conditions
        
        int a = 12;
        int b = 36;
        int c = 0;
        boolean bool = true;

        //Arithmethic Operators (+, -, *, /, %)
        System.out.println(
            "Addition: " + (a+b) + '\n' +
            "Subtraction: " + (a-b) + '\n' +
            "Multiplication: " + (a*b) + '\n' +
            "Division: " + (a/b) + '\n' +
            "Modulus: " + (a%b)
        );

        System.out.println();

        //Assignment Operators (=, +=, -=, *=, /=, %=)
        System.out.println(
            "Assignmnet: " + (c=b) + '\n' +
            "Sum: " + (a+=c) + '\n' +
            "Difference: " + (a-=c) + '\n' +
            "Product: " + (a*=c) + '\n' +
            "Quotient: " + (a/=c) + '\n' +
            "Modulus: " + (a%=c)
        );

        System.out.println();

        //Urinary Operators (+, -, ++, --, !)
        System.out.println(
            "Urinary Plus: " + (+c) + '\n' +
            "Urinary Minus: " + (-c) + '\n' +
            "Increament: " + (++c) + '\n' +
            "Decreament: " + (c--) + '\n' +
            "Complement: " + (!bool)
        );

        System.out.println();

        //Relational Operators (==, !=, >, <, >=, <=)
        System.out.println(
            "Equals to: " + (a == b) + '\n' +
            "Not Equal to: " + (a!=b) + '\n' +
            "Greater than: " + (a>b) + '\n' +
            "Less than: " + (a<b) + '\n' +
            "Greater than or Equal to: " + (a>=b) + '\n' +
            "Less than or Equal to: " + (a<=b) 
        );

        System.out.println();

        //Logical Operators (&& and ||)
        System.out.println(
            "AND: " + (a<b && b>a) + '\n' +
            "OR: " + (a<b || b>a)
        );
        
    }
    
}
