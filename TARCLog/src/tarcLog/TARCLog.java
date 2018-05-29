package tarcLog;

import java.util.*;
import java.io.*;
import java.io.*;

public class TARCLog {
	public static final String DATASHEETS_DIR = "cache/datasheets/";
	public static final String SAVEFILES_DIR = "cache/savefiles/";
	public static final String ERROR_MSG_0 = "Incorrect input. Please try again.";

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		File inputCacheFile;
		File outputCacheFile;
		File outputDataSheet;
		
		DataSheet sheet;
		Flight flight;
		
		System.out.println("Welcome to TARC Log. Start off with these commands:");
		System.out.println();
		System.out.println("\t0:\tNew Data Sheet");
		System.out.println("\t1:\tEdit Data Sheet");
		System.out.println("\t2:\tDelete Data Sheet");
		System.out.println("\t3:\tAnalyze Data Sheet (Not yet Implemented)"); // WIP
		
		
		switch(numberChoice(console, 3)) {
			case 0:
				sheet = new DataSheet();
				flight = new Flight();
				
				// prompt user for input data
				// save flight in sheet
				// save 
				break;
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
		}
		
		
		console.close();
	}
	
	private static boolean checkForNumber(String input) {
		try {
			Double.parseDouble(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	private static boolean checkForInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	private static int numberChoice(Scanner console, int maxOptionNum) {
		String input = "";
		int choice = -1;
		while (choice < 0 || choice > maxOptionNum) {
			input = console.nextLine();
			if (checkForInteger(input)) {
				choice = Integer.parseInt(input);
				if (choice < 0 || choice > maxOptionNum) {
					System.out.println(ERROR_MSG_0);
					choice = -1;
				}
			} else {
				System.out.println(ERROR_MSG_0);
			}
		}
		return choice;
	}
	
	/*
	private static double inputNumberData(Scanner console) {
		String input = "";
		double n = 0.0;
		while (!checkForNumber(input)) {
			input = console.nextLine();
			if (checkForNumber(input))
				n = Double.parseDouble(input);
			else
				System.out.println(ERROR_MSG_0);
		}
		return n;
	}
	*/
	
	private static boolean checkKeyword(String input) {
		// keywords; '/' is appended before
		// pass, p
		// back, b
		// finish, f
		// save, s
		// help, h
		boolean isKeyword = input.equalsIgnoreCase("pass") || input.equalsIgnoreCase("p");
		isKeyword = isKeyword || (input.equalsIgnoreCase("back") || input.equalsIgnoreCase("b"));
		isKeyword = isKeyword || (input.equalsIgnoreCase("finish") || input.equalsIgnoreCase("f"));
		isKeyword = isKeyword || (input.equalsIgnoreCase("save") || input.equalsIgnoreCase("s"));
		isKeyword = isKeyword || (input.equalsIgnoreCase("help") || input.equalsIgnoreCase("h"));
		return isKeyword;
	}
	
	private static int evaluateInput(String input) {
		int result = -1;
		// result codes
		// 0: is keyword
		// 1: is number
		// 2: is string
		
		if (checkKeyword(input))
			result = 0;
		else if (checkForNumber(input))
			result = 1;
		else 
			result = 2;
			
		return result;
	}
	/*
	private static void inputDataPhase(Scanner console, Flight f) {
		String input = "";
		System.out.print("Temperature (F): ");
		System.out.print("Humidity (%): ");
		System.out.print("Payload: ");
		System.out.print("Booster: ");
		System.out.print("Motor: ");
		System.out.print("Motor Delay (s): ");
		System.out.print("Parachute: ");
		System.out.print("Payload Mass (g): ");
		System.out.print("Booster Mass (g): ");
		System.out.print("Egg Amount: ");
		// egg stuff
		System.out.print("Parachute Mass (g): ");
		System.out.print("Nomex (g): ");
		System.out.print("Insulation (g): ");
		System.out.print("Ballast (g): ");
		System.out.print("Casing (g): ");
		System.out.print("Motor Mass (g): ");
		System.out.print("Altitude (ft): ");
		System.out.print("Time (s): ");
		
	}
	*/
	
	private static void inputDataPhase(Scanner console, Flight f, int phase) {
		String input = "";
		switch (phase) {
			case 0:
				while (evaluateInput(input) != 0 || evaluateInput(input) != 1) {
					
				}
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:	
		}
	}
}
