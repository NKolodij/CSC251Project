// CSC251, project 1, Nick Kolodij

public class Room
{
   // Constants and Variables
   private String name;
   private double length;
   private double width;
   private int shade;
   

   // No arg constructor
   public Room()
   {
      name = "room";
      length = 0.0;
      width = 0.0;
      shade = 2;
   }
   
   /*
       Constructor that takes args from demo class
   **/
   public Room(String n, double l, double w, int s)
   {
      name = n;
      length = l;
      width = w;
      shade = s;
   }
   
   /*
      Mutator for the Name variable
      @param n The variable for the name of the room
   **/
   public void setName(String n)
   {
      name = n;
   }

   /*
      Mutator for the length variable
      @param l The variable for the length of the room
   **/
   public void setLength(double l)
   {
      length = l;
   }

   /*
      Mutator for the width variable
      @param w The variable for the width of the room
   **/
   public void setWidth(double w)
   {
      width = w;
   }
   
   /*
      Mutator for the shade variable
      @param s The variable for the shade of the room
   **/
   public void setShade(int s)
   {
      shade = s;
   }
   
   /*
      Accessor for the name variable
      @return Return the name of the room
   **/
   public String getName()
   {
      return name;
   }
   
   /*
      Accessor for the length variable
      @return Return the length of the room
   **/
   public double getLength()
   {
      return length;
   }
   
   /*
      Accessor for the width variable
      @return Return the width of the room
   **/
   public double getwidth()
   {
      return width;
   }
   
   /*
      Accessor for the shade variable
      @return Return the shade of the room
   **/
   public int getShade()
   {
      return shade;
   }
   
   /*
      Method to convert the number used for the shade the amount that represents as a string
      @return shadeString The word used for the amount of shade the room receives
   **/
   public String shadeString()
   {
      int s = getShade();
      String shadeString;
      
      if (s == 1)
      {
         shadeString = "Little";
      }
      else if (s == 2)
      {
         shadeString = "Moderate";
      }
      else
      {
         shadeString = "Abundant";
      }
      
      return shadeString;
   }
   
   /*
      method to calculate the area of a room
      @return The area found by multiplying the length and width
   **/
   public double area()
   {
      return length * width;
   }
   
   /*
      Method to calculate how many BTUs per hour a room will need
      
   **/
   public double btus()
   {
      // Constants for the air conditioner capacities(in BTUs per hour)
      final int SMALL = 5500;
      final int MEDIUM = 10000;
      final int LARGE = 17500;
      final int EXTRALARGE = 24000;
      
      // Constants for the room sizes
      final int ROOMSMALL = 250;
      final int ROOMMEDIUM = 500;
      final int ROOMLARGE = 999;
      
      // Constants for the shade 
      final double LIGHTLY = 1.15;
      final double ABUNDANT = .9;
      
      // variable to hold the return value
      double btu;
      
      // local variable that calls the area method to get its value
      double a = area();
      
      // local variable that gets the value of the shade to determine if the room needs more or less cooling
      int s = getShade();
      
      // Find out what size AC you need based on the room area
      if(a < ROOMSMALL)
      {
         btu = SMALL;
      }
      else if(a > ROOMSMALL && a <= ROOMMEDIUM)
      {
         btu = MEDIUM;
      }
      else if(a > ROOMMEDIUM && a < ROOMLARGE)
      {
         btu = LARGE;
      }
      else
      {
         btu = EXTRALARGE;
      }
      
      // If statement that checks if the amount of BTUs needs to be adjusted based on how much shade the room gets
      if(s == 1)
      {
         btu = btu * LIGHTLY;
      }
      else if(s == 3)
      {
         btu = btu * ABUNDANT;
      }
      
      // return the amount of BTUs a room will need based on area and shade
      return btu;
   }
   
}