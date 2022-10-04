package com.bhavna.Maven;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
public class TestIt {
	 @Test
	    public void testAdd() {
	    	CalculateFunction ob=new CalculateFunction();
	    	
	        Assert.assertEquals(ob.add(10, 20),30);
	    }
	    public void testMultiply() {
	    	CalculateFunction ob=new CalculateFunction();
	    	
	        Assert.assertEquals(ob.mul(20, 20),400);
	    }
	    @Test
	    public void testDivideByZero() throws Exception {
	    	CalculateFunction ob=new CalculateFunction();
	        
	        assertEquals(ob.div(10.2,0.0), 0.0);
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

		

	}


