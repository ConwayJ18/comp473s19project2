package com.online.facilitymanager.model.facility;

import java.util.ArrayList;
import com.online.facilitymanager.model.inspection.Inspection;
import com.online.facilitymanager.model.maintenance.Maintenance;
import com.online.facilitymanager.model.use.Use;

public interface Facility
{
	Location getFacilityLocation();
	void setFacilityLocation(Location location);
	FacilityDetail getFacilityDetail();
	void setFacilityDetail(FacilityDetail detail);
	Use getFacilityUse();
	void setFacilityUse(Use use);
	Maintenance getFacilityMaintenance();
	void setFacilityMaintenance(Maintenance maintenance);
	ArrayList<Inspection> getInspections();
	void addInspection(Inspection inspection);
}
