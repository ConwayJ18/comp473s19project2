package com.online.facilitymanager.model.maintenance;

import java.util.ArrayList;

import com.online.facilitymanager.model.slot.Slot;

public interface Maintenance
{
	public MaintenanceSchedule getMaintSchedule();
	public void setMaintenanceSchedule(MaintenanceSchedule maintSchedule);
	public ArrayList<MaintenanceOrder> getMaintOrders();
	public MaintenanceLog getMaintLog();
	public ArrayList<MaintenanceRequest> getMaintReqs();
	public void addMaintReq(MaintenanceRequest maintReq);
	public void addOrderToSchedule(MaintenanceOrder maintOrder, Slot timeSlot);
	public void addMaintOrder(MaintenanceOrder maintOrder);
	public void addOrderToLog(MaintenanceOrder maintOrder);
}
