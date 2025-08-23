package Level3CoreJava;
		import java.util.Scanner;

		public class CalculatorSwitch {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter first number ");
		        double first = sc.nextDouble();
		        System.out.print("Enter second number: ");
		        double second = sc.nextDouble();
		        System.out.print("Enter operator  ");
		        String op = sc.next();
		        double result = 0;
		        boolean validOperator = true;
		        switch (op) {
		            case "+":
		                result = first + second;
		                break;
		            case "-":
		                result = first - second;
		                break;
		            case "*":
		                result = first * second;
		                break;
		            case "/":
		                if (second != 0) {
		                    result = first / second;
		                } else {
		                    System.out.println("Error");
		                }}}}
