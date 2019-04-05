package com.design.patterns.designpatterns.abstractFactory;

import com.design.patterns.designpatterns.abstractFactory.model.*;
import com.design.patterns.designpatterns.abstractFactory.validator.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {

		switch (cardType){
			case GOLD: {
				return new AmexGold();
			}
			case PLATINUM: {
				return new AmexPlat();
			}
			default: {
				return null;
			}

		}
	}

	//todo implement
	@Override
	public Validator getValidator(CardType cardType) {
		return null;
	}
}
