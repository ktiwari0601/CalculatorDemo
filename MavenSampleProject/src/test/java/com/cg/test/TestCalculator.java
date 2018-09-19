package com.cg.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.beans.Calculator;

public class TestCalculator 
{
	@Test
	public void test_add()
	{
		Calculator calc=new Calculator();
		int res=calc.add(4,5);
		Assert.assertEquals(9,res);
	}
	
	@Test
	public void test_substract()
	{
		Calculator calc=new Calculator();
		int res=calc.substract(9,5);
		Assert.assertEquals(4,res);
	}
	
	@Test
	public void test_multiply()
	{
		Calculator calc=new Calculator();
		int res=calc.multiply(4,5);
		Assert.assertEquals(20,res);
	}
	
	@Test
	public void test_calcSquare()
	{
		Calculator calc=new Calculator();
		int res=calc.calcSquare(4);
		Assert.assertEquals(16,res);
	}

}
