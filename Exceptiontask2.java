package myJava;
public class Exceptiontask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		trynumber(n);
		//int g=8;
		//checkEvennumber(g);
		
	}
	public static void trynumber(int n) {
		try {
			checkEvennumber(n);
			System.out.println(n+" is even");
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error:"+e.getMessage());
		}
	}
	
	public static void checkEvennumber(int number) {
		if(number%2!=0) {
			throw new IllegalArgumentException(number+" is odd");
		}
	}
}