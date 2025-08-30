package Strings;
import java.util.*;
public class CharString {
		    public static char[] getChars(String str) {
		        char[] arr = new char[str.length()];
		        for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);
		        return arr;
		    }

		    public static boolean compareArrays(char[] a, char[] b) {
		        if (a.length != b.length) return false;
		        for (int i = 0; i < a.length; i++)
		        	if (a[i] != b[i])
		        	return false;
		        return true;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String str = sc.next();
		        char[] arr1 = getChars(str);
		        char[] arr2 = str.toCharArray();
		        System.out.println("User-defined: " + Arrays.toString(arr1));
		        System.out.println("Built-in: " + Arrays.toString(arr2));
		        System.out.println("Equal: " + compareArrays(arr1, arr2));
		    }
		}
