package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	Calculator calculator =null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all the testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcase");
	}

	@Test
	void testSum() {
		int actual = calculator.sum(10,20);
		Assertions.assertEquals(30,actual,"output should be 30");
		
	}
	@Test
	@Tag("first")
	void testProduct() {
		int actual=calculator.product(5,4);
		assertEquals(20,actual,"output should be 20");
	}
	
	@Test
	@Disabled
	void testGreet() {
		String username = "Priya";
		String actual=calculator.greetMessage(username);
		assertEquals("Welcome PRIYA",actual,"not a match");
	}
	@Test
	void testShowCourses() {
		    List<String> coursesInput = Arrays.asList("CSS","Java","Spring","Angular","Html");
			List<String> expected = Arrays.asList("Angular","CSS","Html","Java","Spring");
			List<String> actual = calculator.showCourses(coursesInput);
			assertEquals(expected,actual);
			//assertSame(expected,actual);
	}

}
