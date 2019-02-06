package com.cg.oiqgs.presentation;

import java.util.ArrayList;
import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Policy;
import com.cg.oiqgs.service.InsuranceQuotesService;
import com.cg.oiqgs.service.InsuranceQuotesServiceImpl;

public class PolicyClass {

	public static void main(String[] args) throws OiqgsException {
		String userName = "admin";
		 //String user="hasee";
		
		
		List<Policy> list=new ArrayList<>();
		
		InsuranceQuotesService service = new InsuranceQuotesServiceImpl() ;
		list=service.viewPolicies();
		
		
		System.out.println("businessSegment"+" "+"policyNumber"+" "+"policyPremium"+" "+"accountNumber");
		
		for(Policy policy:list) {
			System.out.println(policy.getBusinessSegment()+" "+policy.getPolicyNumber()+" "+policy.getPolicyPremium()+" "+policy.getAccountNumber());
			
		}
		
		
	}
}
