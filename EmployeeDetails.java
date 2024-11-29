package myJava;

public class EmployeeDetails {
	int employeeid;
	String EmployeeName;
	double Salary;
	EmployeeDetails(int id,String Name,double Salary){
		this.employeeid=id;
		this.EmployeeName=Name;
		this.Salary=Salary;
	}
	void display() {
		System.out.println(employeeid+" "+EmployeeName+" "+Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=new EmployeeDetails(1,"Ravi",20000);
		EmployeeDetails e2=new EmployeeDetails(2,"Ayesha",45000);
		EmployeeDetails e3=new EmployeeDetails(3,"Shafi",60000);
		e1.display();
		e2.display();
		e3.display();

	}

}
