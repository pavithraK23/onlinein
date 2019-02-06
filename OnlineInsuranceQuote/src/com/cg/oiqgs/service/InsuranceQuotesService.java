package com.cg.oiqgs.service;

import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Account;
import com.cg.oiqgs.model.Policy;
import com.cg.oiqgs.model.PolicyDetails;
import com.cg.oiqgs.presentation.PolicyClass;

public interface InsuranceQuotesService {

	int insertAccountDetails(Account account) throws OiqgsException;

	List<Policy> viewPolicies() throws OiqgsException;

	boolean getvalidationDetails(String insuredName, String insuredStreet, String insuredCity, String insuredState,
			Long insuredZip) throws OiqgsException;

	boolean getvalidationzip(Long insuredZip) throws OiqgsException;

}
