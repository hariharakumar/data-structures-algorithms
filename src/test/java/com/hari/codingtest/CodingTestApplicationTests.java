package com.hari.codingtest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.commons.lang.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodingTestApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testTime() {

	/*	Assert.assertTrue(DateUtil.addMinutesToTime("9:13 AM", 200).equalsIgnoreCase("12:33 PM"));
		Assert.assertTrue(DateUtil.addMinutesToTime("9:13 PM", 200).equalsIgnoreCase("12:33 AM"));

		Assert.assertTrue(DateUtil.addMinutesToTime("10:45 AM", 550).equalsIgnoreCase("7:55 PM"));
		Assert.assertTrue(DateUtil.addMinutesToTime("10:45 PM", 550).equalsIgnoreCase("7:55 AM"));

		Assert.assertTrue(DateUtil.addMinutesToTime("9:45 AM", 1000).equalsIgnoreCase("2:25 AM"));
		Assert.assertTrue(DateUtil.addMinutesToTime("1:45 AM", 10).equalsIgnoreCase("1:55 AM"));
		Assert.assertTrue(DateUtil.addMinutesToTime("1:45 AM", 600).equalsIgnoreCase("11:45 AM"));

		Assert.assertTrue(DateUtil.addMinutesToTime("11:45 AM", 20).equalsIgnoreCase("12:05 PM"));

		Assert.assertTrue(DateUtil.addMinutesToTime("11:59 AM", 1).equalsIgnoreCase("12:00 PM"));
		Assert.assertTrue(DateUtil.addMinutesToTime("11:59 PM", 1).equalsIgnoreCase("12:00 AM"));

		Assert.assertTrue(DateUtil.addMinutesToTime("9:45 AM", 1440).equalsIgnoreCase("9:45 AM"));

		Assert.assertTrue(DateUtil.addMinutesToTime("9:45 AM", 14400000).equalsIgnoreCase("9:45 AM"));

		Assert.assertTrue(DateUtil.addMinutesToTime("9:45 AM", 0).equalsIgnoreCase("9:45 AM"));*/

		String url = "https://api.onfido.com/v2/applicants/961126fb-cb6f-4d00-87e6-e9ea8791f683/checks/b218b6df-32d6-41de-a852-c93ddb9a443f";

		System.out.println(StringUtils.substringBetween(url, "applicants/", "/"));
	}

	@Before
	public void testBreadthFirstSearch() throws Exception {

	}
}
