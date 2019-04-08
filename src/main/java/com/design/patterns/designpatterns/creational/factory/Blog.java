package com.design.patterns.designpatterns.creational.factory;

import com.design.patterns.designpatterns.creational.factory.models.AboutPage;
import com.design.patterns.designpatterns.creational.factory.models.ContactPage;
import com.design.patterns.designpatterns.creational.factory.models.PostPage;

public class Blog extends Website {
	@Override
	public void createWebSite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new ContactPage());
	}
}
