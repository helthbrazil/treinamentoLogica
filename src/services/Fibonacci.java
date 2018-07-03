package services;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static List<Integer> calculateFibonacci1(int n) {
		List<Integer> fibonacci = new ArrayList<>();
		if (n < 1) {
			return null;
		} else {

			if (n >= 1) {
				for (int index = 0; index < n; index++) {
					Integer number = 0;
					if (index == 0) {
						number = 1;
					} else {
						if (index == 1) {
							number = fibonacci.get(index - 1) * 2;
						} else {
							number = fibonacci.get(index - 1) + fibonacci.get(index -2);
						}
					}
					fibonacci.add(number);
				}

				return fibonacci;
			}
			return null;
		}
	}
	
	public static List<Integer> calculateFibonacci2(int n){
		
		
		
		return null;
	}
	
	
}
