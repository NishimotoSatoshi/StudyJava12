package jp.co.opst.s029817.study.java12.jep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

/**
 * JEP 325: Switch Expressions (Preview)
 * 
 * <p>
 * switch式。"JEP 354: Switch Expressions (Preview)" (ターゲットはJava13) に更新された。
 * </p>
 * 
 * <p>
 * 現在はプレビューなので、使用する時は、プレビューを有効にするスイッチをコンパイラに指定する必要がある。
 * Eclipseの場合は、プロジェクト・プロパティのJavaコンパイラにある
 * 「プレビュー機能を有効にする」にチェックを入れればよい。
 * また、プレビュー警告が発生するが、{@code @SuppressWarnings("preview")} で抑制することができる。
 * </p>
 * 
 * <ul>
 * <li>{@code null} を検査することはできない。</li>
 * <li>{@code default} の指定は必須。</li>
 * <li>各ケースは完全に独立しているので、{@code break} は記述しない。</li>
 * <li>複数の値に対応するケースを記述する時は、{@code case} に複数の値をカンマで区切って列挙する。</li>
 * </ul>
 */
public class Jep325 {

	/**
	 * switch式をテストする。
	 */
	@Test
	public void testSwitchExpressions() {
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
}
