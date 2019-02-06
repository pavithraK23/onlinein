package com.cg.oiqgs.presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.service.InsuranceQuotesService;
import com.cg.oiqgs.service.InsuranceQuotesServiceImpl;

public class UserInterface {

	public static void main(String[] args) throws OiqgsException {
		boolean menuFlag = false;
		boolean doFlag = false;
		String userName = "user";

		do {

			Scanner scanner = new Scanner(System.in);
			System.out.println(".....Online Insurance Quote  Generation...");
			System.out.println("1.Account Creation");
			System.out.println("2.View Your Policy Details ");
			System.out.println("3.Exit");
			System.out.println("Select your Choice");
			int choices;
			try {
				choices = scanner.nextInt();
				if (choices > 0 && choices < 4) {
					menuFlag = true;
					switch (choices) {
					case 1:

						AccountCreation account = new AccountCreation();
						account.main(null);

						break;

					case 2:

						PolicyClass policy = new PolicyClass();
						policy.main(null);

						break;
					case 3:

						System.out.println("you are exited..");
						System.exit(0);
						break;

					default:
						System.err.println("Invalid Selection Try Again");
						System.out.println();
						menuFlag = false;
						break;
					}
				} else {
					System.err.println("PLEASE ENTER VALID OPTION RANGE(1-4)");
					menuFlag = false;
					System.out.println("Select your choices : ");
				}

			} catch (InputMismatchException e) {
				System.err.println("INPUT MUST BE INTEGER");
				menuFlag = false;
				System.out.println();

			}

		} while (!menuFlag);

	}

}
