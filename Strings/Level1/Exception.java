package Strings;
import java.util.Scanner;

public class Exception {

    public static void generateEx(String s) {
        System.out.println(s.charAt(100)); 
    }

    public static void handleEx(String s) {
        try {
            System.out.println(s.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // generateEx(s);
        
        handleEx(s);
    }
}
