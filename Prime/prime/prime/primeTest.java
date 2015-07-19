package prime;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;


public class primeTest {

	BigInteger longBigInteger;
	
	@Before
	public void setUp() {
		
		//longBigInteger = prime.generateLongNumber(20);
		
	}
	@Test
	public void test1() {
		longBigInteger = prime.generateLongNumber(40);
		String result = "";
		//System.out.println(longBigInteger);
		//result += longBigInteger;
		long startTime = System.nanoTime();
		prime.isPrime(longBigInteger);

		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		//result += " Running Time in Nanoseconds: " +duration;
		result += duration;
		System.out.println(result);
		
	}
	
	@Test
	public void test2(){
		for (int i=1; i<100; i++){
			test1();
		}
	}
	
//	@Test
//	public void test2(){
//		longBigInteger = BigInteger.valueOf(791081);
//		assertTrue(prime.isPrime(longBigInteger));
//	}
	
}