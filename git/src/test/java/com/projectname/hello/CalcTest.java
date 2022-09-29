package com.projectname.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;

public class CalcTest
        extends TestCase
{
    
//    private static Calc calc = new Calc();
//
//    @Before
//    public void setUp() throws Exception {
//        calc.clear();
//    }
//    
//    public int testCalc(){
//        assertEquals(3,calc.getResult());
//        assertEquals(1,calc.getResult());
//    }
    
   
        /**
         * Create the test case
         *
         * @param testName name of the test case
         */
    public CalcTest( String testName )
        {
            super( testName );
        }

        /**
         * @return the suite of tests being tested
         */
        public static Test suite()
        {
            return new TestSuite( CalcTest.class );
        }

        /**
         * Rigourous Test :-)
         */
        public void testCalc()
        {
            assertTrue( true );
        }
    
}

//package main;
//
//        import static org.junit.Assert.*;
//
//        import org.junit.Before;
//        import org.junit.Ignore;
//        import org.junit.Test;
//
//public class CalculatorTest {
//
//    private static Calculator calculator = new Calculator();
//
//    @Before
//    public void setUp() throws Exception {
//        calculator.clear();
//    }
//
//    @Test
//    public void testAdd() {
//        calculator.add(4);
//        calculator.add(4);
//        assertEquals(8, calculator.getResult());
//    }
//
//    @Test
//    public void testSubstract() {
//        calculator.add(9);
//        calculator.substract(3);
//        assertEquals(6, calculator.getResult());
//    }
//
//    @Ignore("Multiply() Not yet implemented")
//    @Test
//    public void testMultiply() {
//        fail("Not yet implemented");
//    }
//
//    @Test
//    public void testDivide() {
//        calculator.add(8);
//        calculator.divide(2);
//        assertEquals(4, calculator.getResult());
//    }
//
//}