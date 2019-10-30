package com.assignment.calculator.calculatorApplication;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = App.add(a, b);
        junit.framework.Assert.assertEquals(expectedResult, result);
    }
    
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = App.sub(a, b);
        junit.framework.Assert.assertEquals(expectedResult, result);;
    }
    
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = App.mult(a, b);
        junit.framework.Assert.assertEquals(expectedResult, result);;
    }
    
    public void testDivide() {
        int a = 56;
        int b = 10;
        double expectedResult = 5.6;
        double result = App.div(a, b);
        junit.framework.Assert.assertEquals(expectedResult, result,0.00005);
    }
    
    public void testModulus() {
        int a = 56;
        int b = 10;
        double expectedResult = 5;
        double result = App.mod(a, b);
        junit.framework.Assert.assertEquals(expectedResult, result);
    }
}
