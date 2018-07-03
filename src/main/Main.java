package main;

import java.util.List;

import services.Fibonacci;

public class Main {
	public static void main(String[] args) {
		List<Integer> fibonacci = Fibonacci.calculateFibonacci1(4);
		System.out.println(fibonacci);
	}
}
