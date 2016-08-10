package carInterestBasic;
import java.util.Scanner;


public class CarInterestBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating scanner
		System.out.println("What the the price of the car?"); //getting user input
		double carPrice = sc.nextDouble();
		System.out.println("What is your initial deposit?");
		double principal = sc.nextDouble();
		System.out.println("What is your interest rate?");
		double interestRate = sc.nextDouble();
		System.out.println("How much are you depositing every month?");
		double deposit = sc.nextDouble();
		sc.close();
		
		double money = principal; //creating variable to store how much money the user has
		int months = 0;
		while(money < carPrice) { //loop to add deposit and interest
			months++;
			money += deposit;
			
			if(months % 12 == 0) { //adds interest every year (12 months)
				money = money * (1 + interestRate/100);
			}
			
		}
		int years = 0; //converts months into years + months format
		while(months >= 12) {
			months -=12;
			years++;
		}
		//displays output
		System.out.println("It will take you " + years + " years and " + months + " months to save up for your car."); 
		
	}

}
