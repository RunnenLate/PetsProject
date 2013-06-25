/*  Name:  Jacob Schleith
     Class Rabbit –  Extends Class HouseHoldPet – (Abstract)
     Date:  July 5, 2011       */
import java.util.GregorianCalendar;  //import GregorianCalendar utility 
import java.util.Scanner;  //import Scanner utility 

public class Rabbit extends HouseHoldPet{

	private static int numberOfRabbits;		//represents total number of rabbits in the database.
	protected String favoriteActivity;		//the rabbit’s favorite thing to do
	protected String placeISleep;			//the place where the rabbit usually sleeps
	
	public Rabbit(){
		super();
		favoriteActivity = "";
		placeISleep = "";
		numberOfRabbits++;
	}
	
	//overloaded constructor - name, owner, favfood, favthing , birthday, sleepspot
	public Rabbit(String n, String o, String ff, String favthing, GregorianCalendar bday, String s){
		super(n, o, ff, bday);
		favoriteActivity = favthing;
		placeISleep = s;
		numberOfRabbits++;	
	}
	
	//returns number of rabbits in the datacase
	public static int getNumberOfRabbits(){
		return numberOfRabbits;
	}
	
	 //implementation of where the pet usually sleep
	public String whereISleep() {
		return placeISleep;
	}
	
	 //sets place the rabbit usually sleep
	public void setPlaceISleep(String sleepSpot){
		placeISleep = sleepSpot;
	}
	
	 //implementation of how the rabbit moves
	public String howIMove(){
		return "I walk on all four legs.";
	}
	
	//overrides toString() method in HouseHoldPet class – returns Bird info
	public String toString(){
	return super.toString() + "I am a bunny rabbit and my favorite activity is " + favoriteActivity + ".\nPlaces I sleep: " + placeISleep + ".\n" + howIMove() + "\n";
	}
	
	 //used when adding a new rabbit from the console
	public static String  addFavActivity(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in the Rabbits favorite activity:" );
		return input.next();
	}
	
	 //used when adding a new rabbit from the console
	public static String addPlaceSleeps(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the place the bird sleeps:" );
		return input.next();
	}
	
}
	