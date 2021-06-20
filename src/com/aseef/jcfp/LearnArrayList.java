package com.aseef.jcfp;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

	public static void main(String[] args) {
		
		//ArrayList<Object> name = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> nal = new ArrayList<>();
		ArrayList<Integer> aal = new ArrayList<>();
		
		for(int i=0;i<15;i++) {
			al.add(i);
		}
		
		nal=al;
		
		for(int i:al) {
			aal.add(i);
		}
		
		System.out.println(al);
		al.remove(0);//index
		al.remove(Integer.valueOf(1));//object
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
		      Integer i = it.next();	
		      if(i < 10) {
		    	  it.remove();
		      }
		}	
		System.out.println(al);
		
		al.set(2, 100);
		
		System.out.println(al);
		
		System.out.println(al.contains(14));
		
		System.out.println(nal);
		System.out.println(aal);
		
		al.addAll(aal); // will add at last
		System.out.println(al);
		
		nal.addAll(2, aal); //will add from given position
		System.out.println(nal);
	}

}
