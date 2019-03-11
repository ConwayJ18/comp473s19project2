package comp473s19project1;

public class UseRequest
{
	private FacilityUser user;
	private Slot timeslot;
	
	public UseRequest() {}
	
	/**
	 * @param user
	 * @param timeslot
	 */
	public UseRequest(FacilityUser user, Slot timeslot) {
		this.user = user;
		this.timeslot = timeslot;
	}

	/**
	 * @return the user
	 */
	public FacilityUser getUser()
	{
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(FacilityUser user)
	{
		this.user = user;
	}

	/**
	 * @return the timeslot
	 */
	public Slot getTimeslot() 
	{
		return timeslot;
	}

	/**
	 * @param timeslot the timeslot to set
	 */
	public void setTimeslot(Slot timeslot)
	{
		this.timeslot = timeslot;
	}
	
	
}
