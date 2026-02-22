package School.FirstSemester;

public class H4 {
    public static void main(String args[]) {

        //Primitive Data Types (built into Java language)
        //byte          =   ranges from -128 to +127
        //short         =   ranges from -32768 to +32767
        //int           =   commonly used to handle bigger data
        //long          =   can store a large amount of number data (has L at the end of statement)
        //float         =   single precision (has f at the end of the statement)
        //double        =   double precision (has d at the end of the statement)
        //char          =   displays a single character
        //boolean       =   has a true and false value

        //How to Use These Data types?
        byte Byte = -100;
        short Short = 10500;
        int Integer = -50400;
        long Long = 123456789L;
        
        System.out.println(
            "Byte: " + Byte + '\n' +"Short: " + Short + '\n' +
            "Integer: " + Integer + '\n' +"Long: " + Long);

        //For spacing only
        System.out.println();

        float Float = 12.50f;
        double Double = 54.67d;

        System.out.println("Float: " + Float + '\n' + "Double: " + Double);

        System.out.println();

        char Character = 'L';
        boolean Boolean = true;

        System.out.println("Character: " + Character + '\n' + "Boolean: " + Boolean);

        System.out.println();

        //Abstract Data Types (A type that has more functionality e.g String)
        String str;
        str = "My name is Liam";
        System.out.println(str);
    }

}
