package com.apatole.main;

import com.apatole.beans.InputData;
import com.apatole.beans.ValidatationResult;
import com.apatole.factory.GetShiftStructureFactory;
import com.apatole.factory.ShiftStructure;

public class ShiftRoster {
	public static void main(String[] a) {
		GetShiftStructureFactory g = new GetShiftStructureFactory();
		InputData n=new InputData();
		n.setNumberOfResources(5);
		n.setShiftStructure("6+1");
		
//		ValidatationResult v= new ValidateInput().ValidateInputData(n);
//		if (v.isShiftRosterPossible()==true) {
//		System.out.println("Minimum Resoures Needed "+v.getMinResourcesNeeded());
//		System.out.println("Total Shifts to be covered "+v.getTotalShiftsToBeCovered());
//		System.out.println("Shift roste can be created with given inputs");
//		}
		
		ShiftStructure s = g.getValidationResult(n.getShiftStructure());
		ValidatationResult v=s.ValidateInput(4);
		
		if (v.isShiftRosterPossible()==true) {
		  System.out.println("Minimum Resoures Needed "+v.getMinResourcesNeeded());
		  System.out.println("Total Shifts to be covered "+v.getTotalShiftsToBeCovered());
		  System.out.println("Shift roste can be created with given inputs");
		}
		
		
	}
}
