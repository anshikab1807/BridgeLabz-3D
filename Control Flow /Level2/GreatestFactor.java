package Level2CoreJava;
		import java.util.Scanner;

		public class GreatestFactor {
		    public static void main(String[] args) {
		        Scanner sc= new Scanner(System.in);
		        System.out.print("Enter a number");
		        int n = sc.nextInt();
		        if (n<= 1) {
		            System.out.println("EnterNumber");
		        } else {
		            int greatest= 1;
		            for (int i = n - 1; i >= 1; i--) {
		                if (n % i == 0) {
		                    greatest = i;
		                    break;
		                }
		            }
		            System.out.println("The greatest factor of " + n+ "is" + greatest);
		        }
		    }
		}
