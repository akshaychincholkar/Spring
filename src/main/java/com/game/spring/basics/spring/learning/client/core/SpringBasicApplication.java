package com.game.spring.basics.spring.learning.client.core;

import com.game.spring.basics.spring.learning.basic.BinarySearchImpl;
import com.game.spring.basics.spring.learning.basic.BubbleSortImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.game.spring.basics.spring.learning.basic")
public class SpringBasicApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicApplication.class)) {
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
//		((AnnotationConfigApplicationContext) applicationContext).close();
	}
}
