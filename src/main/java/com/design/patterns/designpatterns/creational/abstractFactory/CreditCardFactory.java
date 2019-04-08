package com.design.patterns.designpatterns.creational.abstractFactory;

import com.design.patterns.designpatterns.creational.abstractFactory.model.CardType;
import com.design.patterns.designpatterns.creational.abstractFactory.model.CreditCard;
import com.design.patterns.designpatterns.creational.abstractFactory.validator.Validator;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
			if(creditScore > 650) {
				return new AmexFactory();
			} else {
				return new VisaFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);


	public abstract Validator getValidator(CardType cardType);
}
