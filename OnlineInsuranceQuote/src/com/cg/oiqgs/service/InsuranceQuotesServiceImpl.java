package com.cg.oiqgs.service;

import java.util.List;
import java.util.regex.Pattern;

import com.cg.oiqgs.dao.InsuranceQuotesDao;
import com.cg.oiqgs.dao.InsuranceQuotesDaoImpl;
import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Account;
import com.cg.oiqgs.model.Policy;
import com.cg.oiqgs.model.PolicyDetails;
import com.cg.oiqgs.presentation.PolicyClass;

public class InsuranceQuotesServiceImpl implements InsuranceQuotesService {

	InsuranceQuotesDao accountDao = new InsuranceQuotesDaoImpl();

	@Override
	public boolean getvalidationzip(Long insuredZip) throws OiqgsException {
		String regEx = "[1-9]{5}$";

		return Pattern.matches(regEx, insuredZip.toString());
	}

	@Override
	public int insertAccountDetails(Account account) throws OiqgsException {

		return accountDao.insertAccountDetails(account);
	}

	@Override
	public boolean getvalidationDetails(String insuredName, String insuredStreet, String insuredCity,
			String insuredState, Long insuredZip) throws OiqgsException {

		return accountDao.getvalidationDetails(insuredName, insuredStreet, insuredCity, insuredState, insuredZip);
	}

	@Override
	public List<Policy> viewPolicies() throws OiqgsException {

		return accountDao.viewPolicies();
	}

}
