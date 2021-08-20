package game;

import java.util.Scanner;

import fixtures.Room;
import game.Player;
import game.RoomManager;

public class Main 
{
	
private static void printRoom()
{
	System.out.println(Player.currentRoom.name + "\n\n\n");
	System.out.println(Player.currentRoom.longDescription);
	System.out.println("----------------Accessible rooms-----------------");
	Player.currentRoom.showExits();
}

private static String[] collectInput() 
{
	Scanner controller = new Scanner(System.in);
	String controllerInput = controller.nextLine();
	String[] actionAndTarget = controllerInput.split(" ");
	/*System.out.println(actionAndTarget[0]);
	System.out.println(actionAndTarget[1]);*/
	return actionAndTarget;
}

private static void parse(String[] command, Player player, RoomManager roomMan)
{
	int index;
	switch(command[0])
	{
		case "stumble":
		{
			switch(command[1])
			{
				default:
				case "cell": index = 0;
					break;
					
				case "jail": index = 1;
					break;
					
				case "office": index = 2;
					break;
					
				case "lobby": index = 3;
					break;
					
				case "parking": index = 4;
					break;
			}
			
			player.setCurrentRoom(roomMan.getRoom(index));
		}
			break;
			
		case "examine":
		{
			switch(command[1])
			{
				default:
				case "bench":
				case "desk":
				case "shells":
				case "glass": index = 1;
					break;
			}
			System.out.println(player.getCurrentRoom().getInteractions(index));
		}
			break;
		
		case "lie":
		{
			switch(command[1])
			{
				default:
				case "bench":
				case "desk":
				case "shells":
				case "glass": index = 2;
					break;
			}
			System.out.println(player.getCurrentRoom().getInteractions(index));
		}
			break;
		
			
		case "quit":
		{
			player.inGame = false;
		}
		
			break;
	}
}

	public static void main(String[] args) 
	
	{
		
		//Initializing conditions before the loop starts.
		
		Player boozehound = new Player(); //Initializing player. You're a drunk. 
		RoomManager RM = new RoomManager(); //RM is kind of like a GM in a tabletop game isn't it?
		
		RM.initializeRooms();
		boozehound.setCurrentRoom(RM.getRoom(0)); //Getting a room from the ArrayList in RM class and setting the current room in the boozehound player object.
		
		while (boozehound.inGame)
		{
			boozehound.thoughts();
			
			printRoom();
			
			parse(collectInput(), boozehound, RM);
		}
		
	}
}
