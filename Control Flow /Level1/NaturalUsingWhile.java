package CoreJava;
import java.util.Scanner;

		public class NaturalUsingWhile {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a natural number: ");
		        int n = scanner.nextInt(); if (n <= 0) {
		            System.out.println("The number " + n + " is not a natural number.");
		        } else {
		        	int formulaSum = n * (n + 1) / 2;int loopSum = 0;
		            int counter = 1;
		            while (counter <= n) {
		                loopSum += counter;
		                counter++;
		            }
		            System.out.println("Sum using formula: " + formulaSum);
		            System.out.println("Sum using while loop: " + loopSum);
		            if (formulaSum == loopSum) {
		                System.out.println("Correct");
		            } else {
		                System.out.println("Not Matched");
		            }
		        }

		        scanner.close();
		    }
		}
