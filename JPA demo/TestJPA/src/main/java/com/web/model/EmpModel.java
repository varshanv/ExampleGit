package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmpModel {
	@Id
	private int empno;
	private String ename;
	private int sal;
	private String job;
	
	
	public EmpModel() {
		super();
	}
	public EmpModel(int empno, String ename, int sal, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "EmpModel [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", job=" + job + "]";
	}
	
	
}
