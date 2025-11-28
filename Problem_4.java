package com.tandemloop;

import java.util.HashMap;
import java.util.Map;

public class Problem_4 {
	public static void main(String[] args) {
		
		int[] input = {1,2,8,9,12,46,76,82,15,20,30};
		int[] divisors = {1,2,3,4,5,6,7,8,9};
		Map<Integer, Integer> result = new HashMap<>();
		for (int divisor : divisors) {
			int count = 0;
			for (int number : input) {
				if (number % divisor == 0) {
					count++;
				}
			}
			result.put(divisor, count);
		}
		System.out.println(result);
		
	}
}
