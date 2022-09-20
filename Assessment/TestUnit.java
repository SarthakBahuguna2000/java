package com.bhavna.assessment;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



class TestUnit {
	
	
	@Test
    @DisplayName("Test the ViewReferral()")
    public void testView() {
        Referal tester=new Referal();
        tester.view();
	}
        
	
	/**
	public void testAssert(){					
   		
		
        String string1="Password";					
        String string2="Password";					
        					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] airethematicArrary1 = { 1000, 2000, 3000 };					
        int[] airethematicArrary2 = { 1000, 2000, 3000};					
        	
        assertEquals(string1,string2);					
        					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(airethematicArrary1, airethematicArrary2);**/
       
    
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	public void emptyList() {
		Referal ob=new Referal();
		assertThrows(IndexOutOfBoundsException.class, ()->{
		
		});

}
}