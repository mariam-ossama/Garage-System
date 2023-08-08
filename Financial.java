package parkingGarageApp;

public class Financial 
{
   private double total_income =0;
   
   public void add_to_total_income(double f)
   {
	   this.total_income+= f;
   }
   
   public double getTotal_income ()
   {
	   return total_income;
   }
}
