// ********************************************************************
// Habitat_Class.java       Author: Alessandro Alvarado
//
// The Habitat interface defines the structure for calculating the required
// habitat size and determining whether an animal is solitary.
// Any class implementing this interface must provide implementations for
// these abstract methods.
// ********************************************************************

package Homework;

public interface Habitat
{
	//-----------------------------------------------------------------
	//  Abstract method stub for calculating habitat size.
	//  Implementing classes must define how size is computed.
	//-----------------------------------------------------------------
	public abstract double calcSize ();
	
	//-----------------------------------------------------------------
	//  Abstract method stub for setting solitary status.
	//  Implementing classes must define how solitary status is updated.
	//-----------------------------------------------------------------
	public abstract boolean setSolitary (boolean solitary);
}