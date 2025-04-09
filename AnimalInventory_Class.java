// ********************************************************************
//  AnimalInventory_Class.java       Author: Alessandro Alvarado
//
// The AnimalInventory class maintains a list of various animals and provides
// functionality to determine their habitat sizes and social status.
// ********************************************************************

package Homework;

import java.util.ArrayList;

public class AnimalInventory
{
   private ArrayList<Animal> zooList;  // List to store different types of animals

   //-----------------------------------------------------------------
   //  Constructor: Initializes the list of animals with predefined values.
   //-----------------------------------------------------------------
   public AnimalInventory ()
   {
	   zooList = new ArrayList<Animal>();
	   
	   // Adding different animal instances to the zoo list
	   zooList.add (new Bird ("Cardinal-1", "Northern Cardinal", 100, true, true));
	   zooList.add (new Herbivore ("Elephant-1", "African Bush Elephant", 100, true, 650, "folivore"));
	   zooList.add (new Mammal ("Bear-1", "Black Bear", 100, false, 220));
	   zooList.add (new Carnivore ("Lion-1", "West African Lion", 100, true, 115.5, 650, true));
	   zooList.add (new Herbivore ("Lemur-1", "Ruffed Lemur", 100, true, 102, "frugivore"));
	   zooList.add (new Mammal ("Bear-2", "Kodiak Bear", 100, true, 230));
	   zooList.add (new Bird ("Penguin-1", "Galapagos Penguin", 100, true, false));
	   
	   // Setting the solitary status for each animal
	   ((Bird) zooList.get (0)).setSolitary (false);
	   ((Herbivore) zooList.get (1)).setSolitary (false);
	   ((Mammal) zooList.get (2)).setSolitary (true);
	   ((Carnivore) zooList.get (3)).setSolitary (false);
	   ((Herbivore) zooList.get (4)).setSolitary (false);
	   ((Mammal) zooList.get (5)).setSolitary (true);
	   ((Bird) zooList.get (6)).setSolitary (false);

   }

   //-----------------------------------------------------------------
   //  Computes and displays the size requirements for each animal in the list.
   //-----------------------------------------------------------------
   public void figureSizes() 
	{
        for (int count = 0; count < zooList.size(); count++) 
		{
            System.out.println(zooList.get(count));
            System.out.println("Current habitat size: " + zooList.get(count).calcSize() + " square feet.");
            System.out.println("-----------------------------------");
        }
    }
}