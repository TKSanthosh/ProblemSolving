package santhosh;

import java.util.Scanner;

public class RunLengthEncoding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		 String ano="";
	        int count =1;
	        String result="";
	        
	        
	        for(int i=0;i<str.length()-1;i++){
	            
	            if(str.charAt(i) == str.charAt(i+1)){
	                count++;   
	            }
	            else { 
	            	result+= str.charAt(i)+String.valueOf(count);
	                count =1;  
	            }  
	        }
	       System.out.println( result+str.charAt(str.length()-1)+Integer.toString(count));
	}

}
