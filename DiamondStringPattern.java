package santhosh;

import java.util.Scanner;

public class DiamondStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()%2!=0) {

			int rows = ((s.length())/2)+1;
			//for upper section
			int temp =rows-1; 
			for(int i =1;i<=rows;i++) {
				for(int j =rows;j>i;j--) {
					System.out.print(" ");
				}
				System.out.print(s.charAt(temp));
				for(int j=1;j<(i-1)*2;j++) {
					System.out.print(" ");
				}
				if(i>1) {
					System.out.print(s.charAt(temp));
				}
				System.out.println();
				temp--; 
			}
			//for lower section
			rows = rows-1;
			temp = 1;
			for(int i =rows;i>=1;i--) {
				for(int j=rows;j>=i;j--) {
					System.out.print(" ");
				}
				System.out.print(s.charAt(temp));
				for(int j=1;j<(i-1)*2;j++) {
					System.out.print(" ");
				}
				if(i==1)
					System.out.println();
				else
					System.out.print(s.charAt(temp));
				temp++;
				System.out.println();
			}
	    }
		else {
			int rows = ((s.length())/2);
			int temp =rows-1; 
			for(int i =1;i<=rows;i++) {
				for(int j =rows;j>i;j--) {
					System.out.print(" ");
				}
				System.out.print(s.charAt(temp));
				if(i==1) {
					System.out.println(s.charAt(temp));
				}
				else {
				for(int j =1;j<=(i-1)*2;j++) {
					System.out.print(" ");
				}
				System.out.println(s.charAt(temp));
				}
				temp--;

			}
			rows = rows -1;
			temp= 1;
			for(int i =rows;i>=1;i--) {
				for(int j =rows;j>=i;j--) {
					System.out.print(" ");
				}
				System.out.print(s.charAt(temp));
				if(i==1) {
					System.out.println(s.charAt(temp));
				}
				else {
				for(int j =1;j<=(i-1)*2;j++) {
					System.out.print(" ");
				}
				System.out.println(s.charAt(temp));
				}
				temp++;

			}
		}
	}


}