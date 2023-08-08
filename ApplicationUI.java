package parkingGarageApp;
import java.util.Scanner;

public class ApplicationUI
{

	static ParkingArea Pa;
	static Vehicles_operations Vo;
	
	
	public static void main(String[] args) 
	{
		 Pa =ParkingArea.getInstance();
		 Vo = new Vehicles_operations();
		 int choice = 0 ;
		 int c = 0;
		 int sid;
		 double d;
		 boolean message;
		 String mo;
		 Scanner keyboard = new Scanner (System.in);
		 while(choice != 8)
		 {
			 System.out.print("\nEnter the number of your choice:" );
			 System.out.print("\n 1-Choose configuration");
			 System.out.print("\n 2-Add slots");
			 System.out.print("\n 3-Add vehicle and park-in");
			 System.out.print("\n 4-Park-out");
			 System.out.print("\n 5-Get total income");
			 System.out.print("\n 6-Get total number of vehicles"); 
			 System.out.print("\n 7-Display available parking slots");
			 System.out.print("\n 8-Exit");
			 choice = keyboard.nextInt();
			 
			 switch(choice)
			 {
			   case 1:
			   {
				   System.out.print("Enter 1 for first come first served & 2 for best fit approach ");
				   c = keyboard.nextInt();
				   if(c==1)
				   {
					   Pa.setConfig(new First_come());
				   }
				   else if (c==2)
				   {
					   Pa.setConfig(new Minimum_dimensions());
				   }
				   break;
			   }
			   
			   case 2:
			   {
				   Slot s = new Slot();
				   System.out.print("Enter the ID of the slot ");
				   sid = keyboard.nextInt();
				   s.setId(sid);
				   System.out.print("Enter the depth of the slot ");
				   d= keyboard.nextDouble();
				   s.setDepth(d);
				   System.out.print("Enter the width of the slot ");
				   d= keyboard.nextDouble();
				   s.setWidth(d);
				   Pa.addParkingSlots(s);
				   break;
			   }
			   case 3:
			   {
				   Vehicle v = new Vehicle();
				   System.out.print("Enter the model name of the vehicle ");
				    mo= keyboard.next();
				   v.getInfo().setModel_name(mo);
				   System.out.print("Enter the ID of the vehicle ");
				   sid = keyboard.nextInt();
				   v.getInfo().setId(sid);
				   System.out.print("Enter the model year of the vehicle ");
				   sid = keyboard.nextInt();
				   v.getInfo().setModel_year(sid);
				   System.out.print("Enter the depth of the vehicle ");
				   d= keyboard.nextDouble();
				  v.getInfo().setDepth(d);
				   System.out.print("Enter the width of the vehicle ");
				   d= keyboard.nextDouble();
				   v.getInfo().setWidth(d);
				   message= Vo.addVehicle (v);
				   if(message)
				   {
					   System.out.print("the car is added");
				   }
				   else 
				   {
					   System.out.print("the car is not added");
				   }
				   sid =Pa.search(v);
				   Vo.parkin(sid,Pa.getparking_slots(),v.getInfo().getId());
				   
				   break;  
			   }
			   
			   case 4:
			   {
				   System.out.print("Enter the id of the vehicle ");
				   sid=keyboard.nextInt();
				   Vo.parkout(sid, Pa.getparking_slots());
				   break;
			   }
			   case 5:
			   {
				   System.out.print(Vo.getF().getTotal_income());
				   break;
			   }
			   case 6:
			   {
				   System.out.print(Vo.getTotal_number_of_vehicles ());
				   break; 
			   }
			   case 7:
			   {
				   Pa.displayAvailableParkingSlots();
				   break;
			   }
			   case 8:
			   {
				   choice =9;
				   System.exit(0);
				   break;
			   }
				   
			
			 }
			 
		 }
	   keyboard.close();
	}

}
