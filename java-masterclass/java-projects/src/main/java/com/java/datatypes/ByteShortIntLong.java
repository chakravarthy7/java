package com.java.datatypes;

public class ByteShortIntLong {

	public static void main(String[] args) {
		int minVlaue = Integer.MIN_VALUE;
		int maxValue = Integer.MAX_VALUE;
		
		System.out.println(minVlaue);
		System.out.println(maxValue);
		
		//adding extra value to max integrer value
		System.out.println("Adding extra value to int max value: " +(maxValue + 100));
		System.out.println("subtracting extra value from int min value: " +(minVlaue - 100));
		
		//adding number to max value is overflow
		//subtracting number from min value is underflow
		
		//larger number that can hold upto
		int intTest = 2147483647;
		
		//byte datatype
		byte byteMinValue = Byte.MIN_VALUE;
		byte byteMaxValue = Byte.MAX_VALUE;
		
		System.out.println("byte min value: "+byteMinValue);
		System.out.println("byte max value: "+byteMaxValue);
		
		System.out.println("busted byte min value: "+(byteMinValue-1));
		System.out.println("busted byte max value: "+(byteMaxValue+1));
		
		short shortMinValue = Short.MIN_VALUE;
		short shortMaxValue = Short.MAX_VALUE;
		
		System.out.println("short min value: "+shortMinValue);
		System.out.println("short max value: "+shortMaxValue);
		
		long longMinValue = Long.MIN_VALUE;
		long longMaxValue = Long.MAX_VALUE;
		
		System.out.println("long min value: "+longMinValue);
		System.out.println("long max value: "+longMaxValue);
		
		char charMinValue = Character.MIN_VALUE;
		char charMaxValue = Character.MAX_VALUE;
		
		System.out.println("char min value: "+charMinValue);
		System.out.println("char max value: "+charMaxValue);
		
		//casting in java
		short value1 = (short) (shortMinValue/2);
		
		byte byteValue1 = 10;
		short shortValue1 = 20;
		int intValue1 = 50;
		
		long longValue = (50000L + 10*(byteValue1+shortValue1+intValue1));
		System.out.println(longValue);
		
		short shortValue = (short)(50000L + 10*(byteValue1+shortValue1+intValue1));
		System.out.println(shortValue);
		
		int intValue = (int) (50000L + 10*(byteValue1+shortValue1+intValue1));
		System.out.println(intValue);
		
		

	}

}