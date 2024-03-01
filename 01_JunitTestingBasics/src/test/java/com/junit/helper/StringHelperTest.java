package com.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.helper.StringHelper;

class StringHelperTest {
	
//	AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA

	StringHelper helper =new StringHelper();

	@Test
	void test() {
	//	assertEquals("ABC", "ABC"); // success
	//	assertEquals("ABC", "ABCD"); // Failure
	}
	
	@Test
	void testTruncateAInFirst2Positions() {
//		StringHelper helper =new StringHelper();
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));

	}
	
	@Test
	void testTruncateAInFirst2Positions2() {
//		StringHelper helper =new StringHelper();
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));


	}

}
