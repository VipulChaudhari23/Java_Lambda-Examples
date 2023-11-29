package com.training.org;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface{
	double getPiValue(int a);
}

public class LambdaAreaCalculation implements MyInterface {
	public int show() {
		return 100;
	}
	public static void main(String[] args) {
		// using the Lambda function
		try(Scanner kb = new Scanner(System.in)) {
			System.out.print("Enter the value of radius ");
			int r = kb.nextInt();
			MyInterface ref;
			// singl statement in the lambda expressionm
//			ref = () -> 3.1415;
			// multiple statements in the lambda function ref
			ref = (int a) -> {
				System.out.println("This is the Lambda expression multiple statement");
//				return 3.1415;
				return a*a*3.1415;
			};
			System.out.println(ref);
			System.out.println("Show method is called "+new LambdaAreaCalculation().show());
			System.out.println("Area of circle with given redius is = " + r * r * ref.getPiValue(r));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		// Without using lambda function
//		Scanner kb = new Scanner(System.in);
//		int r = kb.nextInt();
//		MyInterface l1 = new LambdaAreaCalculation();
//		System.out.println("Area of Circle with given radius is = " + r * r * l1.getPiValue());
	}
	
	@Override
	public double getPiValue(int a) {
		return 3.1415;
	}
}
