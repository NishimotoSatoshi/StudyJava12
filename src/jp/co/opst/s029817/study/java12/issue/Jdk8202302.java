package jp.co.opst.s029817.study.java12.issue;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

/**
 * JDK-8202302: (fs) New Files.mismatch method for comparing files.
 */
public class Jdk8202302 {

	@Test
	public void testFilesMismatch() throws Exception {
		String basePath = Jdk8202302.class.getName().replace('.', '/');
		Path path1 = Paths.get(ClassLoader.getSystemResource(basePath + "_1.txt").toURI());
		Path path2 = Paths.get(ClassLoader.getSystemResource(basePath + "_2.txt").toURI());
		assertEquals(3, Files.mismatch(path1, path2));
	}
}
