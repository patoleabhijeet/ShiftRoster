package com.apatole.factory;

import com.apatole.beans.ValidatationResult;

public abstract class ShiftStructure {
	protected int numberOfResources;
	abstract int getminimumResourcesNeeded();
	abstract int getnumberOfShiftsTocover();
	
	public ValidatationResult ValidateInput (int numberOfResources) {
		ValidatationResult v = new ValidatationResult();
		v.setShiftRosterPossible(false);
		v.setMinResourcesNeeded(getminimumResourcesNeeded());
		v.setTotalShiftsToBeCovered(getnumberOfShiftsTocover());
		if (numberOfResources >=v.getMinResourcesNeeded()) {
			v.setShiftRosterPossible(true);
			return v;
		}
		else {
			
			return v;
		}	
	}
}
