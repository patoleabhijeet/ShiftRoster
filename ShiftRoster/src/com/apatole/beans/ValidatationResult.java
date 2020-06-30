package com.apatole.beans;

public class ValidatationResult {
	int totalShiftsToBeCovered;
	int minResourcesNeeded;
	boolean shiftRosterPossible;
	public int getTotalShiftsToBeCovered() {
		return totalShiftsToBeCovered;
	}
	public void setTotalShiftsToBeCovered(int totalShiftsToBeCovered) {
		this.totalShiftsToBeCovered = totalShiftsToBeCovered;
	}
	public int getMinResourcesNeeded() {
		return minResourcesNeeded;
	}
	public void setMinResourcesNeeded(int minResourcesNeeded) {
		this.minResourcesNeeded = minResourcesNeeded;
	}
	public boolean isShiftRosterPossible() {
		return shiftRosterPossible;
	}
	public void setShiftRosterPossible(boolean shiftRosterPossible) {
		this.shiftRosterPossible = shiftRosterPossible;
	}
}
