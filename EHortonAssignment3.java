//Programmer: Elizabeth Nocon
//Class: CS 1450.001 MW
//Assignment Number: 3
//Due Date: 9/12/2018
//Description: 
//This program reads a text file, and creates objects based off of the information.
//The program then runs four different methods to sort the objects, and display them.

import java.util.Scanner;
import java.util.ArrayList;

public class EHortonAssignment3 
{
	public static void main (String[] args) throws Exception 
	{
		//Create a file instance. 
		java.io.File file = new java.io.File("birds.txt");
		
		//Create a scanner for the characters text file. 
		Scanner input = new Scanner(file);
				
		//Read first string and convert the numbers to integer form.
		String numberOfBirds = input.next();
		int integerOfBirds = Integer.parseInt(numberOfBirds);
		
		//Create polymorphic array. Assign size as integerOfBirds.
		Bird[] birds = new Bird[integerOfBirds];
		
		//Create a for loop to read and create bird objects based on the text file.
		for (int i = 0; i < birds.length; i++) 
		{
			//Read text values for key, name, and the three different speeds.
			String key = input.next();
			String name = input.next();
			int runSpeed = input.nextInt();
			int swimSpeed = input.nextInt();
			int flySpeed = input.nextInt();
			
			//Use a switch statement to create objects, and assign to array.
			switch (key) 
			{
			case "p": birds[i] = new Penguin(name, runSpeed, swimSpeed);
					  break;
			case "o": birds[i] = new Ostrich(name, runSpeed, swimSpeed);
					  break;
			case "d": birds[i] = new Duck(name, runSpeed, swimSpeed, flySpeed);
					  break;
			case "s": birds[i] = new SootyTern(name, runSpeed, flySpeed);
					  break;
			case "l": birds[i] = new Loon(name, swimSpeed, flySpeed);
					  break;
			case "h": birds[i] = new Hummingbird(name, flySpeed);
					  break;
			}
		}
		
		//Print heading for Birds that cannot fly. 
		System.out.println("BIRDS THAT CANNOT FLY!");
		System.out.println("-----------------------");
		
		//Call findCannotFly method. 
		findCannotFly(birds);
		
		//Print heading for Birds that cannot run. 
		System.out.println("BIRDS THAT CANNOT RUN!");
		System.out.println("-----------------------");
		
		//Call findCannotRun method.
		findCannotRun(birds);
		
		//Print heading for Birds that cannot swim. 
		System.out.println("BIRDS THAT CANNOT SWIM!");
		System.out.println("-----------------------");
		
		//Call findCannotSwim method. 
		findCannotSwim(birds);
		
		//Print heading for Birds that can do it all. 
		System.out.println("BIRDS THAT CAN DO IT ALL- RUN, SWIM, AND FLY!");
		System.out.println("---------------------------------------------");
		
		//Call findRunSwimFly method.
		findRunSwimFly(birds);
		
	}//Main
	
	//Create findCannotFly method. 
	public static ArrayList<Bird> findCannotFly(Bird[] birds) 
	{
		//Create array list bird.
		ArrayList<Bird> cannotFlyArray = new ArrayList<>();
		
		//Create for loop to read array, and assign certain values to array list.
		for (int i = 0; i<birds.length; i++) 
		{
			//Assign type of bird to birdType.
			String birdType = birds[i].getType();
			
			//Create switch statement to add to array list, if bird cannot fly.
			switch (birdType) 
			{
			case "Penguin": cannotFlyArray.add(birds[i]);
							System.out.println(birds[i].getName() + " is a Penguin and cannot fly.");
						    if (birds[i] instanceof Penguin) 
						    {
						    	System.out.println(((Penguin)birds[i]).interestingFact() + "\n");
						    }
						    
							break;
			case "Ostrich": cannotFlyArray.add(birds[i]);
							System.out.println(birds[i].getName() + " is an Ostrich and cannot fly.");
						    if (birds[i] instanceof Ostrich) 
						    {
						    	System.out.println(((Ostrich)birds[i]).interestingFact() + "\n");
						    }
							break;
			}
		}
		
		return cannotFlyArray;
	}//Cannot Fly
	
	//Create findCannotRun method. 
	public static ArrayList<Bird> findCannotRun(Bird[] birds) 
	{
		//Create array list bird.
		ArrayList<Bird> cannotRunArray = new ArrayList<>();
		
		//Create for loop to read array, and assign certain values to array list.
		for (int i = 0; i<birds.length; i++) 
		{
			//Assign type of bird to birdType.
			String birdType = birds[i].getType();
			
			//Create switch statement to add to array list, if bird cannot fly.
			switch (birdType) 
			{
			case "Loon": cannotRunArray.add(birds[i]);
							System.out.println(birds[i].getName() + " is a Loon and cannot run.");
						    if (birds[i] instanceof Loon) 
						    {
						    	System.out.println(((Loon)birds[i]).interestingFact() + "\n");
						    }
						    
							break;
			case "Hummingbird": cannotRunArray.add(birds[i]);
							System.out.println(birds[i].getName() + " is a Hummingbird and cannot run.");
						    if (birds[i] instanceof Hummingbird) 
						    {
						    	System.out.println(((Hummingbird)birds[i]).interestingFact() + "\n");
						    }
							break;
			}
		}
		
		return cannotRunArray;
	}//Cannot Run
	
	//Create findCannotSwim method. 
		public static ArrayList<Bird> findCannotSwim(Bird[] birds) 
		{
			//Create array list bird.
			ArrayList<Bird> cannotSwimArray = new ArrayList<>();
			
			//Create for loop to read array, and assign certain values to array list.
			for (int i = 0; i<birds.length; i++) 
			{
				//Assign type of bird to birdType.
				String birdType = birds[i].getType();
				
				//Create switch statement to add to array list, if bird cannot fly.
				switch (birdType) 
				{
				case "Hummingbird": cannotSwimArray.add(birds[i]);
								System.out.println(birds[i].getName() + " is a Hummingbird and cannot swim.");
							    if (birds[i] instanceof Hummingbird) 
							    {
							    	System.out.println(((Hummingbird)birds[i]).interestingFact() + "\n");
							    }
							    
								break;
				case "Sooty Tern": cannotSwimArray.add(birds[i]);
								System.out.println(birds[i].getName() + " is a Sooty Tern and cannot swim.");
							    if (birds[i] instanceof SootyTern) 
							    {
							    	System.out.println(((SootyTern)birds[i]).interestingFact() + "\n");
							    }
								break;
				}
			}
			
			return cannotSwimArray;
		}//Cannot Swim
		
		//Create findRunSwimFly method. 
		public static ArrayList<Bird> findRunSwimFly(Bird[] birds) 
		{
			//Create arraylist. 
			ArrayList<Bird> runSwimFly = new ArrayList<>();
			
			//Use a for loop to print the birds that can do all. 
			for (int i = 0; i < birds.length; i++) 
			{
				//Assign type of bird to variable birdtype.
				String birdType = birds[i].getType(); 
				
				//Create a switch statement to add to the array birds that can do all.
				switch (birdType) 
				{
				case "Duck": runSwimFly.add(birds[i]);
							 System.out.println(birds[i].getName() + " is a Duck, and can do it all.");
							 if (birds[i] instanceof Duck) 
							 {
								 System.out.println("Running at " +((Duck)birds[i]).run() + " mph");
								 System.out.println("Swimming at "+((Duck)birds[i]).swim() + "mph");
								 System.out.println("Flying at " + ((Duck)birds[i]).fly() + " feet in elevation");
								 System.out.println(((Duck)birds[i]).interestingFact());
							 }
							 break;
				}
			}
			
			return runSwimFly;
		}

}//Assignment 2

//Create abstract class Bird.
abstract class Bird 
{
	//Define class Bird data fields.
	private String name;
	private String type;
	
	//Constructor for Bird. 
	public  Bird () 
	{
	}
	
	//Set bird name. 
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//Set Bird type. 
	public void setType (String type) 
	{
		this.type = type;
	}
	
	//Get Bird name. 
	public String getName () 
	{
		return name;
	}
	
	//Get Bird type.
	public String getType () 
	{
		return type;
	}
	
	//Create abstract method interestingFact.
	public abstract String interestingFact(); 
}//Bird

//Create interface Swimmer with method swim. 
interface Swimmer 
{
	public abstract int swim();
}

//Create interface Runner with method run. 
interface Runner 
{
	public abstract int run();
}

//Create interface Flyer with method fly. 
interface Flyer
{
	public abstract int fly();
}

//Create penguin class. 
class Penguin extends Bird implements Runner, Swimmer 
{
	//Declare variables for speed.
	private int runSpeed;
	private int swimSpeed;
	
	//Penguin constructor.
	public Penguin (String name, int runSpeed, int swimSpeed) 
	{
		setName(name);
		setType("Penguin");
		this.runSpeed = runSpeed;
		this.swimSpeed = swimSpeed;
	}
	
	//Override the interstingFact method from class Bird. 
	@Override
	public String interestingFact() 
	{
		return "I can't fly, but I'm the fastest swimmer and deepest diver of any bird and can stay underwater up to 20 minutes.";
	}
	
	//Override interface Runner's method. 
	@Override
	public int run() 
	{
		return runSpeed;
	}
	
	//Override interface Swimmer's method. 
	@Override 
	public int swim()
	{
		return swimSpeed;
	}
	
}//Penguin

//Create class Ostrich. 
class Ostrich extends Bird implements Runner, Swimmer 
{
	//Declare variables for speed.
	private int runSpeed;
	private int swimSpeed;
	
	public Ostrich (String name, int runSpeed, int swimSpeed) 
	{
		setName(name);
		setType("Ostrich");
		this.runSpeed = runSpeed;
		this.swimSpeed = swimSpeed;
	}
	
	//Override the interesting fact method. 
	@Override
	public String interestingFact() 
	{
		return "Who needs flying, when you're the biggest bird on earth! I can grow up to 9 feet tall and weigh as much as 300 pounds! Don't mess with me!";
	}

	//Override run method. 
	public int run() 
	{
		return runSpeed;
	}
	
	//Override swim method. 
	public int swim() 
	{
		return swimSpeed;
	}
} //Ostrich

//Create duck class. 
class Duck extends Bird implements Runner, Swimmer, Flyer 
{
	//Set speed variables. 
	private int runSpeed;
	private int swimSpeed;
	private int flySpeed;
	
	public Duck (String name, int runSpeed, int swimSpeed, int flySpeed) 
	{
		setName(name);
		setType("Duck");
		this.runSpeed = runSpeed;
		this.swimSpeed = swimSpeed;
		this.flySpeed = flySpeed;
	}
	
	//Override the interesting fact method. 
	@Override 
	public String interestingFact() 
	{
		return "A duck's highest documented flight was over Nevada where a plane struck a mallard at 21,000 ft!";
	}
	
	//Override run method. 
	@Override
	public int run() 
	{
		return runSpeed;
	}
	
	//Override swim method. 
	@Override
	public int swim() 
	{
		return swimSpeed;
	}
	
	//Override fly method. 
	@Override 
	public int fly() 
	{
		return flySpeed;
	}
} //Duck

//Create Sooty Tern Class.
class SootyTern extends Bird implements Runner, Flyer 
{
	//Set speed varibales. 
	private int runSpeed;
	private int flySpeed;
	
	//Sooty Tern constructor.
	public SootyTern (String name, int runSpeed, int flySpeed) 
	{	
		setName(name);
		setType("Sooty Tern");
		this.runSpeed = runSpeed;
		this.flySpeed = flySpeed;
	} 
	
	//Override the interestingFact method. 
	@Override
	public String interestingFact() 
	{
		return "Strange as it may sound, I spend most of my life at sea and yet I can't swim! I also take 1-2 second naps, while flying!";
	}
	
	//Override the run method. 
	@Override 
	public int run() 
	{
		return runSpeed;
	}
	
	//Override the fly method. 
	@Override 
	public int fly() 
	{
		return flySpeed;
	}
	
} //Sooty Tern

//Create class Loon. 
class Loon extends Bird implements Swimmer, Flyer 
{
	//Set speed variables.
	private int swimSpeed;
	private int flySpeed;
	
	//Loon constructor.
	public Loon (String name, int swimSpeed, int flySpeed) 
	{
		setName(name);
		setType("Loon");
		this.swimSpeed = swimSpeed;
		this.flySpeed = flySpeed;
	}
	
	//Override interestingFact method. 
	@Override
	public String interestingFact()
	{
		return "My legs are so far back on my body that I cannot walk on land, instead I push myself along the ground on my chest.";
	}
	
	//Override swim. 
	@Override
	public int swim() 
	{
		return swimSpeed;
	}
	
	//Override fly. 
	@Override 
	public int fly() 
	{
		return flySpeed;
	}
} //Loon

//Create Hummingbird class.
class Hummingbird extends Bird implements Flyer 
{
	//Set speed variables. 
	private int flySpeed;
	
	//Hummingbird constructor.
	public Hummingbird (String name, int flySpeed) 
	{
		setName(name);
		setType("Hummingbird");
		this.flySpeed = flySpeed;
	}
	
	//Override interesting fact method. 
	@Override
	public String interestingFact() 
	{
		return "My feet are so small and my flying so adept! I've got the fastest beating heart in the animal kingdom with heart rates exceeding 1,200 beats per minute.";
	}
	
	//Override fly. 
	public int fly() 
	{
		return flySpeed;
	}
} //Hummingbird

