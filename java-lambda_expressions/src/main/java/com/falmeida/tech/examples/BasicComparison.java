package com.falmeida.tech.examples;

import java.util.Comparator;

public class BasicComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Apple> byWeight = new Comparator<Apple>() {
		    public int compare(Apple a1, Apple a2){
		        return a1.getWeight().compareTo(a2.getWeight());
		    }
		};
	}

}
