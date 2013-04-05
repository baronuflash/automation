package com.selenium.maven.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.selenium.maven.tests.Test1;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Test1.class })
public class TestSuite {

}
