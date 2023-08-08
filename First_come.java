package parkingGarageApp;

import java.util.List;

public class First_come implements Iconfiguration
{

	@Override
	public int searchForEmptySlot(Vehicle v,List<Slot> p) 
	{
		for(int i=0;i<p.size();i++)
		{
			if( p.get(i).getStatus() == "empty" && p.get(i).getDepth()>=v.getInfo().getDepth() && p.get(i).getWidth()>=v.getInfo().getWidth())
			{
				return i;
			}
		}
		return -1;
	}

}
