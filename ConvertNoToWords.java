package santhosh;

import java.util.Scanner;

public class ConvertNoToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int [ ]arr= new int[3];
		int i=0,n=0;
		String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] teens = {"Eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

		String[] tens = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		String[] hundreds = {"hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred","eight hundred","nine hundred"};
		String result ="";
		if(a==0) {
			arr[i++]=0;
		}
		while(a>0) {
			n = a %10;
		    arr[i++]= n;
			a= a/10;
	}
		if(i==3) {
			if(arr[i-1]==1) {
				System.out.println(hundreds[arr[i-1]-1]+" and " +teens[arr[i-3]-1]);
			}
			else if(arr[i-2]==0 && arr[i-3]==0) {
				System.out.println(hundreds[arr[i-1]-1]);
			}
			else if(arr[i-2]==0) {
				System.out.println(hundreds[arr[i-1]-1]+" and "+ones[arr[i-3]]);
			}
			else {
			System.out.println(hundreds[arr[i-1]-1]+" and "+tens[arr[i-2]-1]+" "+ones[arr[i-3]]);
		}
			}
		if(i==2) {
			if(arr[i-1]==1) {
				System.out.println(teens[arr[i-2]-1]);
			}
			else {
			System.out.println(tens[arr[i-1]-1]+" "+ones[arr[i-2]]);
			}
		}
		if(i==1){
			System.out.println(ones[arr[i-1]]);

		}
} }
