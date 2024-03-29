package com.voya.testcases.greet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetTest {

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
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcase");
	}

	@Test
	void testNull() {
		List<String> myList = null;
		assertNull(myList);
	}
	@Test
	void testNotNull() {
		List<String> myList = new ArrayList<>();
		assertNotNull(myList);
	}
	@Test
	void testSame() {
		String username = "Priya";
		String nusername = "Priya";
		
		assertSame(username,nusername,"reference are not same");
	}
	@Test
	void testEquality() {
		String username = "Priya";
		assertEquals(username,"Priya","same literal values");
	}

}
