package com.cg.oiqgs.model;

public class ViewPolicy {

	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	private String coverage1;
	private String coverage2;
	private String coverage3;
	private String coverage4;
	private String coverage5;
	private Double proposedPremium;
	
	public ViewPolicy() {
		// TODO Auto-generated constructor stub
	}

	public ViewPolicy(String question1, String question2, String question3, String question4, String question5,
			String coverage1, String coverage2, String coverage3, String coverage4, String coverage5,
			Double proposedPremium) {
		super();
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.coverage1 = coverage1;
		this.coverage2 = coverage2;
		this.coverage3 = coverage3;
		this.coverage4 = coverage4;
		this.coverage5 = coverage5;
		this.proposedPremium = proposedPremium;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String getCoverage1() {
		return coverage1;
	}

	public void setCoverage1(String coverage1) {
		this.coverage1 = coverage1;
	}

	public String getCoverage2() {
		return coverage2;
	}

	public void setCoverage2(String coverage2) {
		this.coverage2 = coverage2;
	}

	public String getCoverage3() {
		return coverage3;
	}

	public void setCoverage3(String coverage3) {
		this.coverage3 = coverage3;
	}

	public String getCoverage4() {
		return coverage4;
	}

	public void setCoverage4(String coverage4) {
		this.coverage4 = coverage4;
	}

	public String getCoverage5() {
		return coverage5;
	}

	public void setCoverage5(String coverage5) {
		this.coverage5 = coverage5;
	}

	public Double getProposedPremium() {
		return proposedPremium;
	}

	public void setProposedPremium(Double proposedPremium) {
		this.proposedPremium = proposedPremium;
	}
	
	
	
	
	
}
