package jp.co.opst.s029817.study.java12.issue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class Jdk8209685 {

	public static final class Result {

		public final Set<Integer> evens;
		public final Set<Integer> odds;

		public Result(Set<Integer> evens, Set<Integer> odds) {
			this.evens = evens;
			this.odds = odds;
		}
	}

	@Test
	public void testCollectorsTeeing() {

		var result =  IntStream.range(0, 10).boxed().collect(Collectors.teeing(
				Collectors.filtering(t -> t % 2 == 0, Collectors.toUnmodifiableSet()),
				Collectors.filtering(t -> t % 2 != 0, Collectors.toUnmodifiableSet()),
				Result::new));

		assertEquals(Set.of(0, 2, 4, 6, 8), result.evens);
		assertEquals(Set.of(1, 3, 5, 7, 9), result.odds);
	}
}
