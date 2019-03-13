package com.online.model.facility;

import java.util.ArrayList;

import com.online.model.inspection.Inspection;
import com.online.model.maintenance.FacilityMaintenance;
import com.online.model.use.FacilityUse;

public interface Facility
{
	FacilityLocation getFacilityLocation();
	void setFacilityLocation(FacilityLocation location);
	FacilityDetail getFacilityDetail();
	void setFacilityDetail(FacilityDetail detail);
	FacilityUse getFacilityUse();
	void setFacilityUse(FacilityUse use);
	FacilityMaintenance getFacilityMaintenance();
	void setFacilityMaintenance(FacilityMaintenance maintenance);
	ArrayList<Inspection> getInspections();
	void addInspection(Inspection inspection);
}
