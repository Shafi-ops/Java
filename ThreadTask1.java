package myJava;
class EvenThread extends Thread{
	public void display() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
			System.out.println("The number "+i+" is even");
		}
	    }
	
		
	}
}
class OddThread extends Thread{
	public void display() {
		for(int i=0;i<+10;i++) {
			if(i%2!=0) {
				System.out.println("The number "+i+" is odd");
			}
		}
	}
}

public class ThreadTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenThread obj1=new EvenThread();
		OddThread obj2=new OddThread();
		obj1.start();
		obj2.start();
		

	}

}
