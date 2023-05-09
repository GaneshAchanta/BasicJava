package basic;

import java.util.Scanner;

public class NextMultipleOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two digit number");
		int n=sc.nextInt();
		int r=(n/10+(n%10/5))*10;
		System.out.println("Result="+r);
		
	}

}
