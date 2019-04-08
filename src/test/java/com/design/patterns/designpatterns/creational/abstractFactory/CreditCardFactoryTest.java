package com.design.patterns.designpatterns.creational.abstractFactory;

import com.design.patterns.designpatterns.creational.abstractFactory.model.CardType;
import com.design.patterns.designpatterns.creational.abstractFactory.model.CreditCard;
import org.junit.Test;

public class CreditCardFactoryTest {


	@Test
	public void creditCardFactory() {

		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(500);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

		System.out.println(card.getClass());


		abstractFactory = CreditCardFactory.getCreditCardFactory(700);

		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

		System.out.println(card2.getClass());
	}
}