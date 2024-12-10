package myJava;
class Membership{
	String Name="Shafi";
	String Type="Premium";
	String Duration="2 Hours";
	int gymfee=2000;
	int trainerandspa=4000;
	int totalfee=(gymfee+trainerandspa);
	public void Membershiptype() {
		System.out.println("Normal Membership:"+gymfee);
		System.out.println("Premium Membership:"+(gymfee+trainerandspa));
		
	}
}
class PremiumMembership extends Membership{
	String personaltrainer="Yes";
	String spa="Yes";
	public void PremiumBenefits() {
		if(totalfee==6000) {
			System.out.println("Personal Trainer:Available");
			System.out.println("Spa Acess:Available");
			
		}
		else {
			System.out.println("Personal Trainer:Not Available");
			System.out.println("Spa Access:Not Available");
		}
	}
}
public class GymMembership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Membership membershipdetails=new Membership();
		PremiumMembership benefits=new PremiumMembership();
		membershipdetails.Membershiptype();
		benefits.PremiumBenefits();
		
		

	}

}
