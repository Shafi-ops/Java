package myJava;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class DateandTimetask {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day:");
		String d=sc.next();
		System.out.println("Enter the month:");
		String m=sc.next();
		System.out.println("Enter the year:");
		String y=sc.next();
		int dd=Integer.parseInt(d);
		int mm=Integer.parseInt(m);
		int yyyy=Integer.parseInt(y);
		String datestring=(dd+4)+"/"+(mm+4)+"/"+(yyyy+4);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd:mm:yyyy");
		try {
			Date date=sdf.parse(datestring);
			System.out.println("Input Date:"+sdf.format(date));
		}
		catch(ParseException e) {
			System.out.println("Invalid format");
		}

	}

}
