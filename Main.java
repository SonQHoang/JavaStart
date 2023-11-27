// // byte code is cross platform
//     // ends with a .class file extension
//     // uses a JVM

// //What is a JDK? Just download a JDK
//     // Java Developing Kit
//     // Java Runtime Environment
//     // Java Virutal Machine

// public class Main {

// 	public static void main(String[] args) {
// 		// System.out.print("Hello World!\n"); 
//         // Escape sequence characer is \n
//         // System.out.print("\"I love pizza!\"");
//         // System.out.println("Hi!");

//         /* Multi-line comment
//          * This is a new way to write a comment
//          * Use a /* */

//     // Variable is a placeholder for information
//     // Boolean 1 bit 2 values (True or False)
//     // Byte 1 byte
//     // Short 2 bytes
//     // Int 2 Bytes (PRIMITIVE)
//     // Long 8 bytes

//     // Float 4 bytes (Stores fractional values)
//     // Double 8 bytes (PRIMITIVE)
//     // Char 2 bytes (PRIMITIVE)
//     // String Varies (REFERENCE)

//     // What's the difference between primitive and reference?

//     /*
//      * Primitive 8 types
//      *  Uses less memory
//      * 
//      * Reference types - store an address
//      *  Uses more memory
//      */

//      // Precede the variable with the data type folloewd by the ;

//     //  int x // declaration

//     //  x = 123 // assignment

//     //  int x = 123 // initialization

//         int x = 123; // initialization

//         System.out.println(x);
//     }
// }

public class Main {
    public static void main(String[] args) {
        int x = 123; // Largest # we can use is just ovet 2 billion; cannot store a decimal
        long y = 123841824812841L; // Have to follow with an L
        double z = 3.14;
        boolean a = false;
        char symbol = '@';
        String name = "Bruh"; // ANything that is a reference data type starts with a capitol

        System.out.println("My number is: "+x);
        System.out.println("My other number is "+y);
        System.out.println("My final number is "+z);
        System.out.println(a);
        System.out.println(symbol);
        System.out.println("Hello "+name);
    }
}