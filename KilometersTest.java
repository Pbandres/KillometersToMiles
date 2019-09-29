/****************************************

KilometersTest

****************************************/

import java.util.Scanner;

class KilometersTest{

  public static void main(String[] args) {

    System.out.println("");

    KilometersTwo kObj = new KilometersTwo();
    Scanner input = new Scanner(System.in);

    double inKm;
    double theM;

    System.out.print("Enter distance in kilometers to convert to miles: ");
    inKm = input.nextDouble();
    theM = kObj.kmToMiles(inKm);
    System.out.println("");

    System.out.println("Converting to miles...........................");
    System.out.println("Loading..........wait a second please...........");
    System.out.println("Distance to miles is " + theM + " miles");

    System.out.println("");

  }

}
