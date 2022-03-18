package io.railflow.demo.test.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import io.railflow.annotations.Railflow;
import io.railflow.annotations.junit.RailflowJunit4Listener;

@Railflow(title = "example for registering listener")
public class LoginFormTest {
	public static void main(final String[] args) {
		final JUnitCore runner = new JUnitCore();
		runner.addListener(new RailflowJunit4Listener());
		runner.run(LoginFormTest.class);
	}

	@Test
	public void loginCorrectCredentials() {
		System.out.println("login with correct credentials");
	}

	@Test
	public void loginErrorIncorrectUserName() {
		Assert.fail("Error message was not shown");
	}

	@Test
	public void loginErrorIncorrectPassword() {
		throw new RuntimeException("Unexpected exception");
	}

	@Test
	public void loginRememberMeIsChecked() {
		System.out.println("login with remember me set to true");
	}

	@Ignore
	@Test
	public void loginFailedServiceUnavailable() {
		System.out.println("login failed");
	}

}
