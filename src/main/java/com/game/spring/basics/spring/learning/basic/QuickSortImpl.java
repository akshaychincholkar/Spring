package com.game.spring.basics.spring.learning.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
//@Primary
public class QuickSortImpl implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        //logic for the quick sort
        return numbers;
    }
//    public String toString(){
//        return "Quicksort";
//    }
}
