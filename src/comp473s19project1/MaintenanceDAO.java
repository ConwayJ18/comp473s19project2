package comp473s19project1;

import java.util.ArrayList;

public class MaintenanceDAO
{
	public MaintenanceDAO() {}
	
	public void makeFacilityMaintRequest(Facility f, MaintenanceRequest mr)
	{
		Database.db.get(f).getFacilityMaintenance().addMaintReq(mr);
	}
	
	public void scheduleMaintenance(Facility f, MaintenanceOrder mo, Slot s)
	{
		Database.db.get(f).getFacilityMaintenance().addOrderToSchedule(mo, s);
	}

	public int calcMaintenanceCostForFacility(Facility f)
	{
		int totalCost = 0;
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintOrders())
		{
			totalCost += o.getCost();
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintSchedule().getSchedule().keySet())
		{
			totalCost += o.getCost();
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintLog().getLog().keySet())
		{
			totalCost += o.getCost();
		}
		
		return totalCost;
	}
	
	public String calcProblemRateForFacility(Facility f)
	{
		int totalProblems = 0;
		Date oldestDate = new Date();
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintOrders())
		{
			if(o.getRequestDate().isOlderThan(oldestDate))
			{
				oldestDate = o.getRequestDate();
			}
			totalProblems++;
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintSchedule().getSchedule().keySet())
		{
			if(o.getRequestDate().isOlderThan(oldestDate))
			{
				oldestDate = o.getRequestDate();
			}
			totalProblems++;
		}
		
		for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintLog().getLog().keySet())
		{
			if(o.getRequestDate().isOlderThan(oldestDate))
			{
				oldestDate = o.getRequestDate();
			}
			totalProblems++;
		}
		
		return totalProblems + " since " + oldestDate.toString();
	}
	
	public int calcDownTimeForFacility(Facility f)
	{
		int downtime = 0;
		for(Slot s : Database.db.get(f).getFacilityMaintenance().getMaintSchedule().getSchedule().values())
		{
			downtime += s.getDuration().getDurationInMinutes();
		}
		
		for(Slot s : Database.db.get(f).getFacilityMaintenance().getMaintLog().getLog().values())
		{
			downtime += s.getDuration().getDurationInMinutes();
		}
		
		return downtime;
	}
	
	public ArrayList<MaintenanceRequest> listMaintRequests(Facility f)
	{
		return Database.db.get(f).getFacilityMaintenance().getMaintReqs();
	}
	
	public ArrayList<MaintenanceOrder> listMaintenance(Facility f)
	{
		return Database.db.get(f).getFacilityMaintenance().getMaintOrders();
	}
	
	public MaintenanceSchedule listFacilityProblems(Facility f)
	{
		return Database.db.get(f).getFacilityMaintenance().getMaintSchedule();
	}
}
