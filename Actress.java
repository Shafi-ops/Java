package myJava;
import java.util.Scanner;
public class Actress {
enum actress{Samantha,Trisha,Nayanthara}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the actress name:");
		String input=reader.nextLine();
actress paired=actress.valueOf(input);
switch(input) {
case "Samantha":
	System.out.println("Mersal");
	System.out.println();
	System.out.println("Anjaan");
	System.out.println();
	System.out.println("Theri");
	System.out.println();
	Scanner Sam=new Scanner(System.in);
	System.out.println("Enter a movie name to find the paired actor:");
	String Act1=Sam.nextLine();
	switch(Act1) {
	case "Mersal", "Theri":
		System.out.println("The paired actor is Vijay");
	    break;
	case "Anjaan":
		System.out.println("The paired actor is Suriya");
		break;
	}break;
case "Trisha":
	System.out.println("Ghilli");
	System.out.println();
	System.out.println("Mankatha");
	System.out.println();
	System.out.println("Saamy");
	System.out.println();
	Scanner Tri=new Scanner(System.in);
	System.out.println("Enter a movie name to find the paired actor:");
	String Act2=Tri.nextLine();
    switch(Act2) {
    case "Ghilli":
    	System.out.println("The paired actor is Vijay");
    	break;
    case "Mankatha":
    	System.out.println("The paired actor is Ajith");
    	break;
    case "Saamy":
    	System.out.println("The paired actor is Vikram");
    	break;
    }break;
case "Nayanthara":
	System.out.println("Billa");
	System.out.println();
	System.out.println("Naanum Rowdy Dhan");
	System.out.println();
	System.out.println("Villu");
	System.out.println();
	Scanner Nayan=new Scanner(System.in);
	System.out.println("Enter a movie name to find the paired actor:");
	String Act3=Nayan.nextLine();
	switch(Act3) {
	case "Billa":
    	System.out.println("The paired actor is Ajith");
    	break;
    case "Naanum Rowdy Dhan":
    	System.out.println("The paired actor is Vijay Sethupathy");
    	break;
    case "Villu":
    	System.out.println("The paired actor is Vijay");
    	break;
	
	}break;
}   

	}

}
