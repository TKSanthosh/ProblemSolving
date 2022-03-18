package santhosh;

import java.util.Scanner;

public class SortingArray {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int a = sc.nextInt();
		  int []arr = new int [10000];
		  for(int i =0;i<a;i++) {
			  arr[i] = sc.nextInt();
		  }

		  for(int i =0;i<a;i++) {
			  for(int j=i+1;j<a;j++) {
				  int temp =0;
				  if(arr[i]>arr[j]) {
				 temp = arr[i];
				 arr[i]= arr[j];
				arr[j] = temp;}
			  }
		  }
		  for(int i =0;i<a;i++) {
			  System.out.print(arr[i]);
		  }

	  }
}