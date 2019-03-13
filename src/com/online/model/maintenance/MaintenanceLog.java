package com.online.model.maintenance;

import java.util.HashMap;
import com.online.model.slot.Slot;

public class MaintenanceLog
{
	private HashMap<MaintenanceOrder, Slot> log;
	
	MaintenanceLog()
	{
		log = new HashMap<MaintenanceOrder, Slot>();
	}

	/**
	 * @return the schedule
	 */
	public HashMap<MaintenanceOrder, Slot> getLog() {
		return log;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setLog(HashMap<MaintenanceOrder, Slot> log) {
		this.log = log;
	}
}
