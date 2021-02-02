package com.mycompany.app.jenkins;

import org.junit.*;
import static org.junit.Assert.*;
 
import java.util.*;

public class JenkinsCalcTest{
	
	@Test
	public void addTest(){
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10,myCalc.addNumbers(5,5));
	}
	
	@Test
	public void subtractTest(){
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5,myCalc.substractNumbers(10,5));
	}
}