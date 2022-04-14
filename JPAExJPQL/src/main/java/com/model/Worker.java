package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Worker {

	@Id
	@Column(name = "worker_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer workerId;
	@Column(name = "worker_name")
	private String workerName;
	@Column(name = "worker_salary")
	private Float workerSalary;
	@Column(name = "worker_age")
	private Byte workerAge;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(Integer workerId, String workerName, Float workerSalary, Byte workerAge) {
		super();
		this.workerId = workerId;
		this.workerName = workerName;
		this.workerSalary = workerSalary;
		this.workerAge = workerAge;
	}

	public Integer getWorkerId() {
		return workerId;
	}

	public void setWorkerId(Integer workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public Float getWorkerSalary() {
		return workerSalary;
	}

	public void setWorkerSalary(Float workerSalary) {
		this.workerSalary = workerSalary;
	}

	public Byte getWorkerAge() {
		return workerAge;
	}

	public void setWorkerAge(Byte workerAge) {
		this.workerAge = workerAge;
	}

	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", workerName=" + workerName + ", workerSalary=" + workerSalary
				+ ", workerAge=" + workerAge + "]";
	}

}
