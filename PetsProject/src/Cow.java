/*  Name:  Jacob Schleith
     Class Cow –  Extends Class BarnYardPet – (Abstract)
     Date:  July 5, 2011       */
import java.util.Scanner;  //import Scanner utility 

public class Cow extends BarnYardPet{

	private static int numberOfCows;	//represents total number of cows in the database.	
	protected String myBreed;			//the cow’s breed
	protected int gallonsOfMilkPerDay;	//how many gallons of milk the cow produces each day		
	
	//default constructor
	public Cow(){
		super();
		myBreed = "";
		gallonsOfMilkPerDay = 0;
		numberOfCows++;
	}
	
	//overloaded constructor – name/owner/favfood/weight/gallons/breed
	public Cow(String n, String o, String ff, int w, int g, String b){
		super(n, o, ff, w);
		myBreed = b;
		gallonsOfMilkPerDay = g;
		numberOfCows++;	
	}
	
	//returns number of cows in the datacase
	public static int getNumberOfCows(){
		return numberOfCows;
	}
	
	//implementation of whatsMyBreed
	public String whatsMyBreed() {
		return myBreed;
	}
	
	//sets breed of the cow
	public void setMyBreed(String breed){
		myBreed = breed;
	}
	
	//implementation of whatIDo
	 public String whatIDo(){
		 return "My job on the farm is to produce milk.";
	 }
	
	 //implementation of how the cow moves
	public String howIMove(){
		return "I moosy around on four legs";
	}
	
	//overrides toString() method in BarnYardPet class – returns Cow  info.
	public String toString(){
	return super.toString() + "I am a cow.\nI am a " + myBreed + " breed.\n" + whatIDo()+ "\nI make "  + gallonsOfMilkPerDay + " gallons of milk per day.\n" + howIMove() + "\n";
	}
	
	//used when adding a new cow from the console
	public static int addHowMuchMilk(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in how much milk the cow makes per day:" );
		return input.nextInt();
	}
	
	//used when adding a new cow from the console
	public static String addBreed(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in what breed the cow is:" );
		return input.next();
	}
	
}
