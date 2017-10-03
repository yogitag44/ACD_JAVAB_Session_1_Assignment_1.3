import java.util.Scanner;   

public class bitWiseLogic{
	
public void bitWiseLogicImplementation(byte x, byte y) {//byte type signature

		boolean firstBooleanVariable = false;   //initially defined as false
		boolean secondBooleanVarible = false;	//initially defined as false
		
		int bitWiseANDResult = x & y; // BitWise AND condition

		if (x == 0) { // Checking the Input Byte Variable value and using the same to assign logical
						// value to a variable
			firstBooleanVariable = false;
		} else if (x == 1) {
			firstBooleanVariable = true;
		}

		if (y == 0) { // Checking the Input Byte Variable value and using the same to assign logical
						// value to a variable
			secondBooleanVarible = false;
		} else if (y == 1) {
			secondBooleanVarible = true;
		}

		boolean logicalANDResult = firstBooleanVariable && secondBooleanVarible; // Logical AND condition
		System.out.println("BitWise AND Result :: " + bitWiseANDResult); // Printing BitWise AND result
		System.out.println("Logical AND Result :: " + logicalANDResult); // Printing Logical AND result
	}

	public static void main(String[] args) {
		
		bitWiseLogic bitWiseLogicalAND = new bitWiseLogic();   //Class constructor

		System.out.println("Enter Values in terms of 0's and 1's :: \n");
		System.out.println("Enter first input :\n"); // Taking First Input from the User
		Scanner firstUserInput = new Scanner(System.in);
		String firstValue = firstUserInput.nextLine();

		System.out.println("Enter second input :\n"); // Taking Second Input from the User
		Scanner secondUserInput = new Scanner(System.in);
		String secondValue = secondUserInput.nextLine();

		if ((Byte.valueOf(firstValue) <= 1 && Byte.valueOf(secondValue) <= 1)) { // Condition to check the values
																					// entered from the user to match
																					// the assignment criteria
			bitWiseLogicalAND.bitWiseLogicImplementation(Byte.valueOf(firstValue), Byte.valueOf(secondValue));
		} else {
			System.out.println("Enter right values in terms of BYTES (0's and 1's)");
		}

		firstUserInput.close(); // Closing the first Scanner InputStream
		secondUserInput.close(); // Closing the second Scanner InputStream

	}
}