import java.util.*;
public class Lab1 {
	public static void main(String[] args){
		
		double num = Math.random()*9+1;
		int realnum = (int)num;
		int guess, numOfGuesses=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10: ");
		for (;;){
		guess = scan.nextInt();
		numOfGuesses+=1;
		if (realnum ==guess){
			System.out.print("You were right!");
			System.out.println(numOfGuesses);
		}else{
			System.out.print("You were wrong, the number was "+realnum);
			System.out.println(numOfGuesses);
		}
	}
}

}
