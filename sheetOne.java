import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class sheetOne {
  public static void main(String [] args) {
    // Exercise 1 - 4
    double d1 = 1.03;
    double d2 = 0.42;
    double d3 = d1 - d2;
    System.out.println(d3);

    double d4 = 0.1;
    float f = (float) d4;
    d4 = 1 - f;
    System.out.println(d4);


    // Exercise 1 - 5
    Scanner inputOne = new Scanner(System.in);
    System.out.println("Enter the diameter of the pot in centimetres");
    double diameter = inputOne.nextDouble();

    Scanner inputTwo = new Scanner(System.in);
    System.out.println("Enter the height of water in centimetres");
    double height = inputTwo.nextDouble();

    height /= 100;
    double radius = diameter / 2 / 100; // convert to meters
    double waterVolume = Math.PI * radius * radius * height / 1000; // convert to liters
    double timeNeeded = waterVolume * 2; // assume heat input is constant

    // Round the timeNeeded to two decimal places
    String formattedTime = String.format("%.2f", timeNeeded);
    
    System.out.println("Time needed to boil " + waterVolume + " liters of water is " + formattedTime + " minutes");


    // Exercise 1 - 6
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a two-digit octal number:");
    int octalNumber = input.nextInt();

    int decimalNumber = 0;
    int position = 0;
    while (octalNumber != 0) {
      int digit = octalNumber % 10;
      decimalNumber += digit * Math.pow(8, position);
      position++;
      octalNumber /= 10;
    }

    String binaryNumber = Integer.toBinaryString(decimalNumber);

    System.out.println("This is the corresponding decimal value: " + decimalNumber);
    System.out.println("This is the corresponding binary binary value: " + binaryNumber);

    inputOne.close();
    inputTwo.close();
    input.close();
  }
}
