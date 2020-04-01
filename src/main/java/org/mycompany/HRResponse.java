package org.mycompany;

public class HRResponse {
	 private String refId;
	 private String reqTime;
	 private String idNo;
	 EmployeeProfile EmployeeProfileObject;


	 // Getter Methods 

	 public String getRefId() {
	  return refId;
	 }

	 public String getReqTime() {
	  return reqTime;
	 }

	 public String getIdNo() {
	  return idNo;
	 }

	 public EmployeeProfile getEmployeeProfile() {
	  return EmployeeProfileObject;
	 }

	 // Setter Methods 

	 public void setRefId(String refId) {
	  this.refId = refId;
	 }

	 public void setReqTime(String reqTime) {
	  this.reqTime = reqTime;
	 }

	 public void setIdNo(String idNo) {
	  this.idNo = idNo;
	 }

	 public void setEmployeeProfile(EmployeeProfile employeeProfileObject) {
	  this.EmployeeProfileObject = employeeProfileObject;
	 }
	}

	