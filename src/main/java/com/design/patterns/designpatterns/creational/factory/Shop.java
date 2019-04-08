package com.design.patterns.designpatterns.creational.factory;

import com.design.patterns.designpatterns.creational.factory.models.CartPage;
import com.design.patterns.designpatterns.creational.factory.models.ItemPage;
import com.design.patterns.designpatterns.creational.factory.models.SearchPage;

public class Shop extends Website {
	@Override
	public void createWebSite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}
}
