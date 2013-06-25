//Program 3 - COP 3330 - Summer 2011
//PetDatabase.java
//MJL  June 16, 2011

import javax.swing.*;  
import java.util.*;        
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PetDatabase extends JFrame implements ActionListener  {
	
	private static final int MAX = 10;  //upper array limit
	protected Dog doggie[] = new Dog[MAX];
	protected Cat kittie[] = new Cat[MAX];
	protected Bird birdie[] = new Bird[MAX];
	protected Rabbit bunny[] = new Rabbit[MAX];
	protected Cow cow[] = new Cow[MAX];
	protected Horse horse[] = new Horse[MAX];
	
	JButton dogAddButton = new JButton("Add New Dog Information");
	JButton catAddButton = new JButton("Add New Cat Information");
	JButton birdAddButton = new JButton("Add New Bird Information");
	JButton rabbitAddButton = new JButton("Add New Bunny Information");
	JButton cowAddButton = new JButton("Add New Cow Information");
	JButton horseAddButton = new JButton("Add New Horse Information");

	
	JButton dogButton = new JButton("Show Dog Information");
	JButton catButton = new JButton("Show Cat Information");
	JButton birdButton = new JButton("Show Bird Information");
	JButton rabbitButton = new JButton("Show Bunny Information");
	JButton cowButton = new JButton("Show Cow Information");
	JButton horseButton = new JButton("Show Horse Information");

	JLabel welcome1= new JLabel("    Select the Button of Your Choice");
	JLabel welcome2 = new JLabel("to Enter/Display Pet Information");
	//JTextField welcome1= new JTextField("    Select the Button of Your Choice");
	//JTextField welcome2 = new JTextField("to Display Pet Information");
	
	public PetDatabase() {
		//Dogs need their name, owner, fav food, #walks/day, and birthdate.
		GregorianCalendar dogBday0 = new GregorianCalendar(2005,4,28);
		doggie[0] = new Dog("Norman","Debi", "cookies", 3, dogBday0, "on my chair");
		GregorianCalendar dogBday1 = new GregorianCalendar(2006,7,13);
		doggie[1] = new Dog("Bubbles", "Mark", "rawhide bones", 4, dogBday1, "in my own little fluff bed, but sometimes I sleep with Mark :)");
		
		//Cats need their name, owner, , fav food, fav toy, hours/day sleeping, and birthdate.
		GregorianCalendar catBday0 = new GregorianCalendar(2000,11,16);
		kittie[0] = new Cat("Squeaky", "Mark", "tuna fish", "catnip mouse", 8, catBday0, "on Mark's bed.");
		GregorianCalendar catBday1 = new GregorianCalendar(1996,12,1);
		kittie[1] = new Cat("Paris", "Kristy", "salmon", "catnip ball", 9, catBday1, "in my bed");
		GregorianCalendar catBday2 = new GregorianCalendar(2001,4,16);
		kittie[2] = new Cat("Bug", "Tiffany", "chow", "string", 12, catBday2, "in the window sill");
		GregorianCalendar catBday3 = new GregorianCalendar(1995,3,14);
		kittie[3] = new Cat("Muffin", "Debi", "tuna fish baby!", "Debi's feet", 10, catBday3, "Debi's bed");
		GregorianCalendar catBday4 = new GregorianCalendar(2004,10,24);
		kittie[4] = new Cat("CB", "Krystal", "sushi", "Catnip Mouse ", 8, catBday4, "in my box");
		GregorianCalendar catBday5 = new GregorianCalendar(2003,6,27);
		kittie[5] = new Cat("Kitty Kat", "Marci", "tuna fish", "Catnip Mouse", 8, catBday5, "in my special tree house");
		GregorianCalendar catBday6 = new GregorianCalendar(2002,8,12);
		kittie[6] = new Cat("Tigger", "Mark", "Purina brand Ocean Whitfish", "catnip mouse", 10, catBday6, "wherever I bloody well feel like");

		//Birds need their name, owner, fav food, time out each day, add birthday
		//Birds don't eat cookies so override the default value
		birdie[0] = new Bird();
		birdie[0].setFavoriteFood("bird seed");
		birdie[0].setPlaceISleep("in my tree");
		GregorianCalendar birdBday1 = new GregorianCalendar(2000,11,16);
		birdie[1] = new Bird("Petey", "Ralph", "grapes", 1, birdBday1, "on my swing");
				
		//Rabbits need their name, owner, fav food, fav activity
		GregorianCalendar rabbitBday = new GregorianCalendar(2007,11,30);
		bunny[0] = new Rabbit("Bella", "Rebecca", "carrots", "jumping on the bed", rabbitBday, "in my box");
		GregorianCalendar rabbitBday1 = new GregorianCalendar(2008,5,17);
		bunny[1] = new Rabbit("Noodles", "Kimberly", "peanuts", "climbing tubes", rabbitBday1, "in my special box");
		
		//Cows need their name, owner, fav food, and weight
		cow[0] = new Cow("Tornado", "Steve", "hay", 4500, 10, "Holstein");
		cow[1] = new Cow("Elsie", "Borden's", "sweet feed", 3799, 20, "Jersey");
		
		//Horses need their name, owner, fav food, and weight
		horse[0] = new Horse("Bill", "Rita", "honey oats", 1500, "Palomino", 13);
		horse[1] = new Horse("Dusty", "Lisa", "cracked corn", 1800, "Tennessee Walker", 16);
		horse[1].setMyBreed("Apaloosa");
		
		
		this.setTitle("Pet Information Center");
				
		Container canvas = getContentPane();  
		canvas.setLayout( new GridLayout(8,2) );
		
		canvas.setBackground(Color.green);
		welcome1.setForeground(Color.black);
		welcome2.setForeground(Color.black);

		//Now add the buttons to the canvas
		canvas.add(dogAddButton);
		canvas.add(catAddButton);
		canvas.add(birdAddButton);
		canvas.add(rabbitAddButton);
		canvas.add(cowAddButton);
		canvas.add(horseAddButton);
		canvas.add(dogButton);
		canvas.add(catButton);
		canvas.add(birdButton);
		canvas.add(rabbitButton);
		canvas.add(cowButton);
		canvas.add(horseButton);
		canvas.add(welcome1);
		canvas.add(welcome2);
		
		//Now need to add the listeners for the buttons
		dogButton.addActionListener(this);
		catButton.addActionListener(this);
		birdButton.addActionListener(this);
		rabbitButton.addActionListener(this);
		cowButton.addActionListener(this);
		horseButton.addActionListener(this);
		dogAddButton.addActionListener(this);
		catAddButton.addActionListener(this);
		birdAddButton.addActionListener(this);
		cowAddButton.addActionListener(this);
		horseAddButton.addActionListener(this);
		
		//Set the size of the window and show it. 
		this.setSize(410,350); 
		//uncomment the following line in order to put the GUI in the center of your window
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
	}//end default constructor
	
	public static void main(String args[])	{
		Scanner stdin = new Scanner(System.in);   
	    String lineSeparator = System.getProperty("line.separator");
	    stdin.useDelimiter(lineSeparator);
		PetDatabase theApp = new PetDatabase();
		theApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end main method
	
	//Each buttons' event shows a message box that displays 
	//the object's toString() information. 
	public void actionPerformed(ActionEvent e)
	{
		String localname;
		String localowner;
		String localfavfood;
		GregorianCalendar localbday;
		String localsleepplace;
		int localhrssleep;
		String localfavtoy;
		String localfavactivity;
		int localnumwalks;
		int localweight;
		String localfavthingtodo;
		String localbreed;
		int localgallons;
		int localtimesout;
		int localheight;
		
		//view dogs
		if(e.getSource() == dogButton){
			for (int x = 0; x < Dog.getNumberOfDogs(); ++x){
				if (doggie[x] != null){
				 	JOptionPane.showMessageDialog(this,doggie[x].toString(),
					       "Dog Class", JOptionPane.INFORMATION_MESSAGE);
				}//end if stmt
				else System.out.println("Error in Array");
			}//end for loop
		}//end if stmt
		//view cats
		else if(e.getSource() == catButton){
			for (int x = 0; x < Cat.getNumberOfCats(); ++x){
				if (kittie[x] != null){
					JOptionPane.showMessageDialog(this, kittie[x].toString(),
				           "Cat Class", JOptionPane.INFORMATION_MESSAGE);
				}//end if stmt 
				else System.out.println("Error in Array");
			}//end for loop
		}//end if stmt
		//view birds
		else if(e.getSource() == birdButton){
			for (int x = 0; x < Bird.getNumberOfBirds(); ++x){
				if (birdie[x] != null){
					JOptionPane.showMessageDialog(this, birdie[x].toString(),
				           "Bird Class", JOptionPane.INFORMATION_MESSAGE);
				}//end if stmt 
				else System.out.println("Error in Array");
			}//end for loop
		}//end if stmt
		//view bunnies
		else if(e.getSource() == rabbitButton){
			for (int x = 0; x < Rabbit.getNumberOfRabbits(); ++x){
				if (bunny[x] != null){
					JOptionPane.showMessageDialog(this, bunny[x].toString(),
				           "Rabbit Class", JOptionPane.INFORMATION_MESSAGE);
				}//end if stmt 
				else System.out.println("Error in Array");
			}//end for loop
		}//end if stmt
		//view cows
		else if(e.getSource() == cowButton){
			for (int x = 0; x < Cow.getNumberOfCows(); ++x){
				if (cow[x] != null){
					JOptionPane.showMessageDialog(this, cow[x].toString(),
				           "Cow Class", JOptionPane.INFORMATION_MESSAGE);
				}//end if stmt 
				else System.out.println("Error in Array");
			}//end for loop
		}//end if stmt
		//view horses
		else if(e.getSource() == horseButton){
			for (int x = 0; x < Horse.getNumberOfHorses(); ++x){
				if (horse[x] != null){
					JOptionPane.showMessageDialog(this, horse[x].toString(),
				           "Horse Class", JOptionPane.INFORMATION_MESSAGE);
				}//end if stmt 
				else System.out.println("Error in Array");
			}//end for loop
		}//end if stmt
		//add a dog
		else if(e.getSource() == dogAddButton){
			int curdogs = Dog.getNumberOfDogs();
			if (curdogs < MAX){
				localname = Pets.addPetName();
				localowner = Pets.addPetOwner();
				localfavfood = Pets.addPetFavFood();
				localbday = HouseHoldPet.addPetBirthday();
			    localnumwalks = Dog.addWalksPerDay();
				localsleepplace = Dog.addPlaceSleeps();
				doggie[curdogs] = new Dog(localname, localowner, localfavfood, localnumwalks, localbday, localsleepplace);
			}
			else System.out.println("Sorry...the dog database is full!");
		}//end if stmt
		//add a cat
		else if(e.getSource() == catAddButton){
			int curcats = Cat.getNumberOfCats();
			if (curcats < MAX){
				localname = Pets.addPetName();
				localowner = Pets.addPetOwner();
				localfavfood = Pets.addPetFavFood();
				localbday = HouseHoldPet.addPetBirthday();
			    localhrssleep = Cat.addHoursSleep();
			    localfavtoy = Cat.addFavToy();
				localsleepplace = Cat.addPlaceSleeps();
				kittie[curcats] = new Cat(localname, localowner, localfavfood, localfavtoy, localhrssleep, localbday, localsleepplace);
			}
			else System.out.println("Sorry...the cat database is full!");
		}//end if stmt
		//add a bird
		else if(e.getSource() == birdAddButton){
			int curbirds = Bird.getNumberOfBirds();
			if (curbirds < MAX){
				localname = Pets.addPetName();
				localowner = Pets.addPetOwner();
				localfavfood = Pets.addPetFavFood();
				localbday = HouseHoldPet.addPetBirthday();
			    localtimesout = Bird.addTimesOut();
			   	localsleepplace = Bird.addPlaceSleeps();
				birdie[curbirds] = new Bird(localname, localowner, localfavfood, localtimesout, localbday, localsleepplace);
			}
			else System.out.println("Sorry...the cat database is full!");
		}//end if stmt
		//add a rabbit
		else if(e.getSource() == rabbitAddButton){
			int currabbits = Rabbit.getNumberOfRabbits();
			if (currabbits < MAX){
				localname = Pets.addPetName();
				localowner = Pets.addPetOwner();
				localfavfood = Pets.addPetFavFood();
				localbday = HouseHoldPet.addPetBirthday();
			    localfavactivity = Rabbit.addFavActivity();
			   	localsleepplace = Rabbit.addPlaceSleeps();
				bunny[currabbits] = new Rabbit(localname, localowner, localfavfood, localfavactivity, localbday, localsleepplace);
			}
			else System.out.println("Sorry...the cat database is full!");
		}//end if stmt
		//add a cow
		else if(e.getSource() == cowAddButton){
			int curcows = Cow.getNumberOfCows();
			if (curcows < MAX){
				localname = Pets.addPetName();
				localowner = Pets.addPetOwner();
				localfavfood = Pets.addPetFavFood();
				localweight = BarnYardPet.addWeight();
			    localbreed = Cow.addBreed();
			   	localgallons = Cow.addHowMuchMilk();
				cow[curcows] = new Cow(localname, localowner, localfavfood, localweight, localgallons, localbreed);
			}
			else System.out.println("Sorry...the cow database is full!");
		}//end if stmt
		//add a horse
		else if(e.getSource() == horseAddButton){
			int curhorses = Horse.getNumberOfHorses();
			if (curhorses < MAX){
				localname = Pets.addPetName();
				localowner = Pets.addPetOwner();
				localfavfood = Pets.addPetFavFood();
				localweight = BarnYardPet.addWeight();
			    localbreed = Horse.addBreed();
			   	localheight = Horse.addHeight();
				horse[curhorses] = new Horse(localname, localowner, localfavfood, localweight, localbreed, localheight);
			}
			else System.out.println("Sorry...the cow database is full!");
		}//end if stmt
	}//end actionPerformed method
}//end PetDatabase class


