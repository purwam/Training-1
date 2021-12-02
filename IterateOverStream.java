package com.training.collections;

import java.util.stream.Stream;

public class IterateOverStream {

	// Write a Java 8 program to iterate a Stream using the forEach method
	
	public static void main(String[] args) {
	 Stream.iterate(2, i -> i+1).filter(i -> (i%2 == 0)).limit(10).forEach(i -> System.out.println(i));

	}

}
