/*  Name:  Jacob Schleith
     Class BarnYeardPet –  Extends Class Pet – (Abstract)
     Date:  July 5, 2011       */
import java.util.Scanner;  //import Scanner utility 

public abstract class BarnYardPet extends Pets {

	protected int weight;
	
	 //abstract method indicating the pet’s breed
	public abstract String whatsMyBreed();
	
	//abstract method indicating what the pet does
	public abstract String whatIDo();
	
	//default constructor
	protected BarnYardPet() {
		super();
		weight = 0;
	}
	
	 //overloaded constructor – name/owner/weigh
	protected BarnYardPet(String n, String o, String ff, int weight){
		super(n, o, ff);
		this.weight = weight; 
	}
	
	//sets the pet’s weight in pounds
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	//returns the barnyard animal’s weight in pounds
	public int getWeight(){
		return weight;
	}
	
	//overrides toString() method in Object class – returns BarnYardPet info
	public String toString() {
		return super.toString() + "I am a Farm animal.\nMy weight is: " + weight + ".\n";	 
	} 
	
	//used when entering a new barnyard pet from the console
	public static int addWeight(){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the weight of the pet: ");
		return input.nextInt();
	}
	
}

