package myJava;
import java.util.Scanner;
public class Actors {
enum actors{Rajini,Vijay,Kamal}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the actor name:");
		String input=reader.nextLine();
        actors rating=actors.valueOf(input);
		switch(input) {
		case "Rajini":
			System.out.println("Kabaali");
			System.out.println("Kaala");
			System.out.println("Petta");
			System.out.println("Annatha");
			System.out.println("Jailer");
			Scanner Raj=new Scanner(System.in);
			System.out.println("Enter a movie name to find if it is Blockbuster or not:");
			String Mov1=Raj.nextLine();
			switch(Mov1){
			case "Kabaali":
				System.out.println("This movie is a Blockbuster");
				break;
			case "Kaala":
				System.out.println("This movie is not a Blockbuster");
				break;
			case "Petta":
				System.out.println("This movie is a Blockbuster");
				break;
			case "Annatha":
				System.out.println("This movie is not a Blockbuster");
				break;
			case "Jailer":
				System.out.println("This movie is a Blockbuster");
				break;
			
			
			}break;
		case "Vijay":
			System.out.println("Katthi");
			System.out.println("Thuppaki");
			System.out.println("Puli");
			System.out.println("Mersal");
			System.out.println("Suraa");
			Scanner Vij=new Scanner(System.in);
			System.out.println("Enter a movie name to find if it is a Blockbuster or not:");
			String Mov2=Vij.nextLine();
			switch(Mov2) {
			case "Katthi":
				System.out.println("This movie is a Blockbuster");
				break;
			case "Thuppaki":
				System.out.println("This movie is a Blockbuster");
				break;
			case "Puli":
				System.out.println("This movie is not a Blockbuster");
				break;
			case "Mersal":
				System.out.println("This movie is a Blockbuster");
				break;
			case "Suraa":
				System.out.println("This movie is not a Blockbuster");
				break;
			}break;
		case "Kamal":
			System.out.println("Viswaroopam");
			System.out.println("Vettaiyadu Vilayadu");
			System.out.println("Vikram");
			System.out.println("Indian 2");
			System.out.println("Uthama villain");
			Scanner Kam=new Scanner(System.in);
			System.out.println("Enter a movie name to find if it is a Blockbuster or not:");
			String Mov3=Kam.nextLine();
			switch(Mov3) {
			case "Viswaroopam":
				System.out.println("This movie is a Blockbuster");
				break;
			case "Vettaiyadu Vilayadu":
				System.out.println("This movie is a Blockbuster");
				break;
			case "Vikram":
				System.out.println("This movie is not a Blockbuster");
				break;
			case "Indian 2":
				System.out.println("This movie is not a Blockbuster");
				break;
			case "Uthama villain":
				System.out.println("This movie is not a Blockbuster");
				break;
			}break;
			
		}

	}

}
