package com.online.facilitymanager.model.facility;

import java.util.ArrayList;
import java.util.Collection;

import com.online.facilitymanager.model.inspection.Inspection;
import com.online.facilitymanager.model.maintenance.Maintenance;
import com.online.facilitymanager.model.use.Use;

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
	Collection<Facility> listFacilities();
	FacilityDetail getFacilityInformation();
	int requestAvailableCapacity();
	Facility addNewFacility();
	void addFacilityDetail(FacilityDetail fd);
	void removeFacility();
	void addInspection(Inspection i);
}
