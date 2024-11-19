package myJava;
import java.util.Scanner;

public class TablesofOnetoTen {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any number 1-10");
		int num=reader.nextInt();
		
		int res=0;
		for(int i=1;i<=10;i++) {
			res=num*i;
			System.out.println(res);
			
			
		}
		

	}

}
