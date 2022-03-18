package santhosh;

public class StaticBlock {
	static{    //this static block will execute first before executing the main method
		System.out.println("Hello in Static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello in Main");
	}
static {   // all the static blocks in the class are executed first 
	System.out.println("Static block 2");
}
}
