package santhosh;

import java.util.Scanner;

public class ReverseandCapitalize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a =32;
		char[] ch = new char [1000];
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>64 || ch[i]<96) {
				ch[i]=(char)((int)ch[i]+a);
				System.out.print(ch[i]);
		}
			else if(ch[i]>96 ||ch[i]<123) {
				ch[i]=(char)((int)ch[i]-a);
				System.out.print(ch[i]);

			}
	}

}}