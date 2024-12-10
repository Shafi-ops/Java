package myJava;
class Vehicles{
	String CarName="Honda";
	String TruckName="Mahindra";
	int year=2022;
	public void VehicleDetails() {
		System.out.println("The names of the cars and trucks are "+CarName+" and "+TruckName);
		System.out.println("The Year of maufacturing is "+year);
	
	
	}
}
class Cars extends Vehicles{
	int CarTrunk=506;
	public void CarTrunksize() {
		System.out.println("The Trunk size of the car is "+CarTrunk+" Litres");
		
	}
	
}
class Trucks extends Vehicles{
	String TruckPayload="1500 kgs";
	public void TruckPayloadCapacity() {
		System.out.println("The payload capacity of the truck is "+TruckPayload);
	}
}





public class VehicleUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars carobj=new Cars();
		Trucks truckobj=new Trucks();
		carobj.VehicleDetails();
		carobj.CarTrunksize();
		System.out.println("-----------------------");
		truckobj.VehicleDetails();
		truckobj.TruckPayloadCapacity();
		

	}

}
