package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.DressesPageObjects;
import com.app.pages.HomePageObjects;
import com.app.pages.ProductDetailPageObject;

public class ProductDetailPageTest {

	ProductDetailPageObject pdp;
	public ProductDetailPageTest()
	{
		pdp=new ProductDetailPageObject();	
	}
	
	//	Verifying Twitter icon is present on product details page

	@Test(enabled=true)
	public void verifyTweetIsPresent()
	{	
		Assert.assertTrue(pdp.tweetDisplayOnProductPage(), "Tweeter icon not available");
	}
	
	//	Verifying facebook icon is present on product details page
	
	@Test(enabled=true)
	public void verifyFaceBookIsPresent()
	{	
		Assert.assertTrue(pdp.faceBookDisplayOnProductPage(), "facebook icon not available");
	}
	@Test
	//	Verifying Product Description is displayed
	public void verifyDescription()
	{	
		Assert.assertTrue(pdp.getDescriptionContent().contains("Faded short sleeve"), "");
	}

}
