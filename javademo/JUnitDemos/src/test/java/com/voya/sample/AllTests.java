package com.voya.sample;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.voya.testcases.CalculatorTest;
import com.voya.training.Calculator;
import com.voya.training.StudentDetails;

import org.junit.platform.runner.JUnitPlatform;
@SelectPackages({"com.voya.testcases"})
//@RunWith(JUnitPlatform.class)
@RunWith(Suite.class)
@SuiteClasses({Calculator.class,StudentDetails.class})
//@ExcludePackages({"com.voya.testcases.greet"})
//@IncludePackages({"com.voya.testcases.trial"})
//@SelectClasses({CalculatorTest.class})
//@IncludeTags({"first","simple","neg"})
@ExcludeTags({"first"})
public class AllTests {

}
