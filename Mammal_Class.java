// ********************************************************************
// Mammal_Class.java       Author: Alessandro Alvarado
//
// The Mammal class represents a type of animal that has a gestation period.
// It extends the Animal class, inheriting its properties and behaviors,
// while adding mammal-specific attributes.
// ********************************************************************

package Homework;

public class Mammal extends Animal
{
	protected double gestationTime;  // Duration of the mammal's gestation period in days
	
   //-----------------------------------------------------------------
   //  Constructor: Initializes a mammal with specific attributes.
   //  Calls the parent constructor for name and species.
   //-----------------------------------------------------------------
   public Mammal (String animalName, String species, double size, boolean solitary, double gestationTime)
   {
	   super (animalName, species);
	   this.gestationTime = gestationTime;
   }
   
   //-----------------------------------------------------------------
   //  Calculates and returns the required habitat size for this mammal.
   //  Solitary mammals require more space.
   //-----------------------------------------------------------------
   @Override
    public double calcSize() 
	{
        if (solitary) 
		{
            return size * 6.5; // If solitary, size is multiplied by 6.5
        }
		
		else 
		{
            return size * 3.75; // If social, size is multiplied by 3.75
        }
    }
   
   //-----------------------------------------------------------------
   //  Sets whether the mammal is solitary and updates its status.
   //-----------------------------------------------------------------
   @Override
   public boolean setSolitary (boolean solitary)
	{
        this.solitary = solitary;
		return this.solitary;
    }
   
   //-----------------------------------------------------------------
   //  Returns a string including the basic mammal information.
   //  Provides details about its social behavior and gestation period.
   //-----------------------------------------------------------------
   @Override
    public String toString() 
	{
        String mammalInfo = super.toString();
        String solitaryStatus = (solitary) ? "It is solitary. " : "It is a social animal. ";
		
        return solitaryStatus +  mammalInfo + "This mammal's gestation time is " + gestationTime + " days. ";
    }
   
}