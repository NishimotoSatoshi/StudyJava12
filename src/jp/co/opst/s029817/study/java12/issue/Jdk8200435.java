package jp.co.opst.s029817.study.java12.issue;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

/**
 * JDK-8200435: String::align, String::indent.
 */
public class Jdk8200435 {

	@Test
	public void testStringIndent() {
		String target = 
				"Title\n" +
				"\r\n" +
				"  Chapter1\n" +
				"    body1\r\n" +
				"\n" +
				"  Chapter2\r\n" +
				"    body2\n";

		String expectedWhen0 = 
				"Title\n" +
				"\n" +
				"  Chapter1\n" +
				"    body1\n" +
				"\n" +
				"  Chapter2\n" +
				"    body2\n";

		String expectedWhen2 = 
				"  Title\n" +
				"  \n" +
				"    Chapter1\n" +
				"      body1\n" +
				"  \n" +
				"    Chapter2\n" +
				"      body2\n";

		String expectedWhenMinus2 = 
				"Title\n" +
				"\n" +
				"Chapter1\n" +
				"  body1\n" +
				"\n" +
				"Chapter2\n" +
				"  body2\n";

		assertEquals(expectedWhen0, target.indent(0));
		assertEquals(expectedWhen2, target.indent(2));
		assertEquals(expectedWhenMinus2, target.indent(-2));
	}
}
