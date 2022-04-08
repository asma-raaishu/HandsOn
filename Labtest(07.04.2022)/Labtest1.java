package com.linkedlistdemo;

import java.util.LinkedList;

public class Labtest1 {      //a Java program to insert elements into the linked list at the first and last position

	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<>();
		
		link.add("a");
		link.add("Software");
		
		System.out.println("the intialised linkedlist are :"+link);
		link.add(0,"Im");
		link.add(3,"Devloper");
		System.out.println("after some changes in :"+link);
		
	
	}

}
