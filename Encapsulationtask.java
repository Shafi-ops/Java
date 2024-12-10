package myJava;
	class Encapsulate{
		private String name;
		private int age;
		private int RollNo;
		public String getName() {
			return name;
			
		}
	    public void setName(String name) {
	    	this.name=name;
	    }
	    public int getAge() {
	    	return age;
	    }
	    public void setAge(int age) {
	    	this.age=age;
	    }
	    public int getRollNo() {
	    	return RollNo;
	    }
	    public void setRollNo(int RollNo) {
	    	this.RollNo=RollNo;
	    }
	    
	}
	//Driver class
	public class Encapsulationtask {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encapsulate details=new Encapsulate();
			details.setName("Shafi");
			details.setAge(20);
			details.setRollNo(2987);
			//Using method to get the values from the variables
			System.out.println("Name:"+details.getName());
			System.out.println("Age:"+details.getAge());
			System.out.println("RollNo:"+details.getRollNo());
}}
