package com.cg.oiqgs.model;

public class Account {

	private String insuredName;
	private String insuredStreet;
	private String insuredCity;
	private String insuredState;
	private Long insuredZip;
	private String userName;
	

	private Integer accountNumber;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredStreet() {
		return insuredStreet;
	}

	public void setInsuredStreet(String insuredStreet) {
		this.insuredStreet = insuredStreet;
	}

	public String getInsuredCity() {
		return insuredCity;
	}

	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}

	public String getInsuredState() {
		return insuredState;
	}

	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}

	public Long getInsuredZip() {
		return insuredZip;
	}

	public void setInsuredZip(Long insuredZip) {
		this.insuredZip = insuredZip;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account(String insuredName, String insuredStreet, String insuredCity, String insuredState, Long insuredZip,
			String userName, Integer accountNumber) {
		super();
		this.insuredName = insuredName;
		this.insuredStreet = insuredStreet;
		this.insuredCity = insuredCity;
		this.insuredState = insuredState;
		this.insuredZip = insuredZip;
		this.userName = userName;
		this.accountNumber = accountNumber;
	}

}
