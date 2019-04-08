package com.design.patterns.designpatterns.creational.factory;

import com.design.patterns.designpatterns.creational.factory.models.WebSiteType;
import org.junit.Test;


public class WebSiteFactoryTest {

	@Test
	public void getWebSite() {

		Website site = WebSiteFactory.getWebSite(WebSiteType.BLOG);

		System.out.println(site.getPages());

		site = WebSiteFactory.getWebSite(WebSiteType.SHOP);

		System.out.println(site.getPages());


	}
}