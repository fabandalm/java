package com.falmeida.tech.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class NameComparatorPerson {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();  
		list.add(new Person("Fabio",45,new Double("1000000")));  
		list.add(new Person("John",48,new Double("90")));  
		list.add(new Person("Alycia",23,new Double ("450")));  
		
		System.out.println("Sorting by wage");  
						
		//Lambda Expression
		Collections.sort(list, (Person p1,Person p2) -> p1.getWage().compareTo(p2.getWage())); 
		
		//Lambda Expressions
		Collections.sort(list, (Person p1,Person p2) -> p1.getName().compareTo(p2.getName()));
		
		Iterator<Person> iterator = list.iterator();  
		
		while(iterator.hasNext()){  
			Person p= iterator.next();  
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getWage());  
		}  
	}
	
}
