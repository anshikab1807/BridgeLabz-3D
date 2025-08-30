package Strings;
import java.util.*;
public class SubString {
	    public static String sub(String str, int start, int end) {
	        String res = "";
	        for (int i = start; i < end && i < str.length(); i++) res += str.charAt(i);
	        return res;
	    }

	    public static boolean compare(String a, String b) {
	        if (a.length() != b.length()) return false;
	        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            String str = sc.next();
	            int start = sc.nextInt();
	            int end = sc.nextInt();
	            if (start < 0 || end > str.length() || start >= end) {
	                System.out.println("Invalid indices");
	                return;
	            }
	            String s1 = sub(str, start, end);
	            String s2 = str.substring(start, end);
	            System.out.println("Manual: " + s1);
	            System.out.println("Built-in: " + s2);
	            System.out.println("Equal: " + compare(s1, s2));
	        } catch (Exception e) {
	            System.out.println("Invalid input");
	        }
	    }}
