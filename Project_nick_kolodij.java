// CSC251, project 1, Nick Kolodij

import java.util.*;

public class Project_nick_kolodij
{
   
   public static void main(String[] args)
   {
      // Variables to hold the information the user enters
      String roomName;
      double length;
      double width;
      int shade;
      
      // Scanner variable for input
      Scanner keyboard = new Scanner(System.in);
      
      // Ask the user for information
      System.out.print("Please enter the name of the room: ");
      roomName = keyboard.nextLine();
      
      System.out.print("Please enter the length of the room (in feet): ");
      length = keyboard.nextDouble();
      
      System.out.print("Please enter the width of the room (in feet): ");
      width = keyboard.nextDouble();
      
      // Call the shade method to print the menu
      shade();
      shade = keyboard.nextInt();
      
      // Validate the option the user entered
      while (shade < 1 || shade > 3)
      {
         System.out.print("\nInvalid choice. Please select from the options above: ");
         shade = keyboard.nextInt();
      }
      
      // Create a new room object
      Room room = new Room(roomName, length, width, shade);
      
      System.out.println("\nRoom Name: " + room.getName());
      System.out.println("Room Area (in square feet): " + room.area());
      System.out.println("Amount of Shade: " + room.shadeString());
      System.out.printf("BTUs Per Hour needed: %,.0f" ,room.btus());
      
   }
   
   public static void shade()
   {  
      
      System.out.println("What is the amount of shade that this room receives?");
      System.out.println("\n\t1. Little Shade");
      System.out.println("\t2. Moderate Shade");
      System.out.println("\t3. Abundant Shade");
      System.out.print("\nPlease select from the options above: ");
      
   }
   
}















