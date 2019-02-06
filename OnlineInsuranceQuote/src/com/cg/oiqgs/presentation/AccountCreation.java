package com.cg.oiqgs.presentation;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Account;
import com.cg.oiqgs.service.InsuranceQuotesService;
import com.cg.oiqgs.service.InsuranceQuotesServiceImpl;

public class AccountCreation {

	public static void main(String[] args) throws OiqgsException {
		boolean menuFlag = false;
		boolean doFlag = false;
		String insuredName;
		String insuredStreet;
		String insuredCity;
		String insuredState;
		long insuredZip;
		String userName ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome To Online Insurance Account Creation");

		InsuranceQuotesService service = new InsuranceQuotesServiceImpl();

		do {
			scanner = new Scanner(System.in);
			System.out.println("Enter your Name");
			insuredName = scanner.nextLine();
			String regName = "[A-Za-z]*";
			boolean valid = Pattern.matches(regName, insuredName);
			if (valid == false) {
				System.err.println("enter valid name");
			} else {
				doFlag = true;
			}

		} while (!doFlag);
		doFlag = false;

		do {
			scanner = new Scanner(System.in);

			System.out.println("Enter your Streetname");
			insuredStreet = scanner.nextLine();
			String regStreet = "[A-Za-z0-9]*";
			boolean valid = Pattern.matches(regStreet, insuredStreet);
			if (valid == false) {
				System.err.println("enter valid street");
			} else {
				doFlag = true;
			}

		} while (!doFlag);
		doFlag = false;

		do {
			scanner = new Scanner(System.in);

			System.out.println("Enter your City");
			insuredCity = scanner.nextLine();
			String regCity = "[A-Za-z]*";
			boolean valid = Pattern.matches(regCity, insuredCity);
			if (valid == false) {
				System.err.println("enter valid city");
			} else {
				doFlag = true;
			}

		} while (!doFlag);
		doFlag = false;

		do {
			scanner = new Scanner(System.in);

			System.out.println("Enter  your State");
			insuredState = scanner.nextLine();
			String regState = "[A-Za-z]*";
			boolean valid = Pattern.matches(regState, insuredState);
			if (valid == false) {
				System.err.println("enter valid state");
			} else {
				doFlag = true;
			}

		} while (!doFlag);
		doFlag = false;

		
		
		
do {
	scanner=new Scanner(System.in);
	try{	
		System.out.println("Enter your postal code");
		
		insuredZip = scanner.nextInt();

		boolean validatezip = service.getvalidationzip(insuredZip);
	
		if (validatezip == false) {
			
			System.err.println("postal code should contain only 5 digits AND should not start with zero");
			
		} else {

			boolean validDetails = service.getvalidationDetails(insuredName, insuredStreet, insuredCity, insuredState,
					insuredZip);

			if (validDetails == true) {
				doFlag = true;
				scanner.nextLine();
				
				System.out.println("enter user name");
				String userName1= scanner.nextLine();
				
				
				
				Account account = new Account();
				account.setInsuredName(insuredName);
				account.setInsuredStreet(insuredStreet);
				account.setInsuredCity(insuredCity);
				account.setInsuredState(insuredState);
				account.setInsuredZip(insuredZip);
				account.setUserName(userName1);
				
			
				try {
					int result = service.insertAccountDetails(account);
					System.out.println(result + "inserted");

				} catch (OiqgsException e) {
					System.out.println(e.getMessage());

				}
			} else {
				
				
				System.err.println("we cant create more than one account for same user");
				
			}
			}
		}catch(InputMismatchException e) {
			System.err.println("enter only digits");
		}
	
}while(!doFlag);
doFlag = false;


	}

}
