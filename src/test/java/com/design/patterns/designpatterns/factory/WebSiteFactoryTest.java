package com.design.patterns.designpatterns.factory;

import com.design.patterns.designpatterns.factory.models.WebSiteType;
import org.junit.Test;

import static org.junit.Assert.*;


public class WebSiteFactoryTest {

	@Test
	public void getWebSite() {

		Website site = WebSiteFactory.getWebSite(WebSiteType.BLOG);

		System.out.println(site.getPages());

		site = WebSiteFactory.getWebSite(WebSiteType.BLOG);

		System.out.println(site.getPages());


	}
}