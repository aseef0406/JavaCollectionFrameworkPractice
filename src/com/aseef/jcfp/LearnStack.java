package com.aseef.jcfp;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Cheetah");
		animals.push("Panther");
		
		System.out.println(animals);
		
		System.out.println(animals.peek());
		
		animals.pop();
		
		System.out.println(!animals.isEmpty());
		
		System.out.println(animals);
	}

}
