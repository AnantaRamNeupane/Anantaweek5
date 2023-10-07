package fall23;
import java.util.Scanner;

public class week5poly {
	public void sum(int a ,int b) {
		int c= a+b;
		System.out.println("the value of c is "+c);
	}public void sum() {
		System.out.println("welome");
		
	}
	static void max(int num1, int num2) {
		int  result;
		if(num1>num2) {
			result=num1;
			
			
		}
		else {
			result=num2;
		}
		System.out.println("the result is " + result);
	}

	public static void main(String[] args) {
		max (10,20);
		week5poly z= new week5poly();
		z.sum(5,6);
		z.sum();
		

	}

}
