import java.util.*;
public class Lab1 {
	public static void main(String[] args){
		
		double num = Math.random()*9+1;
		int realnum = (int)num;
		int guess;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10: ");
		for (;;){
		guess = scan.nextInt();
		if (realnum ==guess){
			System.out.print("You were right!");
		}else{
			System.out.print("You were wrong, the number was "+realnum);
		}
	}
}

}
