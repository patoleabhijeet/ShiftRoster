package com.apatole.main;

import com.apatole.beans.InputData;
import com.apatole.beans.ValidatationResult;

public class ValidateInput {
	public ValidatationResult ValidateInputData(InputData i) {
		ValidatationResult v = new ValidatationResult();
		v.setShiftRosterPossible(false);
		if (i.getShiftStructure().equalsIgnoreCase("5+2")) {
			v.setMinResourcesNeeded(5);
			v.setTotalShiftsToBeCovered(21);
			if (i.getNumberOfResources()>=v.getMinResourcesNeeded()) {
				v.setShiftRosterPossible(true);
				return v;
			}
			else {
				
				return v;
			}
		}	
		return v;
	}
}
