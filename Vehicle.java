package parkingGarageApp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Vehicle
{
   private VehicleInfo info ;
   private LocalDateTime departureTime;
   private LocalDateTime arrivalTime;
   private long totalTime;
   
   Vehicle()
   {
	   info = new VehicleInfo();
   }
   public void setArrivalTime(LocalDateTime a)
   {
	   arrivalTime=a;
   }
   
   public void setDepartureTime(LocalDateTime d)
   {
	   departureTime =d;
   }
   
   public LocalDateTime getArrivalTime()
   {
	   return arrivalTime ;
   }
   
   public LocalDateTime getDeparturetime ()
   {
	   return departureTime ;
   }
   
   public long calculateTotalTime()
   {
	   long totalTime = ChronoUnit.HOURS.between(arrivalTime , departureTime );
	   return totalTime;
   }
   
   double calculatingParkingFees ()
   {
	   return totalTime * 5;
   }
   
   public void setInfo (String m, int y, double d, double w, int Id )
   {
	   info = new VehicleInfo ();
		info.setVehicleInfo(m, y, d, w, Id); 
   }
   
   public VehicleInfo getInfo ()
   {
	   return info;
   }
}
