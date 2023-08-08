package parkingGarageApp;
import java.util.List;
import java.util.ArrayList;
import java.util.Formatter;


public class ParkingArea
{
	static private List <Slot> parking_slots ;
	private Iconfiguration config;
    private static ParkingArea instance ;

	private ParkingArea()
	{
		
	}
	
	public List<Slot>  getparking_slots ()
	{
		return parking_slots;
	}
	
	public int search (Vehicle v)
	{
		int res= config.searchForEmptySlot(v, parking_slots);
		return res;
    }
   
	public void setConfig (Iconfiguration c)
	{
		config = c;
	}
	public static ParkingArea getInstance ()
	{
		if(instance ==null)
		{
			instance = new ParkingArea();
			parking_slots = new ArrayList<Slot>();
			return instance;
		}
		else
		{
			return instance;
		}
		
	}

    void addParkingSlots (Slot s)
    {
    	parking_slots.add(s);
    }

    public void displayAvailableParkingSlots ()
     {
	   Formatter f;
	   f=new Formatter ();
	
       f.format("%10s %10s %10s \n","slot id","depth","width");
	
	   for (int i=0;i<parking_slots.size();i++)
	    {
		   if (parking_slots.get(i).getStatus()=="empty")
		   {
		      f.format("%8s %11s %10s \n", parking_slots.get(i).getId(),parking_slots.get(i).getDepth(),parking_slots.get(i).getWidth());
		   }
		}
	    System.out.println(f);
	    f.close();
     }

}