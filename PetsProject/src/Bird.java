/*  Name:  Jacob Schleith
     Class Bird –  Extends Class HouseholdPet – (Abstract)
     Date:  July 5, 2011       */
import java.util.GregorianCalendar;  //import GregorianCalendar utility 
import java.util.Scanner;  //import Scanner utility 


public class Bird extends HouseHoldPet{

	private static int numberOfBirds;
	protected int times_I_get_out_each_day;
	protected String placeISleep;
	
	public Bird(){
		super();
		times_I_get_out_each_day = 0;
		placeISleep = "";
		numberOfBirds++;
	}
	
	//overloaded constructor - name, owner, favfood, timeout , birthday, sleepspot
	public Bird(String n, String o, String ff, int timeout, GregorianCalendar bday, String s){
		super(n, o, ff, bday);
		times_I_get_out_each_day = timeout;
		placeISleep = s;
		numberOfBirds++;	
	}
	
	//returns number of birds in the datacase
	public static int getNumberOfBirds(){
		return numberOfBirds;
	}
	
	 //implementation of where the pet usually sleep
	public String whereISleep() {
		return placeISleep;
	}
	
	 //sets place the bird usually sleep
	public void setPlaceISleep(String sleepSpot){
		placeISleep = sleepSpot;
	}
	
	 //implementation of how the bird moves
	public String howIMove(){
		return "I fly with my wings.";
	}
	
	//overrides toString() method in HouseHoldPet class – returns Bird info
	public String toString(){
	return super.toString() + "I am a bird and I get out of my cage " + times_I_get_out_each_day + " per day.\nPlaces I sleep: " + placeISleep + ".\n" + howIMove() + "\n";
	}
	
	 //used when adding a new bird from the console
	public static int addTimesOut(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of times the bird is allowed out each day:" );
		return input.nextInt();
	}
	
	 //used when adding a new bird from the console
	public static String addPlaceSleeps(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the place the bird sleeps:" );
		return input.next();
	}
}

