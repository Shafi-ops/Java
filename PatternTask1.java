package myJava;
import java.util.Scanner;


public class PatternTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=n-i+1;j++) 
			System.out.print(i);
			System.out.println("");
				
			
			
			
		}

	}

}
