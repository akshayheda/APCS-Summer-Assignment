package jackpot;
import java.util.Scanner;
import java.math.*;
public class Jackpot {

		public static void main(String[] args) {
			int sides = -1;
			int counter = 0;
			Scanner sc = new Scanner(System.in);
			do{
			System.out.println("How many sides should the dice have?");
			sides = sc.nextInt();
			
			
			} while (sides < 0);
			
			int[] dice = new int[3];
			do {
				for(int i = 0; i < dice.length; i++) {
					dice[i] = (int) (Math.random() * sides + 1);
				}
				System.out.print("\nRoll " + counter + " |");
				for(int i = 0; i < dice.length; i++) {
					System.out.print(dice[i] + "|");
				}
				
				counter++;
			}while(dice[0] != dice[1] || dice[1] != dice[2] || dice[0] != dice[2]);
		
		}	
}
