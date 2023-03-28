package Practice_Assignment;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		double num1,num2,result;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		num1 = sc.nextDouble();
		
		System.out.println("Enter the operator(+, -, *, /): ");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter the second number : ");
		num2 = sc.nextDouble();
		
		switch(operator) 
		{
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " +num2+" = " +result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " +num2+" = " +result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " +num2+" = " +result);
			break;
		case '/':
			if(num2==0) 
			{
				System.out.println("Error : Divide by zero");
			}
			result = num1/num2;
			System.out.println(num1 + " / " +num2+" = " +result);
			break;
		
			default:
				System.out.println("Invalid operator");
				break;
		}
		
	}

}
