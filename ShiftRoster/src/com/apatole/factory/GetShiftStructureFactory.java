package com.apatole.factory;



public class GetShiftStructureFactory {
	public ShiftStructure getValidationResult (String ShiftStructure) {
		if (ShiftStructure.equalsIgnoreCase("5+2")) {
			return new ShiftStruct_5_2();
		}
		
		if (ShiftStructure.equalsIgnoreCase("4+3")) {
			return new ShiftStruct_4_3();
		}
		
		if (ShiftStructure.equalsIgnoreCase("6+1")) {
			return new ShiftStruct_6_1();
		}
		
		return null;
	}
}
