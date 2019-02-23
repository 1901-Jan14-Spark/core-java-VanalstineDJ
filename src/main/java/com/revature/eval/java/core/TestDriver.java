package com.revature.eval.java.core;

public class TestDriver {

	public static void main(String[] args) {
		
		System.out.println(isArmstrongNumber(4));
		
		//System.out.println((int)Math.pow(5,3));

	}
	
	public static boolean isArmstrongNumber(int input) {
		String inputString = Integer.toString(input);
		int numOfDigits = inputString.length();
		int sum = 0;
		int poweredNum = 0;
		
		int[] numberArray = new int[inputString.length()];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = Integer.parseInt(inputString.substring(i, i+1));
		}
		for(int num : numberArray) {
			poweredNum = (int) Math.pow(num, numOfDigits);
			sum += poweredNum;
		}			
		if(sum == input) {
			 return true;
		} else {			
			return false;
		}
	}
}
