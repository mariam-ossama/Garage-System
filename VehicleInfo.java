package parkingGarageApp;

public class VehicleInfo
{
  private String model_name;
  private int id;
  private int model_year;
  private double v_depth;
  private double v_width;
  
  public void setVehicleInfo (String m, int y, double d, double w, int Id )
  {
	  model_name=m;
	  id= Id;
	  model_year=y;
	  v_width=w;
	  v_depth=d;
  }
  public void setId(int id)
  {
	  this.id =id;
  }
  
  public void setModel_name (String m)
  {
	  model_name =m;
  }
  
  public void setModel_year (int m)
  {
	  model_year =m;
  }
  
  public void setDepth (double d)
  {
	  v_depth =d;
  }
  
  public void setWidth (double w)
  {
	  v_width =w;
  }
  
  public String getModel_name()
  {
	  return model_name;
  }
  
  public int getId()
  {
	  return id;
  }
  
  public int getModel_year ()
  {
	  return model_year;
  }
  
  public double getDepth()
  {
	  return v_depth;
  }
  
  public double getWidth()
  {
	  return v_width;
  }
}
