package com.pershing.ppm.model;

public class PPM {
	private int ppmId;
	private String projectName;
	private String description;
	private String projManager;
	
	
	public int getPpmid() {
		return ppmId;
	}
	public void setPpmid(int ppmid) {
		this.ppmId = ppmid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPm() {
		return projManager;
	}
	public void setPm(String pm) {
		this.projManager = pm;
	}
	
	

}
