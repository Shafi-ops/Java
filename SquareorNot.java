package myJava;
import java.util.Scanner;

public class SquareorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number:");
		double num=reader.nextDouble();
		double a=Math.sqrt(num);
		if(a*a==num) {
			System.out.println(num+" is a perfect square");
			
		}
		else {
			System.out.println(num+" is not a perfect square");
			
		}
		
		

	}

}
