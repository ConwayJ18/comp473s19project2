package com.online.model.inspection;

import com.online.model.slot.Slot;

public class Inspection
{
	private String inspectionType;
	private Slot slot;
	
	public Inspection() {}

	/**
	 * @param inspectionType
	 * @param slot
	 */
	public Inspection(String inspectionType, Slot slot)
	{
		this.inspectionType = inspectionType;
		this.slot = slot;
	}

	/**
	 * @return the inspectionType
	 */
	public String getInspectionType()
	{
		return inspectionType;
	}

	/**
	 * @param inspectionType the inspectionType to set
	 */
	public void setInspectionType(String inspectionType)
	{
		this.inspectionType = inspectionType;
	}

	/**
	 * @return the slot
	 */
	public Slot getSlot()
	{
		return slot;
	}

	/**
	 * @param slot the slot to set
	 */
	public void setSlot(Slot slot)
	{
		this.slot = slot;
	}
	
	
}
