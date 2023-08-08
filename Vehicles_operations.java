package parkingGarageApp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vehicles_operations 
{
	private List<Vehicle> parked_vehicles;
	private Financial f;
	
	Vehicles_operations ()
	{
		parked_vehicles = new ArrayList<Vehicle>();
		f = new Financial();
	}
	public Financial getF()
	{
		return f;
	}
	void parkin (int islot, List <Slot> p , int v)
	{
	
		if(islot !=1)
		{
			for(int j= 0;j< parked_vehicles.size();j ++)
			{
				if(parked_vehicles.get(j).getInfo().getId() == v) 
				{
					parked_vehicles.get(j).setArrivalTime(LocalDateTime.now());
				}
			}
			
			p.get(islot).setStatus("busy");
			p.get(islot).setVehicle_id(v);
			System.out.print("\n the car parked");
		}
		else
		{
			System.out.print("No suitable place ");
		}
		
		
	}
	
	void  parkout(int vid, List <Slot> p)
	{
		for(int j= 0;j< parked_vehicles.size();j ++)
		{
			if(parked_vehicles.get(j).getInfo().getId() == vid) 
			{
				parked_vehicles.get(j).setDepartureTime(LocalDateTime.now());
				parked_vehicles.get(j).calculateTotalTime();
				System.out.print("the fees=");
				System.out.print(parked_vehicles.get(j).calculatingParkingFees ());
				f.add_to_total_income(parked_vehicles.get(j).calculatingParkingFees ());
			}
		}
		
		for (int i=0;i<p.size();i++)
		{
			if(p.get(i).getVehicle_id()==vid)
			{
				p.get(i).setStatus("empty");
				p.get(i).setVehicle_id(0);
				
			}
		}
		
	}
	boolean addVehicle (Vehicle v)
	{
		parked_vehicles.add(v);
		return true;
	}
	
	int getTotal_number_of_vehicles ()
	{
		return parked_vehicles.size();
	}
}
