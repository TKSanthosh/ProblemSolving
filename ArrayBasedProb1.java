package santhosh;

import java.util.Scanner;

public class ArrayBasedProb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int []arr = new int[n];
		int count =0;
		int ans=0;
		for(int i =0;i< n;i++) {
			arr[i]= sc.nextInt();
		}
		for(int query =0;query<q;query++) {
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a==1) {
			if(b==-1) {
				for(int i=0,k=0;i<n;i++) {
					if(c==arr[i]) {
						i--;
						continue;	
					}
					arr[k++]=arr[i];

				}
				ans=0;
			}
			else {
				arr[n]=c;
				}
			ans=0;
			}
		else if(a==2) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<=b&&arr[i]>=c) {
					count++;
				}
			}

		}
		}
		System.out.print(count+ans);
	}
	}