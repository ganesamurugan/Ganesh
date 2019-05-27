package com.app.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.HomePageObjects;

public class HomePageTest {
    
    HomePageObjects hp;

    int random=new Random().nextInt(500000);
    String email="ganesh"+random+"@gmail.com";
		public HomePageTest()
		{
			hp=new HomePageObjects();
		}
		
		//Verify Women tab is displayed on Home Page
		@Test()
		public void verifyWomenTab()
		{
			String tabName=hp.getTxtWomenTab();
			//System.out.println(tabName);
			Assert.assertTrue(tabName.contains("WOMEN"), "Women Tab is not present on home page");
		}
		
		//Verify Dresses tab is displayed on Home Page

		@Test()
			public void verifyDressesTab()
			{
				String dresstabname=hp.getDressesTab();
				Assert.assertTrue(dresstabname.contains("DRESSES"), "Dress tab is not present on home page");
			}

				//Verify T-shirt tab is displayed on Home Page
				@Test()
				public void verifyTshirtsTab() {
				String tshirttabname=hp.getTshirttab();
				Assert.assertTrue(tshirttabname.contains("T-SHIRTS"),"T-Shirts tab is not present on home page");
				}
			
				//Verifying the page navigated corresponding women page
				@Test()
				public void pageNavigatedToWomenTab()
				{
					String str=hp.getTxtWomentitle();
					Assert.assertTrue(hp.getTxtWomentitle().contains("Women"), "The page navigated wrongly");
				}
				
				//Verifying the page navigated corresponding Dresses page
				@Test()
				public void pageNavigatedToDressPage()
				{
					String title=hp.getTxtDresstitle();
					Assert.assertTrue(title.contains("Dress"), "The page navigated wrongly");
				}
				
				//Verifying the page navigated corresponding Tshirts page
				@Test
				public void pageNavigatedToTshirtPage()
				{
					String title=hp.getTxtTshirttitle();
					Assert.assertTrue(title.contains("T-shirts"), "The page navigated wrongly");
					}

				//Verify Subscription message is displayed after entering valid e-mail in Newsletter
				@Test
				public void verifySubscription()
				{
				hp.setNewsLetter(email);
				String msg=hp.getTxtNewsletterMessage();
				Assert.assertTrue(msg.contains("successfully"), "Subscription message not displayed");
				}

}