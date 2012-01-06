package de.rueckemann;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class RomanNumerTest {
  @Test
  public void testIReturns1() {
	  assertEquals(1, RomanNumber.toDecimal("I"));
  }

  @Test
  public void testIIReturns2() {
	  assertEquals(2, RomanNumber.toDecimal("II"));
  }
  
  @Test
  public void testIIIReturns3() {
	  assertEquals(3, RomanNumber.toDecimal("III"));
  }

  @Test
  public void testVReturns5() {
	  assertEquals(5, RomanNumber.toDecimal("V"));
  }
 
  @Test
  public void testXReturns10() {
	  assertEquals(10, RomanNumber.toDecimal("X"));
  }
 
  @Test
  public void testLReturns50() {
	  assertEquals(50, RomanNumber.toDecimal("L"));
  }
   
  @Test
  public void testCReturns100() {
	  assertEquals(100, RomanNumber.toDecimal("C"));
  }
 
  @Test
  public void testDReturns500() {
	  assertEquals(500, RomanNumber.toDecimal("D"));
  }
 
  @Test
  public void testMReturns1000() {
	  assertEquals(1000, RomanNumber.toDecimal("M"));
  }
 
  @Test
  public void testIVReturns4() {
	  assertEquals(4, RomanNumber.toDecimal("IV"));
  }
 
  @Test
  public void testVIReturns6() {
	  assertEquals(6, RomanNumber.toDecimal("VI"));
  }
   
  @Test
  public void testVIIReturns7() {
	  assertEquals(7, RomanNumber.toDecimal("VII"));
  }
 
  @Test
  public void testVIIIReturns8() {
	  assertEquals(8, RomanNumber.toDecimal("VIII"));
  }
  
  @Test
  public void testIXReturns9() {
	  assertEquals(9, RomanNumber.toDecimal("IX"));
  }
 
  @Test
  public void testXIIIReturns13() {
	  assertEquals(13, RomanNumber.toDecimal("XIII"));
  }
  
  @Test
  public void testXIXReturns19() {
	  assertEquals(19, RomanNumber.toDecimal("XIX"));
  }
  
  @Test
  public void testXLIXReturns49() {
	  assertEquals(49, RomanNumber.toDecimal("XLIX"));
  }
  
  @Test
  public void testDCCCReturns9() {
	  assertEquals(800, RomanNumber.toDecimal("DCCC"));
  }
  
  @Test
  public void testMCMLXXXIVReturns1984() {
	  assertEquals(1984, RomanNumber.toDecimal("MCMLXXXIV"));
  }
  
  @Test
  public void testMMXIReturns2011() {
	  assertEquals(2011, RomanNumber.toDecimal("MMXI"));
  }
  
}

