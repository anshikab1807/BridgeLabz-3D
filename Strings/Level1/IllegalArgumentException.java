package Strings;
		import java.util.Scanner;

		public class IllegalArgumentException{

		    public static void generateException(String s) {
		        System.out.println(s.substring(5, 2));  }

		    public static void handleException(String s) {
		        try {
		            System.out.println(s.substring(5, 2));
		        } catch (IllegalArgumentException e) {
		            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		        } catch (RuntimeException e) {
		            System.out.println("Caught RuntimeException: " + e.getMessage());
		        }
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String input = sc.next();

		        handleException(input);
		    }
		}
