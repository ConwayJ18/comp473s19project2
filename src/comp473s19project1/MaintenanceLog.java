package comp473s19project1;

import java.util.HashMap;

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
