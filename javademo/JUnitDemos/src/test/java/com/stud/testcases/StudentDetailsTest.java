package com.stud.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumberException;
import com.voya.training.StudentDetails;

class StudentDetailsTest {
	StudentDetails student = null;

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
		student = new StudentDetails();
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcase");
	}

	//@Test
//	void testTotalMarks() throws InvalidNumberException {
//		int marks1 = 10;
//		int marks2 =20;
//		int marks3= 30;
//		int expected = marks1+marks2+marks3;
//		int actual = student.totalMarks(marks1,marks2,marks3);
//		assertThrows(InvalidNumberException.class,()->student.totalMarks(marks1,marks2,marks3));
//		assertEquals(expected,actual);
//	}
	//@Test
	//@Tag("neg")
//	void testNegMarks()  {
//		assertThrows(InvalidNumberException.class,()->student.totalMarks(90, -20, 60));
//		
//	}
//	@Test
//	void testGreaterMarks()  {
//		assertThrows(InvalidNumberException.class,()->student.totalMarks(100, 20,50 ) );
//	}

}
