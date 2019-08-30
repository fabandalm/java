package com.falmeida.tech.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person firstPerson, Person secondPerson) {
		// TODO Auto-generated method stub
		 
		if(firstPerson.getAge() == secondPerson.getAge())  
			return 0;  
		else if(firstPerson.getAge()> secondPerson.getAge())  
			return 1;  
		else  
			return -1;  		
	}

}
