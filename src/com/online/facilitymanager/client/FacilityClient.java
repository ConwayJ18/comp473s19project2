package com.online.facilitymanager.client;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.facilitymanager.model.facility.Location;
import com.online.facilitymanager.model.inspection.Inspection;
import com.online.facilitymanager.model.maintenance.Maintenance;
import com.online.facilitymanager.model.maintenance.MaintenanceLog;
import com.online.facilitymanager.model.maintenance.MaintenanceOrder;
import com.online.facilitymanager.model.maintenance.MaintenanceRequest;
import com.online.facilitymanager.model.maintenance.MaintenanceSchedule;
import com.online.facilitymanager.model.slot.Date;
import com.online.facilitymanager.model.slot.Days;
import com.online.facilitymanager.model.slot.Duration;
import com.online.facilitymanager.model.slot.Slot;
import com.online.facilitymanager.model.slot.Time;
import com.online.facilitymanager.model.facility.Facility;
import com.online.facilitymanager.model.facility.FacilityDetail;
import com.online.facilitymanager.model.use.UseSchedule;
import com.online.facilitymanager.model.use.FacilityUser;
import com.online.facilitymanager.model.use.Use;
import com.online.facilitymanager.model.use.UseRequest;

public class FacilityClient
{
	public static void main(String args[])
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		System.out.println("***************** Application Context instantiated! ******************");
		/*
		 * The following objects are needed in order to begin testing
		 */
		//Begin creation of primary test objects
		Facility f1 = (Facility) context.getBean("facility");
		
		Location fl1 = f1.getFacilityLocation();
		fl1.setAddressNumber(1032);
		fl1.setDirectional("W");
		fl1.setStreetName("Sheridan");
		fl1.setCity("Chicago");
		fl1.setState("IL");
		fl1.setZip(60660);
		fl1.setCountry("United States");
		
		FacilityDetail fd1 = f1.getFacilityDetail();
		fd1.setId(1);
		fd1.setName("Information Commons");
		fd1.setCapacity(5574);
		fd1.setSquareFeet(67000);
		
		Use u1 = f1.getFacilityUse();
		UseRequest ur1 = u1.getRequests().get(1);
		FacilityUser fu1 = ur1.getUser();
		Slot s1 = ur1.getTimeslot();
		Days dy1 = s1.getDays();
		Time st1 = s1.getStartTime();
		Time et1 = s1.getEndTime();
		Duration dr1 = s1.getDuration();
		Date dt1 = s1.getDate();
		UseSchedule us1 = u1.getSchedule();
		
		Maintenance m1 = f1.getFacilityMaintenance();
		MaintenanceSchedule ms1 = m1.getMaintSchedule();
		MaintenanceOrder mo1 = m1.getMaintOrders().get(1);
		Date dt2 = mo1.getRequestDate();
		Date dt3 = mo1.getOrderDate();
		MaintenanceLog ml1 = m1.getMaintLog();
		MaintenanceRequest mr1 = m1.getMaintReqs().get(1);
		Date dt4 = mr1.getRequestDate();
		
		Inspection i1 = f1.getInspections().get(1);
		Slot s2 = i1.getSlot();
		Days dy2 = s2.getDays();
		Time st2 = s2.getStartTime();
		Time et2 = s2.getEndTime();
		Duration dr2 = s2.getDuration();
		Date dt5 = s2.getDate();
		
		/*
		
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
		*/
	}
}