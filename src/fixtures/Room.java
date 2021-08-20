package fixtures;

import java.util.ArrayList;

public class Room extends Fixture

{
	private String[] interactions = new String[3];
	
	private ArrayList<Room> exits = new ArrayList<Room>();
	
	public Room() //No argument constructor in case needed.
	{
		
	}
	
	public Room(String name, String shortDescription, String longDescription)
	{
		super(name, shortDescription, longDescription);
	}
	
	public void addExits(Room exit)
	{
		exits.add(exit);
	}
	
	public void showExits()
	{
		for(int index = 0; index < exits.size(); index++)
		{
			System.out.println(exits.get(index).shortDescription);
		}
	}
	
	public String getInteractions(int index)
	{
		return interactions[index];
	}
	
	public void setInteractions(String objectName, String observation, String pain)
	{
		interactions[0] = objectName;
		interactions[1] = observation;
		interactions[2] = pain;
	}

}
