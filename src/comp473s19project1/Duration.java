package comp473s19project1;

public class Duration
{
	private int durationInMinutes;
	
	public Duration() {}

	/**
	 * @param durationInMinutes
	 */
	public Duration(int durationInMinutes)
	{
		this.durationInMinutes = durationInMinutes;
	}
	
	/**
	 * @param startTime
	 * @param endTime
	 */
	public Duration(Time startTime, Time endTime)
	{
		this.durationInMinutes = (endTime.getHour()-startTime.getHour())*60 + (endTime.getMinute()-startTime.getMinute());
	}

	/**
	 * @return the durationInMinutes
	 */
	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	/**
	 * @param durationInMinutes the durationInMinutes to set
	 */
	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	
}
