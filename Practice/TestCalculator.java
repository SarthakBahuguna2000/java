
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import junit.framework.TestCase;

public class TestCalculator {
	
   
    @Test
    public void testAdd() {
    	CalculateFunction ob=new CalculateFunction();
        Assert.assertEquals(ob.add(10, 20), 30);
    }
    public void testMultiply() {
    	
        Assert.assertEquals(ob.mul(10, 20), 200);
    }
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
