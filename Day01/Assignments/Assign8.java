// Write a Java program to swap the values of two variables without using a third variable. 


import java.util.*;
class Assign8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before swapping");
		System.out.println("First number" + a);
		System.out.println("Second number" + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping");
		System.out.println("First number" + a);
		System.out.println("Second number" + b);

	}

}