package test.com.bhavna.testing;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndexOutOfBounds {
	
	@Test
	void testExpectedException()
	{
		Assertions.assertThrows(Exception.class, () -> {
	    Integer.parseInt("Excpetion");
	  });
	}
}