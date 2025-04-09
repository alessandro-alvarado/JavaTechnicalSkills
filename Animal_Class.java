// ********************************************************************
// Animal_Class.java       Author: Alessandro Alvarado
//
// The Animal class serves as an abstract base class for all animal types in the zoo.
// It implements the Habitat interface, ensuring that all derived classes define
// methods for calculating habitat size and determining solitary behavior.
// ********************************************************************

package Homework;

public abstract class Animal implements Habitat
{
   protected String animalName;      // The name assigned to the animal
   protected String species;         // The species classification of the animal
   protected double size;            // Default habitat size (initialized to 100 square feet)
   protected boolean solitary;       // Indicates whether the animal prefers to live alone
   public static int nrAnimals = 0;  // Static counter to track the total number of Animal objects created

   //-----------------------------------------------------------------
   //  Constructor: Initializes an animal with a name and species.
   //  Default values: size is set to 100, and the animal is social (not solitary).
   //-----------------------------------------------------------------
  public Animal (String animalName, String species)
  {
	  this.animalName = animalName;
	  this.species = species;
	  this.size = 100;
	  this.solitary = false;
	  nrAnimals++;  // Increments the static counter whenever a new animal is created
  }

   //-----------------------------------------------------------------------
   //  Abstract method to calculate the required habitat size for the animal.
   //  This method must be implemented by each subclass, as different animals
   //  have unique habitat size requirements.
   //-----------------------------------------------------------------------
   @Override
   public abstract double calcSize ();
   
   //-----------------------------------------------------------------------
   //  Abstract method to set whether the animal is solitary.
   //  This method must be implemented by subclasses, as social behavior varies.
   //-----------------------------------------------------------------------
   @Override
   public abstract boolean setSolitary (boolean solitary);
   
   //-----------------------------------------------------------------
   //  Returns a formatted string with the basic information about the animal.
   //  This method provides a human-readable description of the animal.
   //-----------------------------------------------------------------
   @Override
    public String toString() 
	{
        String result = "Animal name " + animalName + ", ";
        result += "is one of the species " + species + ". ";
        
        return result;
    }
   
   //-----------------------------------------------------------------
   //  Static method to retrieve the total number of Animal objects created.
   //  This allows tracking of how many animals have been instantiated.
   //-----------------------------------------------------------------
	public static int nrAnimals ()
	{
		return nrAnimals;
	}   
	
}