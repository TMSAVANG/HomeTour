package game;

import fixtures.Room;
import java.util.ArrayList;

public class RoomManager 
{
	private static Room startingRoom; //Starting Room
	private static ArrayList<Room> rooms = new ArrayList<Room>(); //I heard Array Lists are way easier to work with.
	
	protected void initializeRooms()
	{
		Room cell = new Room("Holding Cell", "You can see a small holding <cell>. \n",
				"You find yourself in a cold room built of concrete slabs. The bars of a jail cell seem to blink from the flickering of the lone flourescent \n"
				+ "light bulb hanging from the ceiling just outside of your cell. You really shouldn't have gone out for drinks last night. Behind you, the cell is solid concrete. \n"
				+ "You've been asleep with your back against it. To your left you can see the padded <bench> that you completely missed when the cops threw you in. You try to remember \n"
				+ "anything from the past day but your head feels like it ran into a wall. It could still be worse. At least the cell is big enoough to fit a few people. \n\n");
		rooms.add(cell);
		
		Room jail = new Room("Jail", "You can see a small <jail> office with a desk. \n", 
				"For some reason the bars of the holding cell aren't even locked. You can see a doorway with a head-sized bulletproof glass window into the next room. There are noticeable \n"
				+ "small gray patches in the door's black paint where the natural color of the metal can be seen. In the middle of the room is an old fashioned wood <desk>. No papers \n"
				+ "anywhere. No cops anywhere. \n\n");
		rooms.add(jail);
		
		Room office = new Room("Office", "You can see the main <office> through the small glass window. \n",
				"There aren't any officers here either. All of the desks are completely clean. Too clean. As if they're completely new. No personal belongings. No computers for filing reports. \n"
				+ "Not even any paper forms. You can see what must be a gun locker. A simple metal cabinet, secured with a heavy padlock now uselessly warped from whatever someone did to pry it off. \n"
				+ "Stray shotgun <shells> litter the floor in front. Another metal door appears to lead into a small lobby. One more seems to lead to a parked police cruiser outside. \n\n");
		rooms.add(office);
		
		Room lobby = new Room("Lobby", "You can see a very small <lobby> area. \n", "The space leading out into the front of the station is only barely larger than the cell you were in. \n"
				+ "A corkboard for bulletins and wanted posters is the only thing in front of the shattered <glass> windows and door leading out into the parking lot. No cars. No one else. \n\n");
		rooms.add(lobby);
		
		Room parking = new Room("Parking", "You can see a <parking> lot outside. \n","Once outside the cold air hits. At least it's some relief from this awful hangover. It's snowing outside. \n"
				+ "You've just realized that you're completely snowed in. A vast white blanket of frosty death taller than your own head will stop you from getting anywhere even \n"
				+ " if you can steal that police car.");
		rooms.add(parking);
		
		
		//Adding exits to exits ArrayList separately because all the rooms needs to be initialized first.
		
		cell.addExits(jail);
		
		jail.addExits(cell);
		jail.addExits(office);
		
		office.addExits(jail);
		office.addExits(parking);
		office.addExits(lobby);
		
		lobby.addExits(office);
		lobby.addExits(parking);
		
		parking.addExits(office);
		parking.addExits(lobby);
		
		//Setting all of the interactions for the rooms.
		
		cell.setInteractions("bench", "How did you miss the bench? You had way too much to drink.", "You lie down on the padded bench. You groan in pain at your continuing hangover and \n"
				+ "get up again after a few minutes.");
		jail.setInteractions("desk", "The desk is full of drawers stuffed full of old police reports.", "You lie down on the desk. Not only do you have a hangover, but now you've realized \n"
				+ "that without padding your lower back has a sharp pain. You swear you'll never drink again, but you know you're lying to yourself. After a few minutes you get up.");
		office.setInteractions("shells", "Whoever took the guns must have left in a struggle. But where are the holes from the shots fired?", "You lie down on top of the scattered shells. \n"
				+ "Why would you do that? I don't think you can blame this one on the hangover. Your hangover is actually slightly better now that you're focusing on your growing back pain. \n"
				+ " After only a few seconds you push yourself off of the floor.");
		lobby.setInteractions("glass", "There must have been some real violence here before to cause all of this.", "You lie down on the piles of broken glass. What happened to your life? After \n"
				+ "almost a whole hour you finally drag your own pathetic body off of the glass. Some of the shards are still sticking to your pants.");
		parking.setInteractions(null, null, null);
		
	}
	
	
	public Room getRoom(int index)
	{
		return rooms.get(index);
	}
	
}
