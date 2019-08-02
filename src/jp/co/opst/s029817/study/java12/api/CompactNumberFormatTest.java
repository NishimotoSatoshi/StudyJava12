package jp.co.opst.s029817.study.java12.api;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class CompactNumberFormatTest {

	@Test
	public void whenUsShort() {
		NumberFormat tested = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		assertEquals("1", tested.format(1L));
		assertEquals("10", tested.format(10L));
		assertEquals("100", tested.format(100L));
		assertEquals("1K", tested.format(1_000L));
		assertEquals("10K", tested.format(10_000L));
		assertEquals("100K", tested.format(100_000L));
		assertEquals("1M", tested.format(1_000_000L));
		assertEquals("10M", tested.format(10_000_000L));
		assertEquals("100M", tested.format(100_000_000L));
		assertEquals("1B", tested.format(1_000_000_000L));
		assertEquals("10B", tested.format(10_000_000_000L));
		assertEquals("100B", tested.format(100_000_000_000L));
		assertEquals("1T", tested.format(1_000_000_000_000L));
		assertEquals("10T", tested.format(10_000_000_000_000L));
		assertEquals("100T", tested.format(100_000_000_000_000L));
		assertEquals("1000T", tested.format(1_000_000_000_000_000L));
	}

	@Test
	public void whenUsLong() {
		NumberFormat tested = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		assertEquals("1", tested.format(1L));
		assertEquals("10", tested.format(10L));
		assertEquals("100", tested.format(100L));
		assertEquals("1 thousand", tested.format(1_000L));
		assertEquals("10 thousand", tested.format(10_000L));
		assertEquals("100 thousand", tested.format(100_000L));
		assertEquals("1 million", tested.format(1_000_000L));
		assertEquals("10 million", tested.format(10_000_000L));
		assertEquals("100 million", tested.format(100_000_000L));
		assertEquals("1 billion", tested.format(1_000_000_000L));
		assertEquals("10 billion", tested.format(10_000_000_000L));
		assertEquals("100 billion", tested.format(100_000_000_000L));
		assertEquals("1 trillion", tested.format(1_000_000_000_000L));
		assertEquals("10 trillion", tested.format(10_000_000_000_000L));
		assertEquals("100 trillion", tested.format(100_000_000_000_000L));
		assertEquals("1000 trillion", tested.format(1_000_000_000_000_000L));
	}

	@Test
	public void whenJapanShort() {
		NumberFormat tested = NumberFormat.getCompactNumberInstance(Locale.JAPAN , NumberFormat.Style.SHORT);
		assertEquals("1", tested.format(1L));
		assertEquals("10", tested.format(10L));
		assertEquals("100", tested.format(100L));
		assertEquals("1,000", tested.format(1_000L));
		assertEquals("1万", tested.format(10_000L));
		assertEquals("10万", tested.format(100_000L));
		assertEquals("100万", tested.format(1_000_000L));
		assertEquals("1000万", tested.format(10_000_000L));
		assertEquals("1億", tested.format(100_000_000L));
		assertEquals("10億", tested.format(1_000_000_000L));
		assertEquals("100億", tested.format(10_000_000_000L));
		assertEquals("1000億", tested.format(100_000_000_000L));
		assertEquals("1兆", tested.format(1_000_000_000_000L));
		assertEquals("10兆", tested.format(10_000_000_000_000L));
		assertEquals("100兆", tested.format(100_000_000_000_000L));
		assertEquals("1000兆", tested.format(1_000_000_000_000_000L));
	}

	@Test
	public void whenJapanLong() {
		NumberFormat tested = NumberFormat.getCompactNumberInstance(Locale.JAPAN , NumberFormat.Style.LONG);
		assertEquals("1", tested.format(1L));
		assertEquals("10", tested.format(10L));
		assertEquals("100", tested.format(100L));
		assertEquals("1,000", tested.format(1_000L));
		assertEquals("1万", tested.format(10_000L));
		assertEquals("10万", tested.format(100_000L));
		assertEquals("100万", tested.format(1_000_000L));
		assertEquals("1000万", tested.format(10_000_000L));
		assertEquals("1億", tested.format(100_000_000L));
		assertEquals("10億", tested.format(1_000_000_000L));
		assertEquals("100億", tested.format(10_000_000_000L));
		assertEquals("1000億", tested.format(100_000_000_000L));
		assertEquals("1兆", tested.format(1_000_000_000_000L));
		assertEquals("10兆", tested.format(10_000_000_000_000L));
		assertEquals("100兆", tested.format(100_000_000_000_000L));
		assertEquals("1000兆", tested.format(1_000_000_000_000_000L));
	}
}
