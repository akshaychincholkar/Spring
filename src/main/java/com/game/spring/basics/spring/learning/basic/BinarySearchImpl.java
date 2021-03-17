package com.game.spring.basics.spring.learning.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
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
    private Logger logger =  LoggerFactory.getLogger(BinarySearchImpl.class);
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

    /**
     * The method is called as soon as
     * dependencies are available
     */
    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }

    /**
     * The method is called just before the
     * bean instance is removed
     */
    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy");
    }
}
