package santhosh;
import java.util.Scanner;
public class FindtheIndices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int [] arr = new int [1000];
		for(int i =0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(arr[j]==i) {
					int c=j;
					System.out.print(c);
				}
			}
		}
	}

}
