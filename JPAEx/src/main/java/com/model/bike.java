package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class bike {

	@Id
	private Integer bikeId;
	private String bikeName;
	private String bikeModel;

	public bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bike(Integer bikeId, String bikeName, String bikeModel) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikeModel = bikeModel;
	}

	public Integer getBikeId() {
		return bikeId;
	}

	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	@Override
	public String toString() {
		return "bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", bikeModel=" + bikeModel + "]";
	}

}
