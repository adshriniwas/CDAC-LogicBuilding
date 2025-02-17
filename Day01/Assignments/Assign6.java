import java.util.*;
class Assign6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int rem = a % b;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " x " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " mod " + b + " = " + rem);
	}
}