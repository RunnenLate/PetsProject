/*  Name:  Jacob Schleith
     Class Horse –  Extends Class BarnYardPet – (Abstract)
     Date:  July 5, 2011       */
import java.util.Scanner;	//import Scanner utility 

public class Horse extends BarnYardPet{

	private static int numberOfHorses;	//represents total number of horses in the database.	
	protected String myBreed;			//the horses’s breed
	protected int myHeight;				//the horse’s height in hands
	
	//default constructor
	public Horse(){
		super();
		myBreed = "";
		myHeight = 0;
		numberOfHorses++;
	}
	
	 //overloaded constructor – name/owner/favfood/weight/breed/height
	public Horse(String n, String o, String ff, int w, String b, int h){
		super(n, o, ff, w);
		myBreed = b;
		myHeight = h;
		numberOfHorses++;	
	}
	
	//returns number of horses in the datacase
	public static int getNumberOfHorses(){
		return numberOfHorses;
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
		 return "I pull the plow and a cart.";
	 }
	
	 //implementation of how the horse moves
	public String howIMove(){
		return "I run around on four legs.";
	}
	
	//overrides toString() method in BarnYardPet class – returns Cow  info.
	public String toString(){
	return super.toString() + "I am a horse.\nI am of a " + myBreed + " breed.\nI stand " + myHeight + " hands high.\n" + whatIDo() + "\n" + howIMove() + "\n";
	}
	
	//used when adding a new horse from the console
	public static int addHeight(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in the height of the horse (inches):" );
		return input.nextInt();
	}
	
	//used when adding a new horse from the console
	public static String addBreed(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in what breed the horse is:" );
		return input.next();
	}
	
}