package com.nishit.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);
		Set s = new HashSet();
		
		s.add(4);
		s.addAll(l);
		
		System.out.println(s);
		
		System.out.println(s.contains(3));
		System.out.println(s.containsAll(l));
		System.out.println(l.containsAll(s));
		//System.out.println(s);
	//	s.clear();
		System.out.println(s.contains(3));
		System.out.println(s.containsAll(l));
		System.out.println(l.containsAll(s));
		System.out.println(s);
		System.out.println(s.retainAll(l));
		System.out.println(s);
			}
	
}
