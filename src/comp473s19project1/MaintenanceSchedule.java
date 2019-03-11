package comp473s19project1;

import java.util.HashMap;

public class MaintenanceSchedule
{
	private HashMap<MaintenanceOrder, Slot> schedule;
	
	MaintenanceSchedule()
	{
		schedule = new HashMap<MaintenanceOrder, Slot>();
	}

	/**
	 * @return the schedule
	 */
	public HashMap<MaintenanceOrder, Slot> getSchedule()
	{
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(HashMap<MaintenanceOrder, Slot> schedule)
	{
		this.schedule = schedule;
	}
}
