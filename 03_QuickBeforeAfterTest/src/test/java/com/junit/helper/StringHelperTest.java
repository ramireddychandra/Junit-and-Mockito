package com.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.junit.helper.StringHelper;

class StringHelperTest {
	
//	ABCD = False. ABAB =True ,AB =True, A = False


	StringHelper helper =new StringHelper();
	
	@Before
	public void setup() {
		System.out.println("Before method");
	}
	
	@After
	public void Aftersetup() {
		System.out.println("Before method");
	}

	@Test
	void test1() {
		System.out.println("Test1");
	}
	
	@Test
	void test2() {
		System.out.println("Test2");
	}
	
	@Test
	void test3() {
		System.out.println("Test3");
	}
	
	@Test
	void test4() {
		System.out.println("Test4");
	}
	
	
}
