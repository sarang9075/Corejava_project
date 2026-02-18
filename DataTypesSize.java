package com.dataType;

public class DataTypesSize {
	public static void main(String[] args) {
		
	//	1 byte = 8 bits 
	// non premetive data types : String , Class , Arrays ....
	// wrapper class
	// Byte, Short, Integer, Float, Double , character, Long, Boolean
		
	String panNo= "FSHG5555";
	System.out.println("pan No is ="+panNo);
	
	System.out.println("Byte size =" +Byte.BYTES+"Byte");
	System.out.println("Short size=" +Short.BYTES+"Byte");
	System.out.println("Integer size=" +Integer.BYTES+"Byte");
	System.out.println("Long size=" +Long.BYTES+"Byte");
	System.out.println("Float size=" +Float.BYTES+"Byte");
	System.out.println("Double size=" +Double.BYTES+"Byte");
	System.out.println("Character size=" +Character.BYTES+"Byte");
	System.out.println("Boolean is not found...!");
	
	
	
	System.out.println(Byte.SIZE);
	System.out.println(Short.SIZE);
	System.out.println(Integer.SIZE);
	System.out.println(Long.SIZE);
	System.out.println(Float.SIZE);
	System.out.println(Double.SIZE);
	System.out.println(Character.SIZE);
	System.out.println("Boolean is not found..!");
	
	
	
	System.out.println(Byte.MIN_VALUE+ "to" + Byte.MAX_VALUE);
	System.out.println(Short.MIN_VALUE+ "to" + Short.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE+ "to"+ Integer.MAX_VALUE);
	System.out.println(Long.MIN_VALUE+ "to" + Long.MAX_VALUE);
	System.out.println(Float.MIN_VALUE+ "to" + Float.MAX_VALUE);
	System.out.println(Double.MIN_VALUE+ "to" + Double.MAX_VALUE);
	System.out.println ((int) Character.MIN_VALUE + "to" + Character.MAX_VALUE);
	System.out.println("Boolean is not found ");
	
				
		
	}

}