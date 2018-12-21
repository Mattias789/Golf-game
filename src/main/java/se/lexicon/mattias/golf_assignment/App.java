package se.lexicon.mattias.golf_assignment;

import java.util.Scanner;

/**
 * Golf Game
 *
 */
public class App 
{

	private static Scanner scanner = new Scanner(System.in);

	//////////////   methods   /////////////
	public static Double getDouble() {
	Double input_D = Double.parseDouble(getString());		
	return input_D;
	}
	public static String getString() {
	String input_S = scanner.next();	
	return input_S;
	}
		 

    //////////////   main   ////////////////	
	public static void main( String[] args )
    {
		Double golfCoureLength = 0.0;
		
		Double hitStrength = 0.0;
		Double angle =  0.0;

        Double distanceToCup = 0.0;
		Double hitLength = 0.0;

		String onOff = "y/n";

		boolean newGame = false;
		//-------------------------------

		System.out.println("");
		System.out.println("Welcome to Lets Golf!"); //display once		
		
		System.out.println("New game (y)");  //add loop
		System.out.println("Exit (n)");
		System.out.println("____________________");
		
		if()
		
		
		System.out.print("Enter angle 0-80: ");

		angle = getDouble();		

		
		if 			(angle > 80) { angle = 80.0;
					System.out.println("");
					System.out.println("WARNING! Invalid angle! Angle set to 80.0 (max) ");
					System.out.println("");
		}else if 	(angle < 0.0) { angle = 0.0;
		}
		
	
		System.out.print("Enter strength: ");
		hitStrength = getDouble();		
		
    }
}
