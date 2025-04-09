// ********************************************************************
// Herbivore_Class.java       Author: Alessandro Alvarado
//
// The Herbivore class represents a mammal that primarily consumes plants.
// It extends the Mammal class and introduces a specific attribute for herbivore type.
// ********************************************************************

package Homework;

public class Herbivore extends Mammal
{
   protected String type;  // The type of herbivore (e.g., folivore, frugivore)
  
   //-----------------------------------------------------------------
   //  Constructor: Initializes a herbivore with specific attributes.
   //  Calls the parent constructor for general mammal properties.
   //-----------------------------------------------------------------
   public Herbivore (String animalName, String species, double size, boolean solitary, double getstationTime, String type)
   {
	   super (animalName, species, size, solitary, getstationTime);
	   this.type = type;
   }
      
   //-----------------------------------------------------------------
   //  Computes and returns the required habitat size for this herbivore.
   //  Solitary herbivores require more space.
   //-----------------------------------------------------------------
   @Override
    public double calcSize() 
	{
        if (solitary) 
		{
            return size * 5.5; // If solitary, size is multiplied by 6.5
        }
		
		else 
		{
            return size * 4; // If social, size is multiplied by 3.75
        }
    }
      
   //-----------------------------------------------------------------
   //  Sets whether the herbivore is solitary and updates its status.
   //-----------------------------------------------------------------
   @Override
    public boolean setSolitary (boolean solitary) 
	{
        this.solitary = solitary;
		return this.solitary;
    }
   
   //-----------------------------------------------------------------
   //  Returns information about this herbivore as a string.
   //  Provides details on the specific type of herbivore.
   //-----------------------------------------------------------------
   @Override
    public String toString() 
	{
        String herbivoreInfo = super.toString();
		
        return herbivoreInfo + "This herbivore is a type of " + type + ". ";
    }
      
}