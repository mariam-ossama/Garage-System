package parkingGarageApp;

import java.util.List;

public class Minimum_dimensions  implements Iconfiguration
{

	@Override
	public int searchForEmptySlot(Vehicle v, List <Slot> p) 
	{
		Slot min =null ;
		int res =-1;
		int first=0;
		for(int i=0;i<p.size();i++)
		{
			if( p.get(i).getStatus() == "empty" && p.get(i).getDepth()>=v.getInfo().getDepth() && p.get(i).getWidth()>=v.getInfo().getWidth())
			{
				if(first==0)	
				  {
				  	  min =p.get(i);
				  	  first=1;
				  	  res =i;
				  }
			}
			else if(min.getDepth()> p.get(i).getDepth() && min.getWidth()> p.get(i).getWidth())
				{
				   min = p.get(i);
				   res =i;
				}
		}
		return res;
		
	}

}
