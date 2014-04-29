package orz.yanagin.commons;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class ListsTest {

	@Test
	public void testBuild() {
		List<Integer> list = Lists.build(20, 10, 30);
		assertThat(list.size(), is(3));
		assertThat(list.get(0), is(20));
		assertThat(list.get(1), is(10));
		assertThat(list.get(2), is(30));
	}

}
