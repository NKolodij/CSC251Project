// CSC251, Project 3, Nick Kolodij

// class for the air conditioner objects
public class AirConditioner
{
   
   // attributes the object has
   private String manufacturer;
   private String type;
   private int btus;
   
   // No-arg constructor
   public AirConditioner()
   {     
      this.manufacturer = "";
      this.type = "";
      this.btus = 0;      
   }
   
   // constructor that accepts args
   public AirConditioner(String manu, String type, int btus)
   {  
      this.manufacturer = manu;
      this.type = type;
      this.btus = btus;  
   }
   
   // Setters for fields
   public void setManu(String manu)
   {     
      this.manufacturer = manu; 
   }
   
   public void setType(String type)
   {   
      this.type = type;   
   }
   
   public void setBTUs(int btus)
   { 
      this.btus = btus;
   }
   
   // Getters for fields
   public String getManu()
   {  
      return this.manufacturer;
   }
   
   public String getType()
   {  
      return this.type;
   }
   
   public int getBTUs()
   {   
      return this.btus;
   }
   
   // toString method to display the information about this air conditioner unit
   public String toString()
   {
      String str = "Air Conditioner Manufacturer: " + this.manufacturer +
                   "\nAir Conditioner Type: " + this.type +
                   "\nAir Conditioner Cooling Capacity (BTUs Per Hour): " + this.btus;
      return str;
      
   }
   
}