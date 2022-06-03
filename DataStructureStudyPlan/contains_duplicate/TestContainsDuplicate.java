package contains_duplicate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestContainsDuplicate {
	
	int[] testData1 = {1,2,3,1}; //true
	int[] testData2 = {1,2,3,4}; //false 
	int[] testData3 = {1,1,1,3,3,4,3,2,4,2}; //true

	@Test
	void test1() {
		assertTrue(ContainsDuplicate.containsDuplicate(testData1));
	}
	
	@Test
	void test2() {
		assertFalse(ContainsDuplicate.containsDuplicate(testData2));
	}
	
	@Test
	void test3() {
		assertTrue(ContainsDuplicate.containsDuplicate(testData3));
	}

}
