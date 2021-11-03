// CSC251, project 3, Nick Kolodij

public class Room
{
   // Constants and Variables
   private String name;
   private double length;
   private double width;
   private int shade;
   private AirConditioner ac;

   // No arg constructor
   public Room()
   {
      this.name = "room";
      this.length = 0.0;
      this.width = 0.0;
      this.shade = 2;
      this.ac = new AirConditioner();
   }
   
   /*
       Constructor that takes args from demo class
   **/
   public Room(String n, double l, double w, int s, AirConditioner ac)
   {
      this.name = n;
      this.length = l;
      this.width = w;
      this.shade = s;
      this.ac = ac;

   }
   
   /*
      Mutator for the Name variable
      @param n The variable for the name of the room
   **/
   public void setName(String n)
   {
      this.name = n;
   }

   /*
      Mutator for the length variable
      @param l The variable for the length of the room
   **/
   public void setLength(double l)
   {
      this.length = l;
   }

   /*
      Mutator for the width variable
      @param w The variable for the width of the room
   **/
   public void setWidth(double w)
   {
      this.width = w;
   }
   
   /*
      Mutator for the shade variable
      @param s The variable for the shade of the room
   **/
   public void setShade(int s)
   {
      this.shade = s;
   }
   
   /*
      Accessor for the name variable
      @return Return the name of the room
   **/
   public String getName()
   {
      return this.name;
   }
   
   /*
      Accessor for the length variable
      @return Return the length of the room
   **/
   public double getLength()
   {
      return this.length;
   }
   
   /*
      Accessor for the width variable
      @return Return the width of the room
   **/
   public double getwidth()
   {
      return this.width;
   }
   
   /*
      Accessor for the shade variable
      @return Return the shade of the room
   **/
   public int getShade()
   {
      return this.shade;
   }
   
   /*
      Method to convert the number used for the shade the amount that represents as a string
      @return shadeString The word used for the amount of shade the room receives
   **/
   public String shadeString()
   {
      int s = this.getShade();
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
      return this.length * this.width;
   }
   
   /*
      Method to calculate how many BTUs per hour a room will need
      @return The BTUs after calculating all the variables.
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
      double a = this.area();
      
      // local variable that gets the value of the shade to determine if the room needs more or less cooling
      int s = this.getShade();
      
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
   
   // method to check if the room's air conditioner provides enough cooling for the room
   public boolean hasAdequateCooling()
   {
      
      if(btus() < this.ac.getBTUs())
      {
         return false;
      }
      else
      {
         return true;
      }
      
   }
   
   // toString method to display room information along with the airconditioner information
   public String toString()
   {
      String str = "Room Name: " + this.getName() +
                   "\nRoom Area (in square feet): " + this.area() +
                   "\nAmount of Shade: " + this.shadeString() +
                   String.format("\nBTUs Per Hour needed: %,.0f" , this.btus()) +
                   this.ac + "\n";
      
      return str;
   }
}