package com.bsuir.team.calc.entities;

import java.io.Serializable;

public class Rate implements Serializable{

	private static final long serialVersionUID = 1L;
	
	long curID;
	String date;
	String curAbbreviation;
	int curScale;
	String curName;
	double curOfficialRate;
	
	public long getCurID() {
		return curID;
	}
	public void setCurID(long curID) {
		this.curID = curID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCurAbbreviation() {
		return curAbbreviation;
	}
	public void setCurAbbreviation(String curAbbreviation) {
		this.curAbbreviation = curAbbreviation;
	}
	public int getCurScale() {
		return curScale;
	}
	public void setCurScale(int curScale) {
		this.curScale = curScale;
	}
	public String getCurName() {
		return curName;
	}
	public void setCurName(String curName) {
		this.curName = curName;
	}
	public double getCurOfficialRate() {
		return curOfficialRate;
	}
	public void setCurOfficialRate(double curOfficialRate) {
		this.curOfficialRate = curOfficialRate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curAbbreviation == null) ? 0 : curAbbreviation.hashCode());
		result = prime * result + (int) (curID ^ (curID >>> 32));
		result = prime * result + ((curName == null) ? 0 : curName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(curOfficialRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + curScale;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rate other = (Rate) obj;
		if (curAbbreviation == null) {
			if (other.curAbbreviation != null)
				return false;
		} else if (!curAbbreviation.equals(other.curAbbreviation))
			return false;
		if (curID != other.curID)
			return false;
		if (curName == null) {
			if (other.curName != null)
				return false;
		} else if (!curName.equals(other.curName))
			return false;
		if (Double.doubleToLongBits(curOfficialRate) != Double.doubleToLongBits(other.curOfficialRate))
			return false;
		if (curScale != other.curScale)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Rate [curID=" + curID + ", date=" + date + ", curAbbreviation=" + curAbbreviation + ", curScale="
				+ curScale + ", curName=" + curName + ", curOfficialRate=" + curOfficialRate + "]";
	}
}