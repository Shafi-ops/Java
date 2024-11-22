package myJava;
import java.util.Scanner;
public class PatternTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		n=in.nextInt();
		for(i=1;i<=n;i++) {
			for(j=5;j>=i;j--)
			System.out.print(j);
			System.out.println("");
		}
		

	}

}
