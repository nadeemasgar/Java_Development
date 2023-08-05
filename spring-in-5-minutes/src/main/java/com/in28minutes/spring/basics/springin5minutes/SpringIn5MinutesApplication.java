package com.in28minutes.spring.basics.springin5minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5MinutesApplication {
	
	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search a bean?

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm() );
		
		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5MinutesApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
	}

}
