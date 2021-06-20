package com.aseef.jcfp;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		//Stack is Data Structure which follows LIFO i.e., last in first out mechanism
		
		animals.push("Lion"); // will push/add the element in the end.
		animals.push("Tiger");
		animals.push("Cheetah");
		animals.push("Panther");
		
		System.out.println(animals);
		
		System.out.println(animals.peek()); // will give top of element
		
		animals.pop(); // will remove top of element
		
		System.out.println(!animals.isEmpty()); //isEmpty() will return true if stack is empty or false if not.
		
		System.out.println(animals);
	}

}
