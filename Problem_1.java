package com.tandemloop;

import java.util.Scanner;

public class Problem_1 {

	private double a;
	private double b;

	public Problem_1(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double add() {
		return a + b;
	}

	public double subtract() {
		return a - b;
	}

	public double multiply() {
		return a * b;
	}

	public double divide() {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = scanner.nextDouble();
		Problem_1 calculator = new Problem_1(num1, num2);
		System.out.println("Addition: " + calculator.add());
		System.out.println("Subtraction: " + calculator.subtract());
		System.out.println("Multiplication: " + calculator.multiply());
		try {
			System.out.println("Division: " + calculator.divide());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}		

	}

}
