package com.online.model.slot;

public class Time
{
	private int hour;
	private int minute;
	
	public Time() {}
	
	/**
	 * @param hour
	 * @param minute
	 */
	public Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	/**
	 * @param hour
	 * @param minute
	 * @param meridiem
	 */
	public Time(int hour, int minute, char meridiem)
	{
		if(meridiem == 'p')
		{
			this.hour = (hour%12)+12;
		}
		else
		{
			this.hour = hour%12;
		}
		this.minute = minute;
	}
	
	/**
	 * @return the hour
	 */
	public int getHour()
	{
		return hour;
	}
	
	/**
	 * @param hour the hour to set
	 */
	
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	/**
	 * @return the minute
	 */
	public int getMinute()
	{
		return minute;
	}
	
	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute)
	{
		this.minute = minute;
	}

	public int getFourDigitTime()
	{
		return (hour*100)+minute;
	}
}
