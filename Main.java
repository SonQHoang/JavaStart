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

// public class Main {
//     public static void main(String[] args) {
//         int x = 123; // Largest # we can use is just ovet 2 billion; cannot store a decimal
//         long y = 123841824812841L; // Have to follow with an L
//         double z = 3.14;
//         boolean a = false;
//         char symbol = '@';
//         String name = "Bruh"; // Anything that is a reference data type starts with a capitol

//         System.out.println("My number is: "+x);
//         System.out.println("My other number is "+y);
//         System.out.println("My final number is "+z);
//         System.out.println(a);
//         System.out.println(symbol);
//         System.out.println("Hello "+name);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String x = "water";
//         String y = "Kool-Aid";
//         String temp; // Temporary container to store additional values

//         temp = x; // Tempt = water
//         x=y; // x = kool-aid
//         y =temp; // y = water
//         // x is now kool-aid while y is now water

//         System.out.println("x: "+x);
//         System.out.println("y: "+y);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String x = "Pizza is the best!";

//         String y = "Steak is the better option...";

//         String temp;

//         temp = x;
//         x = y;
//         y = temp;

//         System.out.println("This is x: "+x);

//         System.out.println("This is y: "+y);
//     }
// }

// import java.util.Scanner; // Importing the scanner class from the util package

// // What is a scanner? 

// public class Main {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in); //Utilizing scanner to have user input

//         System.out.println("What is your name? ");
//         String name = scanner.nextLine(); // Part of scanner
//         System.out.println("How old are you? ");
//         int age = scanner.nextInt();
//         scanner.nextLine(); // clears the scanner;
//         System.out.println("What is your favorite food?");
//         String food = scanner.nextLine();


//         System.out.println("Hello " + name);
//         System.out.println("You are "+age+ " years old");
//         System.out.println("You like " + food);
//     }
// }


/* Intro to Expressions
 * 
 * Combination of operands and operators
 *  Operators are mathematical symbols
 * Operands are values, variables, numbers and quantity
 */

//  public class Main {
//     public static void main(String[] args) {
//         double friends = 11;

//         // friends = friends % 2; Basic method
//         // friends++; //shorthand is the same as JS

//         // With integer division we truncate decimal portions
//         // We can resolve this by casting values as a double or float

//         friends = (double) friends / 3;

//         System.out.println(friends);
//     }
//  }

// Making a GUI (Graphical User Interface) application

// import javax.swing.JOptionPane; // What is this?

// public class Main {
//     public static void main(String[] args) {

//         String name = JOptionPane.showInputDialog("Enter your name"); // showInputDialog returns a string
//         JOptionPane.showMessageDialog(null, "Hello "+ name); // Displays information

//         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//         JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

//         double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//         JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
//     }
// }

// Useful methods of the math class
// Goal is to find the hypotenuse of a triangle

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter side x: ");
        x = scanner.nextDouble();

           System.out.println("enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse is: " + z);

        scanner.close();
       
        // double x = 3.14;
        // double y = 10;

        // double z = Math.max(x, y);
        // double z = Math.min(x, y);

        // double z = Math.abs(y); // Absolute value finder
        // double z = Math.sqrt(y); // Finding the square root

        // double z = Math.ceil(x, y); // Rounding up
        // double z = Math.ceil(x, y); // Rounding down

        // System.out.println("This number is larger: "+ z);
    }
}