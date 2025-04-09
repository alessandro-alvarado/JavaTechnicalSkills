// ******************************************************************** 
// MyZoo_Class.java       Author: Alessandro Alvarado
//
// Demonstrates polymorphism via inheritance. This program models 
// a zoo with different animals, showcasing how inheritance allows 
// animals to share common behaviors while also having their own 
// specific attributes. The main function creates an inventory of 
// animals and calculates their habitat sizes using the 'AnimalInventory' 
// class and polymorphism to handle different animal types efficiently.
// ********************************************************************


package Homework;

public class MyZoo
{
	//-----------------------------------------------------------------
    //  Main method: Creates an inventory of animals and calculates their habitat sizes.
    //-----------------------------------------------------------------
   public static void main(String[] args) 
	{
		// Instantiate an AnimalInventory object
        AnimalInventory zoo = new AnimalInventory();
		
		// Call method to determine and display habitat sizes
        zoo.figureSizes();
    }
}