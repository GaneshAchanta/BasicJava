package basic;

import java.util.Scanner;

public class SumOf2Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two digit number");
		int n=sc.nextInt();
		int r=(n/10+(n%10));
		System.out.println("Result="+r);

	}

}
