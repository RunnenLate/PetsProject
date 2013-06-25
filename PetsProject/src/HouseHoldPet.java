/*  Name:  Jacob Schleith
     Class HouseHoldPet –  Extends Class Pet – (Abstract)
     Date:  July 5, 2011       */

import java.util.Calendar;
import java.util.GregorianCalendar;  //import GregorianCalendar utility 
import java.util.Scanner;  //import Scanner utility 


public abstract class HouseHoldPet extends Pets {

	protected GregorianCalendar birthdate;			// the birthday of the pet
	
	//abstract method indicating where the pet usually sleeps
	public abstract String whereISleep();
	
	 //default constructor
	protected HouseHoldPet() {
		super();
		birthdate = new GregorianCalendar();
	}
	
	//overloaded constructor – name/owner/favfood
	protected HouseHoldPet(String n, String o, String ff, GregorianCalendar bday){
		super(n, o, ff);
		birthdate = bday; 
	}
	
	 //sets the pet’s birthdate
	public static GregorianCalendar addPetBirthday(){
		int day;
		int month;
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the month pet was born: (1-12)");
		day = input.nextInt();
		
		System.out.println("Please enter the day pet was born: (1-31)");
		month = input.nextInt();
		month -= 1;
		
		System.out.println("Please enter the year pet was born: (YYYY)");
		year = input.nextInt();
		
		GregorianCalendar bday  = new GregorianCalendar(year, month, day);
		return bday; 
	}
	
	//overrides toString() method in Object class – returns Pet info.
	public void setBirthDate(GregorianCalendar bday) {
		birthdate = bday;
	}
	
	//used when user inputs new HouseHoldPet from console
	public String toString() {
		return super.toString() + "My birthday is: " + birthdate.get(Calendar.MONTH) + "/" + birthdate.get(Calendar.DATE) + "/" + birthdate.get(Calendar.YEAR) + "\n";	 
	}
	
}
	