package io.railflow.demo.test.junit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import io.railflow.annotations.junit.CurrentTest;

public class PizzaOrderTest {

	@Test
	public void orderPizza() {
		System.out.println("Pizza ordered");
	}

	@Test
	public void orderPizzaFailTypeNotSet() {
		System.out.println("Pizza type not set");
	}

	@Test
	public void setPizzaTypeMargherita() {
		System.out.println("Pizza margherita");
	}

	@Test
	public void setPizzaToppingCheese() {
		CurrentTest.setTestrailIds(48682);
		System.out.println("Pizza topping - cheese");
	}

	@Test
	public void orderPizzaFailNoCreditCard() throws IOException {
		CurrentTest.addAttachment("test.txt", "whatever".getBytes(StandardCharsets.UTF_8));
		System.out.println("No credit card");
	}
}
