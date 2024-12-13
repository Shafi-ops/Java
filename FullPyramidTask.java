package myJava;
import java.util.Scanner;
public class FullPyramidTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thee no of rows:");
		r=sc.nextInt();
		for(i=0;i<r;i++) {
			for(j=1;j<r-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}

	}

}
