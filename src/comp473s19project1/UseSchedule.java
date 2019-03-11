package comp473s19project1;

import java.util.HashMap;

public class UseSchedule
{
	private HashMap<UseRequest, Slot> schedule;
	
	UseSchedule()
	{
		schedule = new HashMap<UseRequest, Slot>();
	}

	/**
	 * @return the schedule
	 */
	public HashMap<UseRequest, Slot> getSchedule()
	{
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(HashMap<UseRequest, Slot> schedule)
	{
		this.schedule = schedule;
	}
}
