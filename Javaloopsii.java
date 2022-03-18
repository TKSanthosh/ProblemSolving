package santhosh;
import java.util.*;
public class Javaloopsii {
	

	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int count = sc.nextInt();
	        int[]b = new int [50];
	        int[]a = new int [50];
	        int[] n = new int [15];
	       
	        int sum=0;
	        for(int i=0;i<count;i++){
	          a[i]= sc.nextInt();
	         b[i]= sc.nextInt();
	          n[i]= sc.nextInt();
	 
	        }
	        for(int i=0;i<count;i++){
	            for(int k=0;k<n[i];k++){
	                 for(int j=0;j<=k;j++){
	                   sum = sum + (int)Math.pow(2,j) * b[i];
	                   
	                 }
	                 System.out.print(a[i]+sum+ " ");
	                 
	        }
	        sum =0;
	        System.out.println();
	         }
	    }
	}

