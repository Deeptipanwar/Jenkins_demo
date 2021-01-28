package com.testngproject.Demo_testing;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1_Annotations {

	@BeforeSuite
	public void MethodBeforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void MethodAfterSuite() {
		System.out.println(" after suite");
	}
	
	@Test
	public void AlwaysCalled() {
		System.out.println("Test1");
	}
	
	@BeforeClass
	
	public void MethodClass() {
		System.out.println("Before Class");
	}
	
	@Test
	public void Alwayscalled2() {
		System.out.println("Test2");
	}
	@BeforeMethod
	
	public void MethodBefore() {
		System.out.println("BEfore method");
	}
}
