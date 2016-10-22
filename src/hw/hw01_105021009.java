package hw;

import java.util.Scanner;

public class hw01_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0,b=1,i,r;
		int n=scn.nextInt();
		System.out.print(1+"\t");
		for(i=1;i<n;i++){
		r=a+b;
		System.out.print(r + "\t");
		a=b;
		b=r;
		}	
	
}
}


