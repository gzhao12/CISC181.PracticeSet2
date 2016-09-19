package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getTest() {
		MyInteger tValue = new MyInteger(1);
		assertTrue(tValue.getiValue() == 1);
		assertFalse(tValue.getiValue() == 2);
	}

	@Test
	public void isEvenTest() {
		MyInteger value1 = new MyInteger(1);
		MyInteger value2 = new MyInteger(2);
		assertFalse(value1.isEven());
		assertTrue(value2.isEven());
	}

	@Test
	public void isOddTest() {
		MyInteger value1 = new MyInteger(1);
		MyInteger value2 = new MyInteger(2);
		assertTrue(value1.isOdd());
		assertFalse(value2.isOdd());
	}

	@Test
	public void isPrimeTest() {
		MyInteger value1 = new MyInteger(1);
		MyInteger value2 = new MyInteger(2);
		MyInteger value3 = new MyInteger(9);
		MyInteger value4 = new MyInteger(151);

		assertFalse(value1.isPrime());
		assertTrue(value2.isPrime());
		assertFalse(value3.isPrime());
		assertTrue(value4.isPrime());
	}

	@Test
	public void isEvenIntTest() {
		assertTrue(MyInteger.isEven(2));
		assertFalse(MyInteger.isEven(3));
	}

	@Test
	public void isOddIntTest() {
		assertFalse(MyInteger.isOdd(2));
		assertTrue(MyInteger.isOdd(3));
	}

	@Test
	public void isPrimeIntTest() {
		assertFalse(MyInteger.isPrime(1));
		assertTrue(MyInteger.isPrime(2));
		assertFalse(MyInteger.isPrime(9));
		assertTrue(MyInteger.isPrime(151));
	}

	@Test
	public void isEvenMyIntegerTest() {
		MyInteger value1 = new MyInteger(1);
		MyInteger value2 = new MyInteger(2);
		assertFalse(MyInteger.isEven(value1));
		assertTrue(MyInteger.isEven(value2));
	}

	@Test
	public void isOddMyIntegerTest() {
		MyInteger value1 = new MyInteger(1);
		MyInteger value2 = new MyInteger(2);
		assertTrue(MyInteger.isOdd(value1));
		assertFalse(MyInteger.isOdd(value2));
	}

	@Test
	public void isPrimeMyIntegerTest() {
		MyInteger value1 = new MyInteger(1);
		MyInteger value2 = new MyInteger(2);
		MyInteger value3 = new MyInteger(9);
		MyInteger value4 = new MyInteger(151);

		assertFalse(MyInteger.isPrime(value1));
		assertTrue(MyInteger.isPrime(value2));
		assertFalse(MyInteger.isPrime(value3));
		assertTrue(MyInteger.isPrime(value4));
	}

	@Test
	public void equalsIntTest() {
		MyInteger value1 = new MyInteger(1);
		assertTrue(value1.equals(1));
		assertFalse(value1.equals(2));
	}
	
	@Test
	public void equalsMyIntegerTest() {
		MyInteger value1 = new MyInteger(1);
		MyInteger value2 = new MyInteger(1);
		MyInteger value3 = new MyInteger(2);
		
		assertTrue(value1.equals(value2));
		assertFalse(value1.equals(value3));
	}
}
