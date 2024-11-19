package myJava;

public class MethodUsingAccess {
	public void display(){
		System.out.println("Method using Parameter");
	}
	public void display1(int a) {
		System.out.println("Method using public thru parameter");
		
	}
	    public static void main(String[] args) {
	    	MethodUsingAccess obj=new MethodUsingAccess();
	    	MethodUsingAccess obj1=new MethodUsingAccess();
	    	obj.display();
	    	obj.display1(20);
	    }
	

}
