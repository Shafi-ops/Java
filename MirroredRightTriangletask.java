package myJava;
import java.util.Scanner;
public class MirroredRightTriangletask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of rows:");
		r=sc.nextInt();
		for(i=1;i<=r;i++) {
			for(j=0;j<=r-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				
			    System.out.print("*");

	}
System.out.println();
}
}}