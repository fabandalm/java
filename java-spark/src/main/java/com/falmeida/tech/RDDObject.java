package com.falmeida.tech;

public class RDDObject implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int value;
		
	private double sqrtValue;
	
	public RDDObject(int value) {
		
		this.value = value;
		
		this.sqrtValue = Math.sqrt(value);		
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getSqrtValue() {
		return sqrtValue;
	}

	public void setSqrtValue(double sqrtValue) {
		this.sqrtValue = sqrtValue;
	}

}
