/*  Name:  Jacob Schleith
     Class Pet –  Supports Class PetDatabase – (Abstract)
     Date:  July 5, 2011       */
import java.util.Scanner;

public abstract class Pets {
	
	protected String name;   			// the name of the pet
	protected String favoriteFood;		//the pet’s favorite food to eat
	protected String owner;				//the name of the pet’s owner
	
	//abstract method indicating how the pet moves around
	public abstract String howIMove();
	
	 //default constructor
	protected Pets() {
		name = "";
		favoriteFood = "";
		owner = "";
	}
	
	 //overloaded constructor – name/owner/favfood
	protected Pets(String n, String o, String ff) {
		name = n;
		favoriteFood = ff;
		owner = o;
	}
	
	 //sets the pet’s name to n
	public void setName(String n) {
		name = n;
	}
	
	 //sets the pet’s favorite food to ff
	public void setFavoriteFood(String ff) {
		favoriteFood = ff;
	}
	
	//sets the pet’s owner to o
	public void setOwner(String o) {
		owner = o;
	}
	
	//overrides toString() method in Object class – returns Pet info.
	public String toString() {
		return "My name is: " + name + ".\nMy favorite food is: " + favoriteFood + ".\nMy owner is: " + owner +".\n";
	}
	//used when user inputs new pet from console
	public static String addPetName() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter pet name:" );
		return input.next();
	}
	
	//used when user inputs new pet from console
	public static String addPetOwner() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter pet owner's name:" );
		return input.next();
	}
	
	//used when user input new pet from console
	public static String addPetFavFood() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter pet favorite food:" );
		return input.next();
	}
	
}

