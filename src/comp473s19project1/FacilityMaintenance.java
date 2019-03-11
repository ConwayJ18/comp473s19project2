package comp473s19project1;

import java.util.ArrayList;

public class FacilityMaintenance
{
	private MaintenanceSchedule maintSchedule;
	private ArrayList<MaintenanceOrder> maintOrders;
	private MaintenanceLog maintLog;
	private ArrayList<MaintenanceRequest> maintRequests;

	/**
	 * @param maintSchedule
	 * @param maintOrder
	 * @param maintLog
	 * @param maintReq
	 */
	public FacilityMaintenance(MaintenanceSchedule schedule, MaintenanceLog log)
	{
		this.maintSchedule = schedule;
		this.maintOrders = new ArrayList<MaintenanceOrder>();
		this.maintLog = log;
		this.maintRequests = new ArrayList<MaintenanceRequest>();
	}

	/**
	 * @return the maintSchedule
	 */
	public MaintenanceSchedule getMaintSchedule()
	{
		return maintSchedule;
	}
	
	/**
	 * @param maintSchedule the maintSchedule to set
	 */
	public void setMaintenanceSchedule(MaintenanceSchedule maintSchedule)
	{
		this.maintSchedule = maintSchedule;
	}
	
	/**
	 * @return the maintOrder
	 */
	public ArrayList<MaintenanceOrder> getMaintOrders()
	{
		return maintOrders;
	}
	
	/**
	 * @return the maintLog
	 */
	public MaintenanceLog getMaintLog()
	{
		return maintLog;
	}

	/**
	 * @return the maintReq
	 */
	public ArrayList<MaintenanceRequest> getMaintReqs() {
		return maintRequests;
	}
	
	/**
	 * @param maintReq the maintReq to set
	 */
	public void addMaintReq(MaintenanceRequest maintReq) {
		maintRequests.add(maintReq);
	}
	
	/**
	 * @param maintOrder the maintOrder to add
	 */
	public void addOrderToSchedule(MaintenanceOrder maintOrder, Slot timeSlot) {
		maintSchedule.getSchedule().put(maintOrder, timeSlot);
		maintOrders.remove(maintOrder);
	}

	/**
	 * @param maintOrder the maintOrder to set
	 */
	public void addMaintOrder(MaintenanceOrder maintOrder) {
		maintOrders.add(maintOrder);
	}

	/**
	 * @param maintOrder the maintOrder to add
	 */
	public void addOrderToLog(MaintenanceOrder maintOrder) {
		maintLog.getLog().put(maintOrder, maintSchedule.getSchedule().get(maintOrder));
		maintSchedule.getSchedule().remove(maintOrder);
	}
}
