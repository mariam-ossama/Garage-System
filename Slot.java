package parkingGarageApp;

public class Slot
{
   private int id;
   private double depth;
   private double width;
   private String status ="empty";
   private int vehicle_id = 0 ; 
   Slot(){ }
   public void setSlot (int Id, double d, double w, String s)
   {
	   id =Id;
	   depth = d;
	   width= w;
	   status = s;
   }
   
   
   public void setId (int id)
   {
	   this.id=id;
   }
   
   public void setDepth(double depth)
   {
	   this.depth =depth ;
   }
   
   public void setWidth(double width)
   {
	   this.width = width;
   }
   
   public void setStatus (String s)
   {
	   status= s;
   }
   
   public void setVehicle_id(int vid)
   {
	   this.vehicle_id = vid;
   }
   
   
   public int getId ()
   {
	   return id;
   }
 
   public double getDepth()
   {
	   return depth;
   }
   
   public double getWidth ()
   {
	   return width;
   }
   
   public String getStatus ()
   {
	   return status;
   }
   
   public int getVehicle_id()
   {
	   return vehicle_id ;
   }
}

