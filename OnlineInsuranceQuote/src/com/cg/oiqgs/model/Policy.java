package com.cg.oiqgs.model;

public class Policy {
	private String businessSegment;
	private Integer policyNumber;
	private Double policyPremium;
	private Integer accountNumber;

	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public String getBusinessSegment() {
		return businessSegment;
	}

	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}

	public Integer getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Double getPolicyPremium() {
		return policyPremium;
	}

	public void setPolicyPremium(Double policyPremium) {
		this.policyPremium = policyPremium;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Policy(String businessSegment, Integer policyNumber, Double policyPremium, Integer accountNumber) {
		super();
		this.businessSegment = businessSegment;
		this.policyNumber = policyNumber;
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
	}

}