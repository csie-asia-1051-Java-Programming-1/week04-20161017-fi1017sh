package hw;

import java.util.Scanner;

public class hw02_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("計算C(n)取(m)。");
		System.out.println("請輸入正整數 n=");
		System.out.println("請輸入正整數 m=");
		int n = scn.nextInt();
		int m = scn.nextInt();
		int sum1=1;  // n!
		int sum2=1;  // m!
		int sum3=1;  // (n-m)!
		int sum4=1;  // C(n)取(m) 
		for(int i=n;i>0;i--){
			sum1 =sum1*i;
		}
		for(int i=m;i>0;i--){
			sum2 =sum2*i;
		}
		for(int i=n-m;i>0;i--){
			sum3 =sum3*i;
		}
		sum4=sum1/(sum2*sum3);
		System.out.println("C"+ n + "取" + m + "為" + sum4);
}
}
