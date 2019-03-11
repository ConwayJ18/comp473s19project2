package comp473s19project1;

import java.util.ArrayList;

public class Building implements Facility
{
	private FacilityLocation location;
	private FacilityDetail detail;
	private FacilityUse use;
	private FacilityMaintenance maintenance;
	private ArrayList<Inspection> inspections;

	Building(){}
	
	/**
	 * @param location
	 * @param detail
	 * @param use
	 * @param maintenance
	 */
	public Building(FacilityLocation location, FacilityDetail detail, FacilityUse use,
			FacilityMaintenance maintenance)
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
	public FacilityLocation getFacilityLocation()
	{
		return location;
	}

	/**
	 * @param location the location to set
	 */
	@Override
	public void setFacilityLocation(FacilityLocation location)
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
	public FacilityUse getFacilityUse()
	{
		return use;
	}

	/**
	 * @param use the use to set
	 */
	@Override
	public void setFacilityUse(FacilityUse use)
	{
		this.use = use;
	}

	/**
	 * @return the maintenance
	 */
	@Override
	public FacilityMaintenance getFacilityMaintenance()
	{
		return maintenance;
	}

	/**
	 * @param maintenance the maintenance to set
	 */
	@Override
	public void setFacilityMaintenance(FacilityMaintenance maintenance)
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
