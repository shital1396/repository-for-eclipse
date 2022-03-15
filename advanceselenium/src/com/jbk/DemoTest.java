package com.jbk;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class DemoTest {

	@Test
	public void test01() {
		System.out.println("testcase test01");
		Assert.assertEquals(1, 1);
	}
	
	@Test
	public void test02() {
		System.out.println("testcase test02");
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void test03() {
		System.out.println("testcase test03");
		throw new SkipException("skipping a testcase");
	}
}
