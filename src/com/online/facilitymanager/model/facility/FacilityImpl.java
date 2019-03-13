package com.online.facilitymanager.model.facility;

import java.util.ArrayList;
import com.online.facilitymanager.model.inspection.Inspection;
import com.online.facilitymanager.model.maintenance.Maintenance;
import com.online.facilitymanager.model.use.Use;

public class FacilityImpl implements Facility
{
	private Location location;
	private FacilityDetail detail;
	private Use use;
	private Maintenance maintenance;
	private ArrayList<Inspection> inspections;

	FacilityImpl(){}
	
	/**
	 * @param location
	 * @param detail
	 * @param use
	 * @param maintenance
	 */
	public FacilityImpl(Location location, FacilityDetail detail, Use use,
			Maintenance maintenance)
	{
		this.location = location;
		this.detail = detail;
		this.use = use;
		this.maintenance = maintenance;
		this.inspections = new ArrayList<Inspection>();
	}

	/**
	 * @return the location
	 */
	@Override
	public Location getLocation()
	{
		return location;
	}

	/**
	 * @param location the location to set
	 */
	@Override
	public void setLocation(Location location)
	{
		this.location = location;
	}

	/**
	 * @return the detail
	 */
	@Override
	public FacilityDetail getFacilityDetail()
	{
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	@Override
	public void setFacilityDetail(FacilityDetail detail)
	{
		this.detail = detail;
	}

	/**
	 * @return the use
	 */
	@Override
	public Use getUse()
	{
		return use;
	}

	/**
	 * @param use the use to set
	 */
	@Override
	public void setUse(Use use)
	{
		this.use = use;
	}

	/**
	 * @return the maintenance
	 */
	@Override
	public Maintenance getMaintenance()
	{
		return maintenance;
	}

	/**
	 * @param maintenance the maintenance to set
	 */
	@Override
	public void setMaintenance(Maintenance maintenance)
	{
		this.maintenance = maintenance;
	}

	/**
	 * @return the inspection
	 */
	@Override
	public ArrayList<Inspection> getInspections()
	{
		return inspections;
	}

	/**
	 * @param inspection the inspection to set
	 */
	@Override
	public void addInspection(Inspection inspection)
	{
		inspections.add(inspection);
	}
}
