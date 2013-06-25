/*  Name:  Jacob Schleith
     Class Dog –  Extends Class HouseHoldPet – (Abstract)
     Date:  July 5, 2011       */
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Dog extends HouseHoldPet{
	
	private static int numberOfDogs = 0; 	//represents total number of dogs in the database.
	protected int numberOfWalksPerDay;		//how many times the dog goes for a walk per day
	protected String placeISleep;			//the place where the dog usually sleeps
	
	 //no-arg default constructor
	public Dog(){
		super();
		numberOfDogs = 0;
		numberOfWalksPerDay = 0;
		placeISleep = "";	
		numberOfDogs++;
	}
	
	//overloaded constructor – name, owner, favfood, numWalks, birthday, sleepspot
	public Dog(String n, String o, String ff, int w, GregorianCalendar b, String s){
		super(n, o, ff, b);
		numberOfWalksPerDay = w;
		placeISleep = s;
		numberOfDogs++;
	}
	
	 //returns number of dogs in the database
	public static int getNumberOfDogs(){
		return numberOfDogs;
	}
	
	 //sets place the dog usually sleep
	public String whereISleep(){
		return placeISleep;
	}
	
	 //sets place the dog usually sleep
	public void setPlaceISleep(String SleepSpot){
		placeISleep = SleepSpot;
	}
	
	 //implementation of how the dog move
	public String howIMove(){
		return "I walk on all four legs.";
	}
	
	//overrides toString() method in HouseHoldPet class – returns Dog info
	public String toString() {
		return super.toString() + "I am a dog and walk " + numberOfWalksPerDay + " times per day.\nPlaces I sleep: " + placeISleep + ".\n" + howIMove() + "\n";
	} 
	
	 //used when user inputs new Dog info via addDogButto
	public static int addWalksPerDay(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of time the dog gets walked per day:" );
		return input.nextInt();
	}
	
	 //used when user inputs new Dog info via addDogButton
	public static String addPlaceSleeps(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter where the dog likes to sleep:" );
		return input.next();
	}
	
}
