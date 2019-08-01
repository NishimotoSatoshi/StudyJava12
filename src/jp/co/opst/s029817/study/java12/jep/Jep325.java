package jp.co.opst.s029817.study.java12.jep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

/**
 * JEP 325: Switch Expressions (Preview).
 */
public class Jep325 {

	public static enum Types {
		FOO, BAR, BAZ
	}

	@Test
	public void testSwitchExpressionsOfInteger() {
		@SuppressWarnings("preview") Function<Integer, String> tested = arg -> switch (arg) {
			case 0 -> "zero";
			case 1 -> "one";
			case 2 -> "two";
			case 3, 4, 5, 6, 7, 8, 9 -> "under ten";
			default -> "other";
		};

		assertEquals("other", tested.apply(-1));
		assertEquals("zero", tested.apply(0));
		assertEquals("one", tested.apply(1));
		assertEquals("two", tested.apply(2));
		assertEquals("under ten", tested.apply(3));
		assertEquals("under ten", tested.apply(4));
		assertEquals("under ten", tested.apply(5));
		assertEquals("under ten", tested.apply(6));
		assertEquals("under ten", tested.apply(7));
		assertEquals("under ten", tested.apply(8));
		assertEquals("under ten", tested.apply(9));
		assertEquals("other", tested.apply(10));
	}

	@Test
	public void testSwitchExpressionsOfEnum() {
		@SuppressWarnings("preview") Function<Types, String> tested = arg -> switch (arg) {
			case FOO -> "ふー";
			case BAR -> "ばー";
			case BAZ -> "ばず";
		};

		assertEquals("ふー", tested.apply(Types.FOO));
		assertEquals("ばー", tested.apply(Types.BAR));
		assertEquals("ばず", tested.apply(Types.BAZ));
	}
}
