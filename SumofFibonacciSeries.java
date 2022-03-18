package santhosh;
import java.util.*;
public class SumofFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0,c=1,d=0,sum=0;
		for(int i=0;i<a;i++ ) {
			sum=sum+d;
			d=b+c;
			c=b;
			b=d;
			
		}
		System.out.print(sum);

	}

}
