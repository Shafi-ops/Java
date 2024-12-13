package myJava;
import java.util.Scanner;
public class RightTriangleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of rows:");
		r=sc.nextInt();
		for(i=0;i<=r;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
			
		}
		

	}

}
