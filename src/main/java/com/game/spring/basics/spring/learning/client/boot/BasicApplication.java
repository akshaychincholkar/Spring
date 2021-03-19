package com.game.spring.basics.spring.learning.client.boot;

import com.game.spring.basics.spring.learning.basic.BinarySearchImpl;
import com.game.spring.basics.spring.learning.basic.BubbleSortImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.game.spring.basics.spring.learning.basic")
public class BasicApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);
		//ApplicationContext maintains all the beans
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		BubbleSortImpl bubbleSort1 = applicationContext.getBean(BubbleSortImpl.class);
		BubbleSortImpl bubbleSort2 = applicationContext.getBean(BubbleSortImpl.class);

		System.out.println(bubbleSort1);
		System.out.println(bubbleSort2);
		System.out.println("==========================");
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		System.out.println("==========================");
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortImpl());
		System.out.println(binarySearch.search(new int[]{1,2,4,5}));
	}
}
