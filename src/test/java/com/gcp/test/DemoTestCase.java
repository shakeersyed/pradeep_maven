package com.gcp.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTestCase {
	int numberOfProjects=8;
	int numberOfDevelopers=9;
	int totalActivities=17;

	@Test
	public void test() {
		assertTrue(this.numberOfDevelopers == 9);
	}
	
	@Test
	public void testBool() {
		assertTrue(true);
	}
	
	@Test
	public void testProjects() {
		assertTrue(this.numberOfProjects == 8);
	}
	
	@Test
	public void testActivities() {
		assertTrue(this.totalActivities == 17);
	}

}
