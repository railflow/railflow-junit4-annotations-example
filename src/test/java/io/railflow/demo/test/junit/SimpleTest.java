package io.railflow.demo.test.junit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import io.railflow.annotations.Railflow;
import io.railflow.annotations.junit.CurrentTest;

public class SimpleTest {
	@Test
	@Ignore("ignore test")
	@Railflow(title = "ignored method")
	public void testPassed() {
		System.out.println("Test passed");
	}

	@Test
	public void testFailed() throws IOException {
		CurrentTest.addAttachment("test.txt", "whatever".getBytes(StandardCharsets.UTF_8));
		CurrentTest.addAttachment("test2.txt", "whatever2".getBytes(StandardCharsets.UTF_8));
		System.out.println("Test failed");
		Assert.fail("Test failed");
	}
}
