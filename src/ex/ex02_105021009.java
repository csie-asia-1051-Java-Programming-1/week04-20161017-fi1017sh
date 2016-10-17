package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021009 陳俞儒
 */

import java.util.Scanner;

public class ex02_105021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n,m;
		char i = 0;
		while(true){
		System.out.println("請輸入n值:");
		System.out.println("請輸入m值:");
		n=scn.nextInt();
		m=scn.nextInt();
		System.out.println(n*m);
		System.out.println("是否繼續使用?(輸入t或f)");
		i=scn.next().charAt(0);
		if(i == 'f'||i =='F'){
			break;
		}
		}
	}

}
