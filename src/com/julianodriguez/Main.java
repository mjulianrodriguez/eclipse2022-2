package com.julianodriguez;

public class Main {

	public Main (){
	}

	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public int multiplicacion(int a, int b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return b==0 ? 0 : a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hoola Mundo");
		Main calculator = new Main();
		System.out.println(calculator.suma(1, 2));
		System.out.println(calculator.resta(3, 4));
		System.out.println(calculator.multiplicacion(5, 6));
		System.out.println(calculator.divide(20, 5));



	}



}
