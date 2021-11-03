// CSC251, project 3, Nick Kolodij

import java.util.*;
import java.io.*;

public class Project_nick_kolodij
{
   
   public static void main(String[] args) throws IOException
   {
      // Variables to hold the information
      String roomName;
      double length;
      double width;
      int shade = 0;
      String shadeString;
      
      String acName;
      String acType;
      int acBTUs;
      
      // An array list to hold all the room objects.
      ArrayList<Room> roomList = new ArrayList<Room>();
      
      // Open the Rooms.txt file
      File file = new File("Rooms2.txt");
      
      // Make sure the file exists.
      if(!file.exists())
      {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(file);
            
      
      // while loop to make sure there is more text in the file
      while(inputFile.hasNext())
      {
      
        roomName = inputFile.nextLine();
        length = inputFile.nextDouble();
        width = inputFile.nextDouble();
        inputFile.nextLine();
        shadeString = inputFile.nextLine();
        acName = inputFile.nextLine();
        acType = inputFile.nextLine();
        acBTUs = inputFile.nextInt();


        
        // Change how the shade information is stored to work with the other parts of the code.
        if(shadeString.equals("Little"))
        {
            shade = 1;
        }
        else if(shadeString.equals("Moderate"))
        {
            shade = 2;
        }
        else if(shadeString.equals("Abundant"))
        {
            shade = 3;
        }

        
        // Create a new room object and add it to the array list of rooms.
        roomList.add(new Room(roomName, length, width, shade, new AirConditioner(acName, acType, acBTUs)));
        
        if(inputFile.hasNext())
        {
             inputFile.nextLine();
             inputFile.nextLine();
        }


      }
      // Close the file.
      inputFile.close();
      
      // Print the output by calling the methods in the object
      for (int i = 0; i < roomList.size(); i++)
      {
         Room room = roomList.get(i);
         
         System.out.println("\nRoom Name: " + room.getName());
         System.out.println("Room Area (in square feet): " + room.area());
         System.out.println("Amount of Shade: " + room.shadeString());
         System.out.printf("BTUs Per Hour needed: %,.0f" ,room.btus());
      
      }
   } 
}















