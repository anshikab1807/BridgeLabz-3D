package Strings;
		import java.util.Scanner;

		public class UpperCaseDemo {

		    public static String toUpperCustom(String s) {
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            if (ch >= 'a' && ch <= 'z') {
		                ch = (char)(ch - 32);
		            }
		            result.append(ch);
		        }
		        return result.toString();
		    }

		    public static boolean compareStrings(String s1, String s2) {
		        if (s1.length() != s2.length()) return false;
		        for (int i = 0; i < s1.length(); i++) {
		            if (s1.charAt(i) != s2.charAt(i)) return false;
		        }
		        return true;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String text = sc.nextLine();

		        String upperCustom = toUpperCustom(text);
		        String upperBuiltIn = text.toUpperCase();
		        System.out.println("Custom uppercase: " + upperCustom);
		        System.out.println("Built-in uppercase: " + upperBuiltIn);

		        System.out.println("Are both equal? " + compareStrings(upperCustom, upperBuiltIn));
		    }
		}
