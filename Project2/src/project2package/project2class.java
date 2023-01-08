package project2package;
import java.util.Scanner;
public class project2class {
int c;
	
	public int add(int a, int b) {
		c= a+b;
		return c;
	}
	
	public int substract(int a,int b) {
		c=a-b;
		return c;
	}
	
	public int multiply(int a, int b) {
		c=a * b;
		return c;
	}
	
	public int divide(int a,int b) {
		int res=0;
		try {
		res=a/b;
		System.out.println("Division result: " + res);  
		}catch(ArithmeticException ex) {
			System.out.println("error: "+ex.getMessage());
			
		}
	return res;
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		project2class ca=new project2class();
		System.out.println("Addition Result: "+ca.add(a, b));
		System.out.println("Substraction Result: "+ca.substract(a, b));
		System.out.println("Multiplication Result: "+ca.multiply(a, b));
		ca.divide(a, b);
		sc.close();
	}

}
