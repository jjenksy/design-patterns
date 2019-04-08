package com.design.patterns.designpatterns.creational.abstractFactory;

import com.design.patterns.designpatterns.creational.abstractFactory.model.*;
import com.design.patterns.designpatterns.creational.abstractFactory.validator.Validator;

public class VisaFactory extends CreditCardFactory {


	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType){
			case GOLD: {
				return new VisaGold();
			}
			case PLATINUM: {
				return new VisaPlat();
			}
			default: {
				return null;
			}

		}
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return null;
	}
}
