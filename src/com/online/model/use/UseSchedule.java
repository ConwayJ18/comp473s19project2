package com.online.model.use;

import java.util.HashMap;
import com.online.model.slot.Slot;

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
