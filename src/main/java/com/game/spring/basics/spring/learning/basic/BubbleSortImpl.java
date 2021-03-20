package com.game.spring.basics.spring.learning.basic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class BubbleSortImpl implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
    /*public String toString(){
        return "BubbleSort";
    }*/
}
