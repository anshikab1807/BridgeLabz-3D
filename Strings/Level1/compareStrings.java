package Strings;
import java.util.Scanner;
public class compareStrings {
	    public static boolean compare(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }

	        return true; 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        String string1 = sc.next();
	        System.out.print("Enter second string: ");
	        String string2 = sc.next();
	        boolean c = compare(string1, string2);
	        boolean b = string1.equals(string2);
	        System.out.println("Comparison using charAt(): " + c);
	        System.out.println("Comparison using equals(): " + b);
	        if (c==b) {
	            System.out.println("SAME result");
	        } else {
	            System.out.println("DIFFERENT results.");
	        }

	        sc.close();		
	}
}
