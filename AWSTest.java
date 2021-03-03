import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AWSTest {

	private static final int FILLER_VALUE = Integer.MIN_VALUE;
	private final int[] original={1, 2, 3};
	AWS originalAWS;
	
	@BeforeEach
	void setUp() throws Exception {
		 originalAWS = new AWS(this.original);
	}

	@Test
	void testGetValues() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValues() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAWS() {
		int[] expected = {1, 2, 3};
		int[] x = {1, 2, 3};
		AWS aws = new AWS(x);
		x[1] = 100;
		
		int[] actual = aws.getValues();
		assertEquals(actual[0], expected[0]);
		assertEquals(actual[1], expected[1]);
	}
	
	@Test
	void testRemove() {
		int[] x = {1, 2, 3};
		AWS aws = new AWS(x);
		
		int value = aws.remove(-1);
		int expected = FILLER_VALUE;
		assertEquals(expected, value);
		
		 value = aws.remove(x.length + 10);
		expected = FILLER_VALUE;
		assertEquals(expected, value);
		
		value = aws.remove(0);
		assertEquals(x[0], value);
		
		int[] r = aws.getValues();
		value = r[r.length - 1];
		assertEquals(expected, value);
		
		value = aws.remove(2);
		assertEquals(r[2], value);
		
		r = aws.getValues();
		value = r[r.length - 1];
		assertEquals(expected, value);
		
	}
	
	@Test
	void testFillAndExpand() {
		int position = 1;
		int numberOfTimes = 2;
		int[] org = originalAWS.getValues();
		int expectedValue = org[position];
		int first = org[0];
 		
		int expected = originalAWS.getValues().length + numberOfTimes;
		originalAWS.fillAndExpand(position, numberOfTimes);
		int[] result = originalAWS.getValues();
		assertEquals(expected, result.length);
		
		int a = result[1];
		int b = result[2];
		int c = result[3];
		assertEquals(expectedValue, a);
		assertEquals(expectedValue, b);
		assertEquals(expectedValue, c);
		assertEquals(first, result[0]);
		 
		
	
	}
	@Test
	void testFillAndExpandWithNegative() {
		int position = 1;
		int numberOfTimes = -2;
		
		int[] org = originalAWS.getValues();
		int expectedValue = org[position];
 		int first = org[0];
		int expected = originalAWS.getValues().length + numberOfTimes;
		originalAWS.fillAndExpand(position, numberOfTimes);
		int[] result = originalAWS.getValues();
		assertEquals(expected, result.length);
		
		int a = result[1];
		int b = result[2];
		int c = result[3];
		assertEquals(expectedValue, a);
		assertEquals(expectedValue, b);
		assertEquals(expectedValue, c);
		 
		assertEquals(first, result[0]);

	
	}
	@Test
	void testRemoveAgain(){
		int[] x={10,20,30};
		AWS aws_test=new AWS(x);
		int removed_value=aws_test.remove(1);
		int[] expected=aws_test.getValues();
		assertEquals(x[1],removed_value);
	}
	@Test
		//To find sum of values until the mentioned position
	void testSumToPlace(){
		int[] x = {1,3,4,5};
		//Sum of the array upto position 1
		int position_1=1;
		int actual_SumToPlace_1=4;
		AWS aws_test = new AWS(x);
		int expected_SumToPlace_1 = aws_test.sumToPlace(position_1);
		assertEquals(actual_SumToPlace_1,expected_SumToPlace_1);
		//Sum of the array upto position 3
		int position_2=3;
		int actual_Sum_2=13;
		int expected_Sum_2=aws_test.sumToPlace(position_2);
		assertEquals(actual_Sum_2,expected_Sum_2);
	}
}
