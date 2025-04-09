// ********************************************************************
// Bird_Class.java       Author: Alessandro Alvarado
//
// The Bird class represents an avian species with the ability to fly or remain flightless.
// It extends the Animal class and introduces attributes specific to birds.
// ********************************************************************

package Homework;

public class Bird extends Animal
{
   protected boolean canFly;  // Indicates if the bird can fly
	
   //-----------------------------------------------------------------
   //  Constructor: Initializes a bird with specific attributes.
   //  Calls the parent constructor for general animal properties.
   //-----------------------------------------------------------------
   public Bird (String animalName, String species, double size, boolean solitary, boolean canFly)
   {
	   super (animalName, species);
	   this.canFly = canFly;
   }
   
   //-----------------------------------------------------------------
   //  Computes and returns the required habitat size for this bird.
   //  Solitary birds require more space.
   //-----------------------------------------------------------------
   @Override
    public double calcSize() 
	{
        if (solitary) 
		{
            return size * 3.5; // If solitary, size is multiplied by 3.5
        }
		
		else 
		{
            return size; // If social, size remains the default (100)
        }
    }
   
   //-----------------------------------------------------------------
   //  Sets whether the bird is solitary and updates its status.
   //-----------------------------------------------------------------
   @Override
    public boolean setSolitary (boolean solitary) 
	{
        this.solitary = solitary;
		return this.solitary;
    }
   
   //-----------------------------------------------------------------
   //  Returns information about this bird as a string.
   //  Provides details on social behavior and flying capability.
   //-----------------------------------------------------------------
   @Override
    public String toString() 
	{
        String birdInfo = super.toString();
        String solitaryStatus = (solitary) ? "It is solitary. " : "It is a social animal. ";
        String canFlyStatus = (canFly) ? "This bird can fly! " : "This bird does not fly. ";
		
        return birdInfo + solitaryStatus + canFlyStatus;
    }
   
}