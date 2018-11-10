// Filename FarhenheittoCelsius.java
// Written by Tanish
// Written on 1/6/2017
/* This class accepts a temperature in Fahrenheit from a user and converts
it to Celsius by subtracting 32 from the Fahrenheit value and multiplying the result
by 5/9 and display both values. */
import java.util.Scanner;

public class FarhenheittoCelsius {
    public static void main(String[] args)
{
    double celsius, farhenheit; //declaring the variables
    Scanner inputDevice = new Scanner(System.in);
    System.out.println("Please enter the temperature in Farhenheit: ");
    farhenheit= inputDevice.nextDouble();//takes in the input for the temperature in Farhenheit
    celsius=(farhenheit-32)/1.8; //does the calculation
    //display the result
    System.out.println("The temperature in Farhenheit: "+farhenheit+"\n"+" The temperature in celsius after conversion is : "+celsius);
}
    
    
}
