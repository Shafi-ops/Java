package myJava;
import java.util.Scanner;
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=reader.nextInt();
		int number=num;
		int rem=0;
		int result=0;
		while(number!=0) {
			rem=number%10;
			result+=Math.pow(rem,3);//depend upon the no of digits
			number/=10;
		}
		if(result!=0) {
			System.out.println(num+" is an Armstrong number");
		}
		else {
			System.out.println(num+" is not an Armstrong number");
		}
		
		

	}

}
