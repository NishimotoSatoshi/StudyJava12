package jp.co.opst.s029817.study.java12.issue;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

/**
 * JDK-8211316: DateTimeFormatterBuilder's appendInstant() method should parse any offset provided in the input.
 */
public class Jdk8211316 {

	@Test
	public void testParseIsoOffset() {
		var datetime = "2019-08-15T14:20:30";
		var tokyoZone = ZoneId.of("Asia/Tokyo");
		var expected = ZonedDateTime.of(LocalDateTime.parse(datetime), tokyoZone).toInstant();
		var actual = Instant.from(DateTimeFormatter.ISO_INSTANT.parse(datetime + "+09:00"));
		assertEquals(expected, actual);
	}
}
