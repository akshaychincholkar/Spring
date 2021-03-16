package com.game.spring.basics.spring.learning.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BinarySearchImpl {
    @Autowired
    @Qualifier("quick")
    SortAlgorithm sortAlgorithm;
/*//            autowiring by name
    SortAlgorithm bubbleSortImpl;*/
//constructor injection
/*    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }


    public int search(int[] numbers){
        //Sorting algorithm
        sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        //search logic
        return 3;
    }
}
