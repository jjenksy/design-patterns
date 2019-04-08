package com.design.patterns.designpatterns.creational.factory;

import com.design.patterns.designpatterns.creational.factory.models.WebSiteType;

public class WebSiteFactory {

	public static Website getWebSite(WebSiteType siteType) {

		switch (siteType) {
			case BLOG: {
				return new Blog();
			}
			case SHOP: {
				return new Shop();
			}
			default: {
				return null;
			}
		}
	}
}
