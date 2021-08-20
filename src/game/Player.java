package game;

import fixtures.Room;

public class Player 
{
	static Room currentRoom;
	boolean inGame = true;
	
	public void setCurrentRoom(Room newRoom)
	{
		currentRoom = newRoom;
	}
	
	public Room getCurrentRoom()
	{
		return currentRoom;
	}
	
	public void thoughts()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n'My god,' you think, 'I'm still so ******* hungover. All I can do is <stumble> around, <examine> important looking objects, or <lie> down and groan in pain'\n"
				+ "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	
}
