package myJava;

public class MethodOverloading {
	public int sum(int x,int y) {
		return(x+y);
	}
	public int sum(int x,int y,int z) {
		return(x+y+z);
	}
	public double sum(double x,double y) {
		return(x+y);
	}
	public static void main(String[] args) {
		//Method Overloading
		MethodOverloading mo1=new MethodOverloading();
		System.out.println(mo1.sum(10,20));
		System.out.println(mo1.sum(10,20,40));
		System.out.println(mo1.sum(10,20));
	}

}
