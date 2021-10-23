package practical1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		System.out.println("Please provide Nth smallest number:");		//Asking user for nth number
		
		Scanner input = new Scanner(System.in);
		int NthNumber = input.nextInt();  							//Getting the Nth smallest number form user
		
		int [] randomNumbersArray = new int[500];		//Creating an array for 500 random numbers
		
		int smallestNumber = randomNumbersArray[NthNumber];
		
		for(int i= 0; i < randomNumbersArray.length ; i++) {
			randomNumbersArray[i] = random.nextInt();
//			if(randomNumbersArray[i] < smallestNumber ) {
//				smallestNum = randomNumbersArray[i];
//			}
			
		
		}
		System.out.println("The " + NthNumber + "random number is " + smallestNumber);
		
	}
	
	public int findNthSmallest(int[] randomArray,int nthSmallestNumber) {
		Arrays.sort(randomArray);
		
		return randomArray[randomArray.length - nthSmallestNumber];
	
	}
	
	
	
	
}
