package org.inetsolv.SpringCoreLifeCycleTest;

public class Employee {	
	private Integer eid;

	public void setEid(Integer eid) {
		System.out.println("Inside setEid()");
		this.eid = eid;
	}
}