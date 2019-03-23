package com.online.facilitymanager.model.facility;

import java.util.ArrayList;
import java.util.Collection;

import com.online.facilitymanager.data.UseDAO;
import com.online.facilitymanager.model.inspection.Inspection;
import com.online.facilitymanager.model.maintenance.Maintenance;
import com.online.facilitymanager.model.slot.Date;
import com.online.facilitymanager.model.slot.Days;
import com.online.facilitymanager.model.slot.Time;
import com.online.facilitymanager.model.use.Use;
import com.online.facilitymanager.model.use.UseRequest;
import com.online.facilitymanager.model.use.UseSchedule;

public interface Facility
{
	Location getLocation();
	void setLocation(Location location);
	FacilityDetail getFacilityDetail();
	void setFacilityDetail(FacilityDetail detail);
	Use getUse();
	void setUse(Use use);
	Maintenance getMaintenance();
	void setMaintenance(Maintenance maintenance);
	ArrayList<Inspection> getInspections();
	void setInspections(ArrayList<Inspection> inspections);
	
	//FacilityDAO Methods
	Collection<Facility> listFacilities();
	FacilityDetail getFacilityInformation();
	int requestAvailableCapacity();
	Facility addNewFacility();
	void addFacilityDetail(FacilityDetail fd);
	void removeFacility();
	void addInspection(Inspection i);
	
	//UseDAO Methods
	public boolean isInUseDuringInterval(Date d, Time start, Time end);
	public boolean isInUseDuringInterval(Days d, Time start, Time end);
	public void assignFacilityToUse(UseRequest ur);
	public void vacateFacility();
	public ArrayList<Inspection> listInspections();
	public UseSchedule listActualUsage();
	public double calcUsageRate();
	
	//MaintenanceDAO Methods
}
