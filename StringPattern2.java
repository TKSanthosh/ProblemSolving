package santhosh;

public class StringPattern2 {

	public static void main(String[] args) {
		int a =6;
		for(int i=1;i<a;i++) {
			for(int j =1;j<=a;j++) {
				if(i==j||j==a+1-i) {
					System.out.print("x");
					
				}
				else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}

}
