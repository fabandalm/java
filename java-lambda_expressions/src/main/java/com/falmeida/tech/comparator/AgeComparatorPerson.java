package com.falmeida.tech.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AgeComparatorPerson {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();  
		list.add(new Person("Fabio",45,10.000));  
		list.add(new Person("John",48,90.0));  
		list.add(new Person("Alycia",23,450.0));  
		
		System.out.println("Sorting by age");  
		
		//New Comparator Class
		Collections.sort(list,new AgeComparator());  
		
		//Anonymous Class
		Collections.sort(list,new Comparator<Person>(){
			public int compare(Person firstPerson, Person secondPerson) {
				 
				if(firstPerson.getAge() == secondPerson.getAge())  
					return 0;  
				else if(firstPerson.getAge()> secondPerson.getAge())  
					return 1;  
				else  
					return -1;  		
			}
		});
		
		//Lambda Expression
		Collections.sort(list, (Person p1,Person p2) -> {
			if(p1.getAge() == p2.getAge())  
				return 0;  
			else if(p1.getAge()> p2.getAge())  
				return 1;  
			else  
				return -1;
		}); 
		
		Iterator<Person> iterator = list.iterator();  
		
		while(iterator.hasNext()){  
			Person p= iterator.next();  
			System.out.println(p.getName()+" "+p.getAge());  
		}  
		
	}
	
}
