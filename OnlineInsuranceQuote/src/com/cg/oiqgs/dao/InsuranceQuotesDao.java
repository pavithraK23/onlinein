package com.cg.oiqgs.dao;

import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Account;
import com.cg.oiqgs.model.Policy;
import com.cg.oiqgs.model.PolicyDetails;

public interface InsuranceQuotesDao {

	int insertAccountDetails(Account account) throws OiqgsException;

	boolean getvalidationDetails(String insuredName, String insuredStreet, String insuredCity, String insuredState,
			Long insuredZip) throws OiqgsException;

	List<Policy> viewPolicies() throws OiqgsException;

}
