package myJava;
import java.util.Scanner;


public final class LeapyearorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=reader.nextInt();
		
		if((year%400==0)|| ((year%4==0)&&(year%100!=0))) {
			System.out.println(year+" is a leap year");
			
		}
		else {
			System.out.println(year+" is not a leap year");
		}
		

	}

}
