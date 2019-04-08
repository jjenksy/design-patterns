package com.design.patterns.designpatterns.creational.factory;

import com.design.patterns.designpatterns.creational.factory.models.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	protected List<Page> pages = new ArrayList();


	public Website() {
		this.createWebSite();
	}

	public abstract void createWebSite();

	public List<Page> getPages() {
		return pages;
	}
}
