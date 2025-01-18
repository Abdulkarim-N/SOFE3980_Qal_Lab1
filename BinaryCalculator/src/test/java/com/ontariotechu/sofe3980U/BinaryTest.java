package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }
    /*
    * Checks to see if the or function works with one value
     */
    @Test
    public void or1()
    {
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1");
        Binary or = Binary.binaryOR(binary1,binary2);
        assertTrue( or.getValue().equals("1"));
    }
    /*
    tests the function with two binary values of different length
     */
    @Test
    public void or2()
    {
        Binary binary1=new Binary("0101");
        Binary binary2=new Binary("10");
        Binary or = Binary.binaryOR(binary1,binary2);
        assertTrue( or.getValue().equals("111"));
    }
    /*
    tests the function with binary numbers of different length again
     */
    @Test
    public void or3()
    {
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary or = Binary.binaryOR(binary1,binary2);
        assertTrue( or.getValue().equals("1010"));
    }
    /*
    checks to see if the function works with two similar length numbers
     */
    @Test
    public void or4()
    {
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("0101");
        Binary or = Binary.binaryOR(binary1,binary2);
        assertTrue( or.getValue().equals("1111"));
    }
    /*
    checks to see if the function works
     */
    @Test
    public void and1()
    {
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1");
        Binary and = Binary.binaryAND(binary1,binary2);
        assertTrue( and.getValue().equals("0"));
    }
    /*
    checks to see if the function works for binary values of different length
    */
    @Test
    public void and2()
    {
        Binary binary1=new Binary("1001");
        Binary binary2=new Binary("1");
        Binary and = Binary.binaryAND(binary1,binary2);
        assertTrue( and.getValue().equals("1"));
    }
    /*
checks to see if the function works for binary values of different length reversed
*/
    @Test
    public void and3()
    {
        Binary binary1=new Binary("100");
        Binary binary2=new Binary("1111");
        Binary and = Binary.binaryAND(binary1,binary2);
        assertTrue( and.getValue().equals("100"));
    }
    /*
checks to see if the function works for binary values of different length reversed
*/
    @Test
    public void multi1()
    {
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1111");
        Binary multi = Binary.binaryMulti(binary1,binary2);
        assertTrue( multi.getValue().equals("0"));
    }
    /*
checks to see if the function works for binary values of different length reversed
*/
    @Test
    public void multi2()
    {
        Binary binary1=new Binary("10");
        Binary binary2=new Binary("1000");
        Binary multi = Binary.binaryMulti(binary1,binary2);
        assertTrue( multi.getValue().equals("10000"));
    }
    /*
checks to see if the function works for binary values of different length reversed
*/
    @Test
    public void multi3()
    {
        Binary binary1=new Binary("111");
        Binary binary2=new Binary("1111");
        Binary multi = Binary.binaryMulti(binary1,binary2);
        assertTrue( multi.getValue().equals("1101001"));
    }

}
