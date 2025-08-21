package Practice;

public class countDigit {
    public static void main(String[] args) {
        String s = "ab12c34";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("Digits = " + count);
    }
}
