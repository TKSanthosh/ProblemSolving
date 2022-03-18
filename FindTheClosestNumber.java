package santhosh;

import java.util.Scanner;

public class FindTheClosestNumber {

	public static void main(String[] args) {
		double[] arr = new double[1000];
		double[] arr1 = new double[1000];
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double avg,sum=0.00;
		for(int i=0;i<a;i++) {
			arr[i]= sc.nextDouble();
			sum= sum+arr[i];
		}
		avg = sum/(double)a;
		for(int i=0;i<a;i++) {
			arr1[i]= Math.abs(arr[i] - avg);
		}
		int b =0;
		double min =arr1[0];
		for(int i=0;i<a;i++) {
			if(arr1[i]<min) {
				min = arr1[i];
				b=i;
			}
		}
		System.out.println((int)arr[b]);
	}
}