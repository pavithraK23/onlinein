package com.cg.oiqgs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Account;
import com.cg.oiqgs.model.Policy;
import com.cg.oiqgs.model.PolicyDetails;
import com.cg.oiqgs.utility.JdbcUtility;

public class InsuranceQuotesDaoImpl implements InsuranceQuotesDao {

	Connection connection = null;
	Statement state = null;
	PreparedStatement statement = null;
	ResultSet resultSet = null;

	@Override
	public boolean getvalidationDetails(String insuredName, String insuredStreet, String insuredCity,
			String insuredState, Long insuredZip) throws OiqgsException {

		connection = JdbcUtility.getConnection();
		boolean result = true;
		try {

			statement = connection.prepareStatement(QueryMapper.validateDetails);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString("INSURED_NAME");
				int zip = resultSet.getInt("INSURED_ZIP");
				String street = resultSet.getString("INSURED_STREET");
				String city = resultSet.getString("INSURED_CITY");

				if (name.equals(insuredName) && zip == insuredZip && street.equals(insuredStreet)
						&& city.equals(insuredCity)) {
					result = false;

				}

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return result;

	}

	@Override
	public int insertAccountDetails(Account account) throws OiqgsException {

		connection = JdbcUtility.getConnection();
		long accountnumber = 0;
		int result = 0;

		try {
			statement = connection.prepareStatement(QueryMapper.InsertQuery);
			statement.setString(1, account.getInsuredName());
			statement.setString(2, account.getInsuredStreet());
			statement.setString(3, account.getInsuredCity());
			statement.setString(4, account.getInsuredState());
			statement.setLong(5, account.getInsuredZip());
			statement.setString(6, account.getUserName());
			
			result = statement.executeUpdate();

			statement = connection.prepareStatement(QueryMapper.viewAccount);

			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				accountnumber = resultSet.getLong(1);

			}
			System.out.println("your account number is " + accountnumber);

		} catch (SQLException e) {

			throw new OiqgsException("prepare statement not created");
		} finally {

			try {
				statement.close();

			} catch (SQLException e) {
				throw new OiqgsException("statement not closed");

			}

			try {
				connection.close();

			} catch (SQLException e) {
				throw new OiqgsException("connection not closed");
			}

		}

		return result;
	}

	@Override
	public List<Policy> viewPolicies() throws OiqgsException {

		connection = JdbcUtility.getConnection();
		List<Policy> list = new ArrayList<>();

		try {
			statement = connection.prepareStatement(QueryMapper.selectAllPolicies);
			statement.setString(1, "admin");
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				//user = "admin";
				String businessSegment = resultSet.getString(1);

				int policyNumber = resultSet.getInt(2);
				Double policyPremium = resultSet.getDouble(3);
				int accountNumber = resultSet.getInt(4);

				Policy policy = new Policy();
				policy.setBusinessSegment(businessSegment);
				policy.setPolicyNumber(policyNumber);
				policy.setPolicyPremium(policyPremium);
				policy.setAccountNumber(accountNumber);
				list.add(policy);

			}

		} catch (SQLException e) {
			
			throw new OiqgsException("prepare statement not created");
			
		}
		try {
			statement.close();

		} catch (SQLException e) {
			throw new OiqgsException("statement not closed");

		}

		try {
			connection.close();

		} catch (SQLException e) {
			throw new OiqgsException("connection not closed");
		}

		return list;

	}

}
