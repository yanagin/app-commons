package orz.yanagin.commons;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void testBuild() {
		Integer[] array = Arrays.build(20, 10, 30);
		assertThat(array.length, is(3));
		assertThat(array[0], is(20));
		assertThat(array[1], is(10));
		assertThat(array[2], is(30));
	}

}
