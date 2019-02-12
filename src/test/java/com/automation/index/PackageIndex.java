package com.automation.index;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.indexpage.PackageIndexpage;
import com.automation.init.SeleniumInit;
import com.automation.utility.Common;
import com.automation.utility.Common_demo;
import com.automation.utility.TestData;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PackageIndex extends SeleniumInit {

	public static int step, numberOfFailure = 1;
	SoftAssert softassertion = new SoftAssert();
	public static com.aventstack.extentreports.ExtentTest logger;
	public static ExtentTest test_package;
	public static void getTest(ExtentTest test) {
		// TODO Auto-generated method stub
		test_package = test;
		System.out.println("Get Test Method called");
		//test.log(LogStatus.INFO, "Step 5");
		test_package.log(LogStatus.INFO, "Step 5");
	}
	
	public static void getlogger(com.aventstack.extentreports.ExtentTest parent) {
		// TODO Auto-generated method stub
		logger = parent;
	}


	@Test
	public void TC_SignUp_01() {
		step = 1;
		numberOfFailure = 0;

		Common.logcase(" ");

		Common.logcase("TEST CASE:TC_SignUp_01:: To verify That user is able to SignUp with the valid details");
		
		test_package.log(LogStatus.INFO, "TEST CASE:TC_SignUp_01:: To verify That user is able to SignUp with the valid details");

		Common.logstep("Step" + (step++) + ": Open the Url---> https://staging.3dbroadcastsales.com/");
		
		test_package.log(LogStatus.INFO,"Step" + (step++) + ": Open the Url---> https://staging.3dbroadcastsales.com/");
		
		if (packageVerification.homepageverify()) {
			Common.logveri("-----> 3dbroadcastsales home page open <-----");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			Common.logveri("-----> 3dbroadcastsales home page not open <-----");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "SignUpFailed");
		}

		Common.logstep("Step" + (step++) + ": Click on the SignUp menu");
		packageVerification = packageIndexpage.click_signUp_menu();

		Common.logstep("Step" + (step++) + ": Enter the Details for the SignUp");
		packageVerification = packageIndexpage.sign_up_details();

		Common.logstep("Step" + (step++) + ": Click on SignUp button");
		packageVerification = packageIndexpage.signup_buton();

		Common.logstep("Step" + (step++) + ": User Sign Up verification.");

		if (packageVerification.accountverification()) {

			Common.logStatus("Pass");
			Common.AssertPassed();
			TestData.SheetResultcellupdate(1, 3, "Pass");
			Assert.assertTrue(true);

		} else {
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "SignUpFailed");
			TestData.SheetResultcellupdate(1, 3, "Failed");
			Assert.assertTrue(false);
		}

	}// End of TC_SignUp_01 function

	@Test
	public void TC_LogIn_02() {
		step = 1;

		Common.logcase(" ");

		Common.logcase("TEST CASE:TC_LogIn_02::To verify That user is able to Login with the valid details");
		
		test_package.log(LogStatus.INFO, "TEST CASE:TC_LogIn_02::To verify That user is able to Login with the valid details");

		Common.logstep("Step" + (step++) + ": Open the Url---> https://staging.3dbroadcastsales.com/");
		
		logger.log(Status.INFO, "Open the Url---> https://staging.3dbroadcastsales.com/");
		
		test_package.log(LogStatus.INFO,"Step\" + (step++) + \": Open the Url---> https://staging.3dbroadcastsales.com/");
		
		
		if (packageVerification.homepageverify()) {
			Common.logveri("-----> 3dbroadcastsales home page open <-----");
			test_package.log(LogStatus.INFO,"-----> 3dbroadcastsales home page open <-----");
			logger.log(Status.INFO, "-----> 3dbroadcastsales home page open <-----");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			Common.logveri("-----> 3dbroadcastsales home page  not open <-----");
			test_package.log(LogStatus.INFO,"-----> 3dbroadcastsales home page not open <-----");
			logger.log(Status.INFO, "-----> 3dbroadcastsales home page not open <-----");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "LoginFailed");
		}

		Common.logstep("Step" + (step++) + ": Click on the Login menu");
		
		test_package.log(LogStatus.INFO,"Step\" + (step++) + \": Click on the Login menu");
		
		logger.log(Status.INFO, ": Click on the Login menu");
		
		packageVerification = packageIndexpage.click_login_menu();

		Common.logstep("Step" + (step++) + ": Enter the Details for Login");
		
		test_package.log(LogStatus.INFO,"Step\" + (step++) + \": Enter the Details for Login");
		
		logger.log(Status.INFO, ": Enter the Details for Login");
		
		packageVerification = packageIndexpage.login_details();

		Common.logstep("Step" + (step++) + ": Click on Login button");
		
		test_package.log(LogStatus.INFO,"Step\" + (step++) + \": Click on Login button");
		
		logger.log(Status.INFO, ": Click on Login button");
		
		packageVerification = packageIndexpage.login_buton();

		Common.logstep("Step" + (step++) + ": User Login verification.");
		
		test_package.log(LogStatus.INFO,"Step\" + (step++) + \": User Login verification.");
		
		logger.log(Status.INFO, ": User Login verification.");

		if (packageVerification.logindetailsverification()) {
			System.out.println("Test Pass.......");
			TestData.SheetResultcellupdate(2, 3, "Pass");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else 
		{
			System.out.println("Test Failed.......");
			TestData.SheetResultcellupdate(2, 3, "Failed");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "LoginFailed");
			Assert.assertTrue(false);
		}

	}// End of TC_LogIn_02 function

	@Test
	public void TC_Menu_Page_03() {
		step = 1;
		int flag = 0;
		Common.logcase(" ");

		Common.logcase("TEST CASE:TC_Menu_Page_03::Verify Any Menu page with Below Functionality.");
		Common.logcase("• Shopping options");
		Common.logcase("• Sort By");
		Common.logcase("• Show per page");

		Common.logstep("Step" + (step++) + ": Open the Url---> https://staging.3dbroadcastsales.com/");

		if (packageVerification.homepageverify()) {
			Common.logveri("-----> 3dbroadcastsales home page open <-----");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			Common.logveri("-----> 3dbroadcastsales home page not open <-----");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_HomePage_open_Failed");
		}

		Common.logstep("Step" + (step++) + ": Mouse Hover on [Cameras] menu");
		packageVerification = packageIndexpage.cameras();

		Common.logstep("Step" + (step++) + ": Click on [Cinematic Cameras]sub menu");
		packageVerification = packageIndexpage.cinematic_cameras();

		if (packageVerification.pageandproductdetailsverification()) {
			System.out.println("Test Pass.......");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_Product_Details_Failed");
			// Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}

		Common.logstep("Step" + (step++) + ": Click on any [Category]");
		packageVerification = packageIndexpage.category();

		if (packageVerification.category_shoping_option()) {
			System.out.println("Test Pass.......");
			Common.logStatus("Pass");
			Common.AssertPassed();
			// Assert.assertTrue(true);
			softassertion.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_Category_Failed");
			// Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}

		Common.logstep("Step" + (step++) + ": Click on any [Manufacturer]");
		packageVerification = packageIndexpage.manufacturer();

		if (packageVerification.Manufacturer_shoping_option()) {
			System.out.println("Test Pass.......");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_Manufacture_Failed");
			// Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}

		Common.logstep("Step" + (step++) + ": Click on Sort By option : Price : Ascending");
		packageVerification = packageIndexpage.sortby_asc();

		if (packageVerification.sortby_ascending()) {
			System.out.println("Test Pass.......");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_sortby_ascending_Failed");
			// Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}
		
		Common.logstep("Step" + (step++) + ": Click on Sort By option : Price : Descending ");
		
		packageVerification = packageIndexpage.sortby_Desc();

		if (packageVerification.sortby_descending()) {
			System.out.println("Test Pass.......");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_sortby_descending_Failed");
			// Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}
		
		
        Common.logstep("Step" + (step++) + ": Click on Show per Page");
		
		packageVerification = packageIndexpage.showperpage();

		if (packageVerification.showperpage_verified()) {
			System.out.println("Test Pass.......");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_show_per_page_Failed");
			// Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}
		
		if (flag > 0) {
			TestData.SheetResultcellupdate(3, 3, "Failed");
			System.out.println("Test Failed.......");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "MenuPage_Failed");
			Assert.assertTrue(false);
			
		}
		else
			TestData.SheetResultcellupdate(3, 3, "Pass");
		// softassertion.assertAll();
	}// End of TC_Menu_Page_03 function

	@Test
	public void TC_Wish_Compare_04() {
		
		
		step = 1;
		int flag = 0;
		Common.logcase(" ");

		Common.logcase("TEST CASE:TC_Wish_Compare_04::Verify User is able to add/remove the Products into Wish List and Compare List");

		Common.logstep("Step" + (step++) + ": Open the Url---> https://staging.3dbroadcastsales.com/");

		if (packageVerification.homepageverify()) {
			Common.logveri("-----> 3dbroadcastsales home page open <-----");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			Common.logveri("-----> 3dbroadcastsales home page not open <-----");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "LoginFailed");
		}

		Common.logstep("Step" + (step++) + ": Click on the Login menu");
		packageVerification = packageIndexpage.click_login_menu();

		Common.logstep("Step" + (step++) + ": Enter the Details for Login");
		packageVerification = packageIndexpage.login_details();

		Common.logstep("Step" + (step++) + ": Click on Login button");
		packageVerification = packageIndexpage.login_buton();

		Common.logstep("Step" + (step++) + ": User Login verification.");

		if (packageVerification.logindetailsverification()) {
			System.out.println("Test Pass.......");
			//TestData.SheetResultcellupdate(3, 3, "Pass");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			//TestData.SheetResultcellupdate(3, 3, "Failed");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "LoginFailed");
			//Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}
		
		Common.logstep("Step" + (step++) + ": Mouse Hover on [Cameras] menu");
		packageVerification = packageIndexpage.cameras();

		Common.logstep("Step" + (step++) + ": Click on [Cinematic Cameras]sub menu");
		packageVerification = packageIndexpage.cinematic_cameras();
		
		Common.logstep("Step" + (step++) + ": Add Two Products to WishList");
		packageVerification = packageIndexpage.addtowishlist();
		
		Common.logstep("Step" + (step++) + ": Go To to WishList");
		packageVerification = packageIndexpage.gotowishlist();
		
		if (packageVerification.wishlist_verification()) {
			System.out.println("Test Pass.......");
			//TestData.SheetResultcellupdate(3, 3, "Pass");
			Common.logStatus("Pass");
			Common.AssertPassed();
			Assert.assertTrue(true);
		} else {
			flag++;
			System.out.println("Test Failed.......");
			//TestData.SheetResultcellupdate(3, 3, "Failed");
			Common.logStatus("Fail");
			Common.AssertFailed();
			Common.makeScreenshot(driver, "LoginFailed");
			//Assert.assertTrue(false);
			softassertion.assertTrue(false);
		}

		if (flag > 0) {
			TestData.SheetResultcellupdate(4, 3, "Failed");
		}
		else
			TestData.SheetResultcellupdate(4, 3, "Pass");
	}//End of TC_Wish_Compare_04 function
	
}// End of Class
