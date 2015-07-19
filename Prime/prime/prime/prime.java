package prime;

import java.math.*;
import java.util.Random;

public class prime {

	public static boolean isPrime(BigInteger num){
		//if smaller than or equal to 1 FALSE
		if ((num.compareTo(BigInteger.valueOf(1))<=0)){
			return false;
		}
		if ((num.equals(BigInteger.valueOf(2)))|(num.equals(BigInteger.valueOf(3)))){
			return true;
		}
		
		if (((num.mod(BigInteger.valueOf(2))).equals(BigInteger.valueOf(0)))|((num.mod(BigInteger.valueOf(3))).equals(BigInteger.valueOf(0)))){
			return false;
		}
		
		for (BigInteger bi = BigInteger.valueOf(4);
			            bi.compareTo(num) == -1;
			            bi = bi.add(BigInteger.valueOf(1)))
		 {
			
             if ((num.mod(bi)).equals(BigInteger.valueOf(0))) {
                 return false;
             }
         }
         return true;
		
	}
	
	public static BigInteger generateLongNumber(int b){
		String longNumber = "";
		Random rand = new Random();
		//generate b-amount of numbers that are either 0 or 1
		//and add them to the end of a string
		for (int i=1; i<=b; i++){
			int randomBit = rand.nextInt(2);
			longNumber = longNumber + randomBit;
		}
		//convert the string to a decimal BigInteger
		BigInteger longBigInteger = new BigInteger(longNumber, 2);
		return longBigInteger;
	}
	
//	public static boolean isPrime(int num){
//		if (num<=1){
//			return false;
//		}
//		if ((num==2)|(num==3)){
//			return true;
//		}
//		if ((num%2==0)|(num%3==0)){
//			return false;
//		}
//		for (int i=4; i<num; i=i++){
//			if(num%i==0){
//				return false;
//			}
//			
//		}
//		return true;
//	}
	
}
