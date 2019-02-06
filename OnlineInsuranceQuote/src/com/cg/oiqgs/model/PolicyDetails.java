package com.cg.oiqgs.model;

public class PolicyDetails {

	private Integer policyNumber;
	private String questionId;
	private String answer;
	
	public PolicyDetails() {
		// TODO Auto-generated constructor stub
	}

	public PolicyDetails(Integer policyNumber, String questionId, String answer) {
		super();
		this.policyNumber = policyNumber;
		this.questionId = questionId;
		this.answer = answer;
	}

	public Integer getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
