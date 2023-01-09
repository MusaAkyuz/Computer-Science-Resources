/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatypecasting;

/**
 *
 * @author Onder Eyecioglu
 */
public class JavaTypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Implicit Type Conversion: Java (Error)
    /* int intType0;
    intType0=10.99+10.99;
    System.out.println(intType0);  */ 
   //***********************************//
    //Explicit Type Conversion: Java 
    // create int type variable
    int intType = 10;
    System.out.println("The integer value: " + intType);

    // convert into double type
    double doubleType = intType;
    System.out.println("The double value: " + doubleType);
    
    double doubleType1 = 10.99;
    System.out.println("The double value: " + doubleType1);
    // convert into int type
    int intType1 = (int)doubleType1;
    System.out.println("The integer value: " + intType1);
    
    // create int type variable
    int intType2 = 10;
    System.out.println("The integer value is: " + intType2);
    // converts int to string type
    String strType = String.valueOf(intType2);
    System.out.println("The string value is: " + strType);
    System.out.println("The string value is: " + (strType+10));
   
    // create string type variable
    String strType1 = "10";
    System.out.println("The string value is: " + strType1);

    // convert string variable to int
    int intType3 = Integer.parseInt(strType1);
    System.out.println("The integer value is: " + intType3);
    System.out.println("The integer value is: " + (intType3+10));
    }
    
}
