package orz.yanagin.commons;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringsTest {

	@Test
	public void testIsEmptyOrNull() {
		assertThat(Strings.isEmptyOrNull(null), is(Boolean.TRUE));
		assertThat(Strings.isEmptyOrNull(""), is(Boolean.TRUE));
		assertThat(Strings.isEmptyOrNull(" "), is(Boolean.TRUE));
		assertThat(Strings.isEmptyOrNull("a"), is(Boolean.FALSE));
	}

}
