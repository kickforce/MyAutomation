package com.example.demo2.parallel;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
/*
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Execution(ExecutionMode.SAME_THREAD)*/
public class Test1 {

    @Test
    @Order(1)
    public void first() throws Exception{
        System.out.println("Test1 FirstParallelUnitTest first() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test1 FirstParallelUnitTest first() end => " + Thread.currentThread().getName());
    }

    @Test
    @Order(2)
    public void second() throws Exception{
        System.out.println("Test1 SecondParallelUnitTest second() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test1 SecondParallelUnitTest second() end => " + Thread.currentThread().getName());
    }

    @Test
    @Order(3)
    public void third() throws Exception{
        System.out.println("Test1 TrirdParallelUnitTest third() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test1 TrirdParallelUnitTest third() end => " + Thread.currentThread().getName());
    }
}
