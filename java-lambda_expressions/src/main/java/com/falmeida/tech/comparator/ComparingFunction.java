package com.falmeida.tech.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingFunction {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();  
		
		list.add(new Person("Fabio",45,10.000));  
		list.add(new Person("John",40,90.0));  
		list.add(new Person("Alysia",23,450.0));
		
		//Sorting elements on the basis of name  
		Comparator<Person> cm1=Comparator.comparing(Person::getName);  
		
		Collections.sort(list,cm1);  
		
		System.out.println("Sorting by Name");  
		
		for(Person p: list){  
			System.out.println(p.getName()+" "+p.getAge());  
		}  
		 
		//Sorting elements on the basis of age  
		Comparator<Person> cm2=Comparator.comparing(Person::getAge);
		
		Collections.sort(list,cm2);
		
		System.out.println("Sorting by Age");  
		
		for(Person p: list){  
			System.out.println(p.getName()+" "+p.getAge());  
		}    
		
		Comparator<Person> cm3=Comparator.comparing(Person::getName,Comparator.nullsFirst(String::compareTo));  
		
		Collections.sort(list,cm3);
		
		System.out.println("Considers null to be less than non-null");  
		
		for(Person p: list){  
			System.out.println(p.getName()+" "+p.getAge());  
		}  
		
		Comparator<Person> cm4=Comparator.comparing(Person::getName,Comparator.nullsLast(String::compareTo));  
		Collections.sort(list,cm4);  
		System.out.println("Considers null to be greater than non-null");  
		for(Person p: list){  
			System.out.println(p.getName()+" "+p.getAge());  
		}  
		
	}
		
}
	