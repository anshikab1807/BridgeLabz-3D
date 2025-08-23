package Level3CoreJava;
		import java.util.Scanner;

		public class BMIprogram {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter your weight in kilograms (kg): ");
		        double weight = sc.nextDouble();
		        System.out.print("Enter your height in centimeters (cm): ");
		        double heightCm = sc.nextDouble();
		        double heightMeters = heightCm / 100;
		        double bmi = weight / (heightMeters * heightMeters);
		        String status;
		        if (bmi <= 18.4) {
		            status = "Underweight";
		        } else if (bmi <= 24.9) {
		            status = "Normal";
		        } else if (bmi <= 39.9) {
		            status = "Overweight";
		        } else {
		            status = "Obese";
		        }
		        System.out.printf("Your BMI is", bmi);
		        System.out.println("Weight Status " + status);
	}

}
