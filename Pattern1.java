package pattern1;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j =(n-i)*2;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}