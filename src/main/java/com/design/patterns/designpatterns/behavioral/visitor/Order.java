package com.design.patterns.designpatterns.behavioral.visitor;


import java.util.ArrayList;
import java.util.List;

public class Order implements AtvPart {

	List<AtvPart> atvPartList = new ArrayList<>();


	public List<AtvPart> getAtvPartList() {
		return atvPartList;
	}

	public void addParts(AtvPart atvPart) {
		this.atvPartList.add(atvPart);
	}

	@Override
	public void accept(AtvPartVisitor visitor) {
		for(AtvPart atvPart: atvPartList){
			atvPart.accept(visitor);
		}
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Order{" +
				"atvPartList=" + atvPartList +
				'}';
	}
}
