package comp473s19project1;

import java.util.ArrayList;

public class FacilityUse
{
	private ArrayList<UseRequest> requests;
	private UseSchedule schedule;
	
	public FacilityUse() {}
	
	/**
	 * @param user
	 * @param schedule
	 */
	public FacilityUse(UseSchedule schedule)
	{
		this.requests = new ArrayList<UseRequest>();
		this.schedule = schedule;
	}

	/**
	 * @return the user
	 */
	public ArrayList<UseRequest> getRequests()
	{
		return requests;
	}

	/**
	 * @param user the user to set
	 */
	public void addRequest(UseRequest request)
	{
		requests.add(request);
	}

	/**
	 * @return the schedule
	 */
	public UseSchedule getSchedule()
	{
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(UseSchedule schedule)
	{
		this.schedule = schedule;
	}
}
