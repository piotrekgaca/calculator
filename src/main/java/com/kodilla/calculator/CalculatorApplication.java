package com.kodilla.calculator;

import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator
{
	public int addAToB(int a, int b) {
		return a + b;
	}

	public int substractAFromB(int a, int b) {
		return a - b;
	}

	public static void main (String args[]) {
		Calculator calculator = new Calculator();
		int addResult = calculator.addAToB(17, 23);
		System.out.println(addResult);
		int substractResult = calculator.substractAFromB(17, 23);
		System.out.println(substractResult);
		System.out.println("It works!");
	}
}
