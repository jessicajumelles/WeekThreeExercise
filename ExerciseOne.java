package weekThreeExercise;
import java.util.Scanner;

public class ExerciseOne {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main (String[]args) {
		
		int min = 0;
		int max = 10;
		
		int randomNumber = generateNumber(max, min);
		while(!checkGuess(getGuess(min,max),randomNumber)) {}
		
		scan.close();
		
	}
	
	private static int generateNumber(int max, int min) {
		return (int)(Math.random()* (max-min+1)) + min;
	}
	
	private static int getGuess(int min, int max) {
		
		System.out.println("Guess a number between " + min + " and " + max);
		
		while(!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("That's not a number");
			System.out.println("Guess again.");
		}
		
		return scan.nextInt();
	}
	
	private static boolean checkGuess(int guess, int target) {
		if(guess < target) {
			System.out.print("Too Low");
			return false;
		} else if (guess > target) {
			System.out.print("Too High");
			return false;
		} else {
			System.out.print("You got it!");
			return true;
		}
	}

}
