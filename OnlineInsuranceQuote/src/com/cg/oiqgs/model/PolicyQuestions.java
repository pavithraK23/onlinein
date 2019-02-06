package com.cg.oiqgs.model;

public class PolicyQuestions<Varchar> {
 
	private Varchar polQuesId;
	private Varchar polQuesSeq;
	private Varchar busSegId;
	private String polQuesDesc;
	private String polQuesAns1;
	private Integer polQuesAns1weightage;
	private String polQuesAns2;
	private Integer polQuesAns2weightage;
	private String polQuesAns3;
	private Integer polQuesAns3weightage;
	private String polQuesAns4;
	private Integer polQuesAns4weightage;
	
	public PolicyQuestions() {
		// TODO Auto-generated constructor stub
	}

	public PolicyQuestions(Varchar polQuesId, Varchar polQuesSeq, Varchar busSegId, String polQuesDesc,
			String polQuesAns1, Integer polQuesAns1weightage, String polQuesAns2, Integer polQuesAns2weightage,
			String polQuesAns3, Integer polQuesAns3weightage, String polQuesAns4, Integer polQuesAns4weightage) {
		super();
		this.polQuesId = polQuesId;
		this.polQuesSeq = polQuesSeq;
		this.busSegId = busSegId;
		this.polQuesDesc = polQuesDesc;
		this.polQuesAns1 = polQuesAns1;
		this.polQuesAns1weightage = polQuesAns1weightage;
		this.polQuesAns2 = polQuesAns2;
		this.polQuesAns2weightage = polQuesAns2weightage;
		this.polQuesAns3 = polQuesAns3;
		this.polQuesAns3weightage = polQuesAns3weightage;
		this.polQuesAns4 = polQuesAns4;
		this.polQuesAns4weightage = polQuesAns4weightage;
	}

	public Varchar getPolQuesId() {
		return polQuesId;
	}

	public void setPolQuesId(Varchar polQuesId) {
		this.polQuesId = polQuesId;
	}

	public Varchar getPolQuesSeq() {
		return polQuesSeq;
	}

	public void setPolQuesSeq(Varchar polQuesSeq) {
		this.polQuesSeq = polQuesSeq;
	}

	public Varchar getBusSegId() {
		return busSegId;
	}

	public void setBusSegId(Varchar busSegId) {
		this.busSegId = busSegId;
	}

	public String getPolQuesDesc() {
		return polQuesDesc;
	}

	public void setPolQuesDesc(String polQuesDesc) {
		this.polQuesDesc = polQuesDesc;
	}

	public String getPolQuesAns1() {
		return polQuesAns1;
	}

	public void setPolQuesAns1(String polQuesAns1) {
		this.polQuesAns1 = polQuesAns1;
	}

	public Integer getPolQuesAns1weightage() {
		return polQuesAns1weightage;
	}

	public void setPolQuesAns1weightage(Integer polQuesAns1weightage) {
		this.polQuesAns1weightage = polQuesAns1weightage;
	}

	public String getPolQuesAns2() {
		return polQuesAns2;
	}

	public void setPolQuesAns2(String polQuesAns2) {
		this.polQuesAns2 = polQuesAns2;
	}

	public Integer getPolQuesAns2weightage() {
		return polQuesAns2weightage;
	}

	public void setPolQuesAns2weightage(Integer polQuesAns2weightage) {
		this.polQuesAns2weightage = polQuesAns2weightage;
	}

	public String getPolQuesAns3() {
		return polQuesAns3;
	}

	public void setPolQuesAns3(String polQuesAns3) {
		this.polQuesAns3 = polQuesAns3;
	}

	public Integer getPolQuesAns3weightage() {
		return polQuesAns3weightage;
	}

	public void setPolQuesAns3weightage(Integer polQuesAns3weightage) {
		this.polQuesAns3weightage = polQuesAns3weightage;
	}

	public String getPolQuesAns4() {
		return polQuesAns4;
	}

	public void setPolQuesAns4(String polQuesAns4) {
		this.polQuesAns4 = polQuesAns4;
	}

	public Integer getPolQuesAns4weightage() {
		return polQuesAns4weightage;
	}

	public void setPolQuesAns4weightage(Integer polQuesAns4weightage) {
		this.polQuesAns4weightage = polQuesAns4weightage;
	}
	
	
}
