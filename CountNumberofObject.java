package santhosh;

public class CountNumberofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countthe s1 = new countthe();
		countthe s2 = new countthe();
		countthe s3 = new countthe();
		countthe s4 = new countthe();
		System.out.println(countthe.i);

	}

}
class countthe{
	static int i =0;
	public countthe(){
		i++;
	}
}