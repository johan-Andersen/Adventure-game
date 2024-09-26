import java.util.Random;
import java.util.Scanner;

public class Adventure {



    public void start(){

        Room currentRoom;
        Room room1 = new Room("room1","Its freezing in here right, gloomy walls, dark and wet. Be careful not to slip. There are 2 doors in the room");
        Room room2 = new Room("room2", "The room is dry as bone, drink some water perhaps. We need you soldier! btw there are 2 doors");
        Room room3 = new Room("room3", "its awfully quite in here..with 2 doors");
        Room room4 = new Room("room4", "There are 2 doors and is that children… they're white as snow..");
        Room room5 = new Room("room5", "You have entered Draculas den. Filled with riches beyond comprehension. Walls covered in gold and with paintings dating back millenniums. But there's only one one way, in and out");
        Room room6 = new Room("room6","A weaponry! Spears, swords, arrows, knives and sheelds! Everywhere. And  2 doors");
        Room room7 = new Room("room7", "There are 2 doors in the room. But Can you smell that? You've stepped into the kitchen. Fresh vegetables, meets and bread.");
        Room room8 = new Room("room8","There are 3 doors... Can you feel his presence?  ");
        Room room9 = new Room("room9", "There are 2 doors and a pile of  fallen comrades");

        room1.setSouthRoom(room4);
        room1.setEastRoom(room2);

        room2.setWestRoom(room1);
        room2.setEastRoom(room3);

        room3.setWestRoom(room2);
        room3.setSouthRoom(room6);

        room4.setNorthRoom(room1);
        room4.setSouthRoom(room7);

        room5.setSouthRoom(room8);

        room6.setSouthRoom(room9);
        room6.setNorthRoom(room3);

        room7.setNorthRoom(room4);
        room7.setEastRoom(room8);

        room8.setWestRoom(room7);
        room8.setNorthRoom(room5);

        room9.setNorthRoom(room6);
        room9.setWestRoom(room8);





        System.out.println("Welcome to the adventure game. Here are the controles!:");
        System.out.println("Type 'go' followed by 'north', 'south', 'east' or 'west', followed by ENTER, to move through the map");
        System.out.println("Type 'look', follwed by ENTER, to look around the room you're currently in");
        System.out.println("Type 'exit' to exit the game");
        System.out.println("\n\n\nLet the game begin!");

        Scanner input = new Scanner(System.in);
        String useraction = "";

        currentRoom = room1;

        while(!useraction.equalsIgnoreCase("exit")) {
            useraction = input.nextLine();


            switch(useraction) {

                case "go north" -> {
                    if(currentRoom.getNorthRoom() == null) {
                        System.out.println("There are no doors north of here!");

                    } else {
                        System.out.println("going north");
                        currentRoom = currentRoom.getNorthRoom();
                        System.out.println(currentRoom);
                    }
                }
                case "go south" -> {
                    if(currentRoom.getSouthRoom() == null) {
                        System.out.println("There are no doors south of here");

                    } else {
                        System.out.println("going south");
                        currentRoom = currentRoom.getSouthRoom();
                        System.out.println(currentRoom);
                    }

                }
                case "go east" -> {
                    if(currentRoom.getEastRoom() == null) {
                        System.out.println("there are no doors east of here");
                    } else {
                        System.out.println("going east");
                        currentRoom = currentRoom.getEastRoom();
                        System.out.println(currentRoom);
                    }

                }
                case "go west" -> {
                    if(currentRoom.getWestRoom() == null) {
                        System.out.println("there are no doors west of here");
                    } else {
                        System.out.println("going west");
                        currentRoom = currentRoom.getWestRoom();
                        System.out.println(currentRoom);
                    }


                }
                case "look" -> {
                    System.out.println("looking around");
                    System.out.println(currentRoom);

                }
                case "help" -> {
                    System.out.println("I already told you, this is how you controle the game:");
                    System.out.println("Type 'go' followed by 'north', 'south', 'east' or 'west', followed by ENTER, to move through the map");
                    System.out.println("Type 'look', follwed by ENTER, to look around the room you're currently in");
                    System.out.println("Type 'exit' to exit the game");
                    System.out.println("\n\n\nLet the game begin!... again");
                }
            }







        }


    }
}
