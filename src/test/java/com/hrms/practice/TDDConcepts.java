package com.hrms.practice;

import org.junit.Test;


public class TDDConcepts {
	
	@Test
	public void hello() {
		System.out.println("I will say hello if someone knocks on my door");
	}

//	@Test (dependsOnMethods = {"hello"})
	public void welcome() {
		System.out.println("I will welcome someone only if there was someone that knock on my door");
	}

//	@Test (dependsOnMethods = {"welcome"})
	public void tea() {
		System.out.println("I will serve tea to whoever I welcomed to my house");
	}
}
