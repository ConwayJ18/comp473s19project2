package com.online.client;

public class FacilityClient
{
	public static void main(String args[])
	{
		/*
		 * The following objects are needed in order to begin testing
		 */
		
		//Begin creation of primary test objects
		FacilityLocation fl1 = new FacilityLocation(1032, "W", "Sheridan Rd", "Chicago", "IL", 60626, "United States");
		FacilityDetail fd1 = new FacilityDetail(1, "Information Commons", 5574, 67000);
		
		UseSchedule us1 = new UseSchedule();
		FacilityUse u1 = new FacilityUse(us1);
		
		MaintenanceSchedule ms1 = new MaintenanceSchedule();
		MaintenanceLog ml1 = new MaintenanceLog();
		FacilityMaintenance m1 = new FacilityMaintenance(ms1, ml1);
		Facility f1 = new Building(fl1, fd1, u1, m1);
		
		//Begin creation of secondary test objects
		Time start1 = new Time(1, 0);
		Time end1 = new Time(2, 0);
		Days d1 = new Days(true,false,true,false,true,false,false);
		Slot s1 = new Slot(d1, start1, end1);
		FacilityUser fu1 = new FacilityUser("jaconway", "Jess Conway", 7864938008l, "jconway6@luc.edu", "Admin");
		UseRequest ur1 = new UseRequest(fu1, s1);
		
		Time start2 = new Time(15, 29);
		Time end2 = new Time(19, 17);
		Date d2 = new Date(12,21,2019);
		Slot s2 = new Slot(d2, start2, end2);
		Inspection i1 = new Inspection("Fire", s2);

		Date d3 = new Date(3, 30, 2019);
		MaintenanceRequest mr1 = new MaintenanceRequest(5, "Flooding on 1st Floor", d3);
		Date d4 = new Date(4,5,2019);
		Time start4 = new Time(14, 00);
		Duration duration4 = new Duration(120);
		Slot s4 = new Slot(d4, start4, duration4);
		MaintenanceOrder mo1 = new MaintenanceOrder(mr1, d4, 14100);
		//End creation of secondary test objects
		
		
		
		/*
		 * The following code is used in place of JUnit tests to test the DAL
		 */
		
		//Begin FacilityDAL tests
		FacilityDAO fClient = new FacilityDAO();
		fClient.addNewFacility(f1);
		fClient.addFacilityDetail(f1, fd1);
		fClient.listFacilities();
		fClient.requestAvailableCapacity(f1);
		fClient.removeFacility(f1);
		//End FacilityDAL tests
		
		//Begin UseDAL tests
		f1.addInspection(i1);
		fClient.addNewFacility(f1);
		UseDAO uClient = new UseDAO();
		uClient.isInUseDuringInterval(f1, d2, start2, end2);
		uClient.assignFacilityToUse(f1, ur1);
		uClient.vacateFacility(f1);
		uClient.listInspections(f1);
		uClient.listActualUsage(f1);
		uClient.calcUsageRate(f1);
		//End UseDAL tests
		
		//Begin MaintenanceDAL tests
		MaintenanceDAO mClient = new MaintenanceDAO();
		mClient.makeFacilityMaintRequest(f1, mr1);
		mClient.scheduleMaintenance(f1, mo1, s4);
		mClient.calcMaintenanceCostForFacility(f1);
		mClient.calcProblemRateForFacility(f1);
		mClient.calcDownTimeForFacility(f1);
		mClient.listMaintRequests(f1);
		mClient.listMaintenance(f1);
		mClient.listFacilityProblems(f1);
		//End MaintenanceDAL tests
	}
}