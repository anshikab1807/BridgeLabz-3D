package Level2CoreJava;
		import java.util.Scanner;

		public class PowerCalculate {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number");
		        int number = sc.nextInt();
		        System.out.print("Enter power");
		        int power = sc.nextInt();
		        if (number <= 0 || power < 0) {
		            System.out.println("Invalid input");
		        } else {
		            int result = 1;

		            for (int i = 1; i <= power; i++) {
		                result *= number;
		            }

		            System.out.println(number + "to the power of " + power + " is: " + result);
		        }
		    }
		}
