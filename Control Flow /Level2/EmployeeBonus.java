package Level2CoreJava;
import java.util.Scanner;

		public class EmployeeBonus {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter salary ");
		        double salary = scanner.nextDouble();

		        System.out.print("Enter years");
		        int yearsOfService = scanner.nextInt();

		        if (yearsOfService > 5) {
		            double bonus = salary * 0.05;
		            System.out.println("Bonus amount " + bonus);
		        } else {
		            System.out.println("No bonus awarded");
		        }

		        scanner.close();
		    }
}
