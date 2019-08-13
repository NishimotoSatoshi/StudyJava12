package jp.co.opst.s029817.study.java12.issue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * JDK-8203703: String::transform.
 */
public class Jdk8203703 {

	@Test
	public void testStringTransform() {
		assertEquals("[1]", processB(processA("1")));
		assertEquals("[1]", "1".transform(this::processA).transform(this::processB));
	}

	private String processA(String string) {
		return "[" + string;
	}

	private String processB(String string) {
		return string + "]";
	}
}
