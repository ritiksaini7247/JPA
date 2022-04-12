package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cloth {

	@Id
	@Column(name = "cloth_id")
	private Integer clothId;
	@Column(name = "cloth_type")
	private String clothType;
	@Column(name = "cloth_cost")
	private Float clothCost;

	public Cloth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cloth(Integer clothId, String clothType, Float clothCost) {
		super();
		this.clothId = clothId;
		this.clothType = clothType;
		this.clothCost = clothCost;
	}

	public Integer getClothId() {
		return clothId;
	}

	public void setClothId(Integer clothId) {
		this.clothId = clothId;
	}

	public String getClothType() {
		return clothType;
	}

	public void setClothType(String clothType) {
		this.clothType = clothType;
	}

	public Float getClothCost() {
		return clothCost;
	}

	public void setClothCost(Float clothCost) {
		this.clothCost = clothCost;
	}

	@Override
	public String toString() {
		return "Cloth [clothId=" + clothId + ", clothType=" + clothType + ", clothCost=" + clothCost + "]";
	}

}
