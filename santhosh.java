package santhosh;
import java.util.ArrayList;
import java.util.Scanner;
public class santhosh {

	public static void main(String[] args) {
		ArrayList<Character> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = s.length();
		int b= a/2;
		for(int i=b;i<a;i++) {
			ar.add(s.charAt(i));	
		}
		for(int i=0;i<b;i++) {
			ar.add(s.charAt(i));	
		}

		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(ar.get(k));
			}
			System.out.println("");
		}

	}

}