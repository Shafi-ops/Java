package myJava;
import java.util.Scanner;

public class EvenorOddusingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Myobj= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Myobj.nextInt();
		
		if(num%2==0) {
			System.out.println("The number is even");
			
		}
		if(num%2!=0) {
			System.out.println("The number is odd");
		}
		
		
		
		
		
		

	}

}
