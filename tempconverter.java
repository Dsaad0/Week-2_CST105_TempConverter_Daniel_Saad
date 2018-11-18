/* Program:  Assignment 2 Task 2
 * File:     tempconverter.java
 * Summary:  Asks user for temperature, validates, and converts to other degree
 * Author:   Daniel Saad
 * Date:     11/18/2018
*/
//Import Scannel Class
import java.util.Scanner;
//Declare New Java Class
public class tempconverter 
{
   public static void main(String []args) 
   {
       //Initiate Scanner Class
      Scanner sc = new Scanner(System.in);
      //initialize Floats to be used
      float fahrenheit;
      float celsius;
      //Asks User for fahrenheit temperature
      System.out.println("Please enter a temperature in Fahrenheit:");
      //Retireves user input into fahrenheit
      fahrenheit = sc.nextInt();
      //conversion to celsius and saves in object
      celsius = (((fahrenheit-32)*5)/9);
      //Output of Celsius temperature
      System.out.println("Celsius Temperature is " + celsius + " Degrees");
      //Asks User for Celsius temperature
      System.out.println("Please enter a temperature in Celsius:");
      //Retireves user input into celsius
      celsius = sc.nextInt();
      //conversion to fahrenheit and saves in object
      fahrenheit = ((((celsius*9)/5)+32));
      //Output of fahrenheit temperature
      System.out.println("Fahrenheit Temperature is " + fahrenheit + " Degrees");
   }
}
