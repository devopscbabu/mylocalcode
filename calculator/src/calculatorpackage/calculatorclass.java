package calculatorpackage;

import java.util.Scanner;

public class calculatorclass {
	
public static int add(int number1, int number2) {
	return number1 + number2;
}
public static int sub(int number1, int number2) {
	return number1 - number2;
}
public static int mul(int number1, int number2) {
	return number1 * number2;
}
public static double div(double number1, double number2) {
	if (number2 ==0) {
		throw new IllegalArgumentException("Number cannot be divided by 0");
		}
     return number1/number2;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int input = sc.nextInt();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter Second Number : ");
	int input1 = sc.nextInt();
	
	System.out.println("The Addition is : " + calculatorclass.add(input, input1));
	System.out.println("The Subtraction is : " + calculatorclass.sub(input, input1));
	System.out.println("The Multiplication is : " + calculatorclass.mul(input, input1));
	System.out.println("The Division is : " + calculatorclass.div(input, input1));
	}
}
