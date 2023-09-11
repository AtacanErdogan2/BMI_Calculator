import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        double height, weight, bmi;

        // Retrieving data from the user
        System.out.print("Please enter your height (in meters) :");
        height = input.nextDouble();
        System.out.print("Please enter your weight (in kg) :");
        weight = input.nextDouble();

        // Calculation Section
        double a = weight / (height * height);
        bmi = Math.round(a * 100) / 100.0; // for 2 digits after decimal
        String measurement;

        if (bmi < 18.5) {
            measurement = " Underweight";
            System.out.println("Your Body Mass Index : " + bmi + measurement);
        } else if (bmi >= 18.5 && bmi < 24.99) {
            measurement = " Normal Weight";
            System.out.println("Your Body Mass Index : " + bmi + measurement);
        } else if (bmi >= 24.99 && bmi < 29.99) {
            measurement = " Overweight";
            System.out.println("Your Body Mass Index : " + bmi + measurement);
        } else if (bmi >= 29.99 && bmi < 34.99) {
            measurement = " Obesity";
            System.out.println("Your Body Mass Index : " + bmi + measurement);
        } else {
            measurement = " Extreme Obesity";
            System.out.println("Your Body Mass Index : " + bmi + measurement);
        }

    }
}