package com.jsp.DSAApp;

public class MyArrayMain
{
	public static void main(String[] args) {
		MyArray m1=new MyArray(5,2);
		m1.add(60);
		m1.add(20);
		m1.add(30);
		m1.addFront(5);
		m1.addAtIndex(0, 1);
		System.out.println("before"+m1);
		System.out.println("Capacity"+m1.capacity());
		System.out.println("size"+m1.size());
		m1.removeAt(1);
		System.out.println("after"+m1);
		System.out.println("size"+m1.size());
		m1.reverseSort();
		System.out.println(m1.binarySearch(90));
	}

}
