package santhosh;

import java.util.Scanner;

public class PrintNoOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i =0;i<s.length();i=i+2) {
			int a =s.charAt(i+1)-'0';
			for(int j =0;j<a;j++) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
