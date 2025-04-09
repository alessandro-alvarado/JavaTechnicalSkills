// ********************************************************************
// Carnivore_Class.java       Author: Alessandro Alvarado
//
// The Carnivore class represents a mammal that primarily consumes meat.
// It extends the Mammal class, adding attributes specific to carnivorous animals,
// such as jaw strength and whether they live in family units.
// ********************************************************************

package Homework;

public class Carnivore extends Mammal
{
   protected double jawStrength;  // Strength of the carnivore's jaw in psi
   protected boolean family;      // Indicates if the carnivore lives in a family unit
  
   //-----------------------------------------------------------------
   //  Constructor: Initializes a carnivore with specific attributes.
   //  Calls the parent constructor for general mammal properties.
   //-----------------------------------------------------------------
   public Carnivore (String animalName, String species, double size, boolean solitary, double getstationTime, double jawStrength, boolean family)
   {
	   super (animalName, species, size, solitary, getstationTime);
	   this.jawStrength = jawStrength;
	   this.family = family;
   }
      
   //-----------------------------------------------------------------
   //  Computes and returns the required habitat size for this carnivore.
   //  Solitary carnivores require more space.
   //-----------------------------------------------------------------
   @Override
    public double calcSize() 
	{
        if (solitary) 
		{
            return size * 8.25; // If solitary, size is multiplied by 6.5
        }
		
		else 
		{
            return size * 6.5; // If social, size is multiplied by 3.75
        }
    }
      
   //-----------------------------------------------------------------
   //  Sets whether the carnivore is solitary and updates its status.
   //-----------------------------------------------------------------
   @Override
    public boolean setSolitary (boolean solitary) 
	{
        this.solitary = solitary;
		return this.solitary;
    }
   
   //-----------------------------------------------------------------
   //  Returns information about this carnivore as a string.
   //  Provides details on jaw strength and whether it lives in a family unit.
   //-----------------------------------------------------------------
   @Override
    public String toString() 
	{
        String carnivoreInfo = super.toString();
        String familyUnit = (family) ? "It lives in a family unit." : "It does not live in a family unit.";
		
        return carnivoreInfo + "The jaw strength of this carnivore is " + jawStrength + " psi. " + familyUnit;
    }
      
}