package com.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.helper.StringHelper;

class StringHelperTest {
	
//	ABCD = False. ABAB =True ,AB =True, A = False


	StringHelper helper =new StringHelper();

	
	@Test
	void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	void testAreFirstAndLastTwoCharactersTheSame2() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	@Test
	void testAreFirstAndLastTwoCharactersTheSame3() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	void testAreFirstAndLastTwoCharactersTheSame4() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
}
