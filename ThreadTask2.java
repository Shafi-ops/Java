package myJava;
import java.util.Scanner;
class SubjectMarksThread extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of subjects: ");
		int a=sc.nextInt();
		sc.nextLine();
		
		String[] Subject=new String[a];
		int[] Marks=new int[a];
		
		System.out.println("Enter the subject names:");
		for(int i=0;i<a;i++) {
			Subject[i]=sc.nextLine();
		}
		
		System.out.print("Enter the marks:");
		for(int i=0;i<a;i++) {
			Marks[i]=sc.nextInt();
		}
		
		System.out.println("Subject wise marks:");
		for(int i=0;i<a;i++) {
			System.out.println(Subject[i]+" Marks:"+ Marks[i]);
		}
		
		double total=0;
		for(int i=0;i<a;i++) {
			total+=Marks[i];
		}
		
		double average=total/a;
		System.out.println("Average of marks is: "+average);
		sc.close();
	}
}
public class ThreadTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectMarksThread avg=new SubjectMarksThread();
		avg.start();

	}

}
