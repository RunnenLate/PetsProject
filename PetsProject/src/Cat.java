/*  Name:  Jacob Schleith
     Class Cat –  Extends Class HouseHoldPet – (Abstract)
     Date:  July 5, 2011       */

import java.util.GregorianCalendar;  //import GregorianCalendar utility 
import java.util.Scanner;  //import Scanner utility 

public class Cat extends HouseHoldPet{

	private static int numberOfCats;				//represents total number of cats in the database.
	protected int numberOfHoursSleepingPerDay;		//how many hours the cat sleeps per day
	protected String favtoy;						//the cat’s favorite toy to play with
	protected String placeISleep;					 //the place where the cat usually sleeps
	
	//default constructor 
	public Cat() {
		super();
		numberOfHoursSleepingPerDay = 0;
		favtoy = "";
		placeISleep = "";
		numberOfCats++;	
	}
	
	//overload constructor - name, owner, favfood, favtoy, sleephrs, birthday, sleepspot
	public Cat(String n, String o, String f, String t, int h, GregorianCalendar b, String s) {
		super(n, o, f, b);
		numberOfHoursSleepingPerDay = h;
		favtoy = t;
		placeISleep = s;
		numberOfCats++;
	}
	
	//returns number of cats in the database
	public static int getNumberOfCats(){
		return numberOfCats;
	}
	
	//implementation of where the pet usually sleeps
	public String whereISleep(){
		return placeISleep;
	}
	
	//sets place the cat usually sleeps
	public void setPlaceISleep(String sleepSpot){
		placeISleep = sleepSpot;
	}
	
	//implementation of how the cat moves
	public String howIMove(){
		return "I walk on all four legs";
	}
	
	//overrides toString() method in HouseHoldPet class - returns Cat info.
	public String toString(){
		return super.toString() + "I am a cat and I like to sleep " + numberOfHoursSleepingPerDay + " per day.\nPlaces I sleep: " + placeISleep + ".\nFavorite toy: " + favtoy + ".\n" + howIMove()+ "\n";
	}
	
	//used when adding new cat form console 
	public static int addHoursSleep(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of hours the cat sleeps per day:" );
		return input.nextInt();
	}
	
	//used when adding new cat from console 
	public static String addFavToy(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the cats favorite toy:" );
		return input.next();
	}
	
	//used when adding new cat from console 
	public static String addPlaceSleeps(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in the place the cat like to sleep:" );
		return input.next();
	}

}
