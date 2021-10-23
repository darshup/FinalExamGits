package practical1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SmallestRandomNumber {

	static int NthNumber;
	
	public static void main(String[] args) {

		System.out.println("Please provide Nth smallest number:");						//Asking user for nth number
	
		Scanner input = new Scanner(System.in);
		NthNumber = input.nextInt();  													//Getting the Nth smallest number form user
		
		int smallestNthRandomNumber = findNthSmallest(randomNumbersArray(500), NthNumber);	
		System.out.println("The " + NthNumber + "th SmallestNumber from 500 random numbers generated is " + smallestNthRandomNumber);	
	}
	
	public static int[] randomNumbersArray(int randomNumbersSize) {
		int randonNumbersArray [] = new int [randomNumbersSize];						//Creating array for 500 random numbers
		
		Random random = new Random();													//Randomobject
		
		for(int i=0 ; i <= randomNumbersSize -1; i++ ) {					
			randonNumbersArray [i] = random.nextInt(randomNumbersSize);
//			System.out.println(random.nextInt(randomNumbersSize));
//			Arrays.sort(randonNumbersArray);
		}
		return randonNumbersArray;
	}
	
	
	public static int findNthSmallest(int[] randonNumbersArray,int NthNumber) {			//This will return nth smallest number in an integer
		Arrays.sort(randonNumbersArray);
//		return randonNumbersArray[randonNumbersArray.length - NthNumber];				//This gives largest number in array
		return randonNumbersArray[ NthNumber - 1];
	}
	
	
}
