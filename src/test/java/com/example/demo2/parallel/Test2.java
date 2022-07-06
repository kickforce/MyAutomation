package com.example.demo2.parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
/*
@Execution(ExecutionMode.SAME_THREAD)*/
public class Test2 {

    @Test
    public void first() throws Exception{
        System.out.println("Test2 FirstParallelUnitTest first() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test2 FirstParallelUnitTest first() end => " + Thread.currentThread().getName());
    }

    @Test
    public void second() throws Exception{
        System.out.println("Test2 SecondParallelUnitTest second() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test2 SecondParallelUnitTest second() end => " + Thread.currentThread().getName());
    }

    @Test
    public void third() throws Exception{
        System.out.println("Test2 TrirdParallelUnitTest third() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test2 TrirdParallelUnitTest third() end => " + Thread.currentThread().getName());
    }
}
