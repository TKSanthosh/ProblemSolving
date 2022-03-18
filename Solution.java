package santhosh;
import java.io.*;
import java.util.*;

public class Solution {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int i,j,a;
	        String s = sc.next();
	        int le = s.length();
	        if(le%2==0){
	            a=le/2;
	            for(i =1;i<=a;i++){
	                for(j=1;j<=a;j++){
	                    if(i==j)
	                        System.out.printf("%c",s.charAt(j));
	                    else
	                        System.out.print(" ");
	                }
	                for(j=a;j>=1;j--){
	                    if(i==j){
	                        System.out.printf("%c",s.charAt[j]);
	                    }
	                    else{
	                        System.out.print(" ");
	                    }
	            }
	                System.out.println(" ");
	            }
	            for(i=a-1;i>=1;i--){
	                for(j=1;j<=a;j++){
	                    if(i==j)
	                        System.out.print(s.charAt[j]);
	                    else
	                        System.out.print(" ");
	                }
	                 for(j=a;j>=1;j--){
	                    if(i==j)
	                        System.out.print(s.charAt[j]);
	                    else
	                        System.out.print(" ");
	                }
	               System.out.println(" "); 

	            }
	        }
	        else{
	            a=le/2;
	             for(i =1;i<=a+1;i++){
	                for(j=1;j<=a+1;j++){
	                    if(i==j)
	                        System.out.print(s.charAt[j]);
	                    else
	                        System.out.print(" ");
	                }
	                for(j=a;j>=1;j--){
	                    if(i==j){
	                        System.out.print(s.charAt[j]);
	                    }
	                    else{
	                        System.out.print(" ");
	                    }
	            }
	                System.out.println(" ");
	            }
	             for(i=a;i>=1;i--){
	                for(j=1;j<=a;j++){
	                    if(i==j)
	                        System.out.print(s.charAt[j]);
	                    else
	                        System.out.print(" ");
	                }
	                 for(j=a+1;j>=1;j--){
	                    if(i==j)
	                        System.out.print(s.charAt[j]);
	                    else
	                        System.out.print(" ");
	                }
	               System.out.println(" "); 

	            }

	        }

	    }    
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i,j,a;
//        a=n/2;
//        for(i=1;i<=a;i++){
//            for(j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(j=a;j<=1;j--){
//                if(j<=i)
//                   System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
            System.out.println();
        }
	}

//    public static void main(String[] args) {
//       double[] arr = new double[1000];
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for(int i=0;i<a;i++) {
//            arr[i]= sc.nextDouble();
//        }
//        
//        double avg,sum=0.00;
//        for(int i=0;i<a;i++) {
//            sum= sum+arr[i];
//        }
//        avg = sum/(double)a;
//        int b =0;double c=0;
//        double min =arr[0]-avg;
//        for(int i=0;i<a;i++) {
//        	c= arr[i]-avg;
//            if(c<min) {
//                min = c;
//                b=i;
//            }
//            
//        }
//        System.out.println((int)arr[b]);
    }