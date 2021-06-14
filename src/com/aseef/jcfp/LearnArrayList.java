package com.aseef.jcfp;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		
		//ArrayList<Object> name = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<115;i++) {
			al.add(i);
		}
		
		System.out.println(al.get(0));
		al.remove(0);//index
		al.remove(Integer.parseInt(1));//object
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
		      Integer i = it.next();
		      System.out.println(i);	
		      if(i < 10) {
			it.remove();
		      }
		}		
	}

}
