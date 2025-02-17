// Write a Java program that takes two numbers as input and displays the product of the two 
// numbers.

import java.util.*;
class Assign5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int multiply = a * b;
		System.out.println(a + " x " + b + " = " + a*b);
	}
}