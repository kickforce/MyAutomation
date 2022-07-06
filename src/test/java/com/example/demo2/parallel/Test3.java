package com.example.demo2.      parallel;

import org.junit.jupiter.api.Test;

public class Test3 {

    @Test
    public void first() throws Exception{
        System.out.println("Test3 FirstParallelUnitTest first() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test3 FirstParallelUnitTest first() end => " + Thread.currentThread().getName());
    }

    @Test
    public void second() throws Exception{
        System.out.println("Test3 SecondParallelUnitTest second() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test3 SecondParallelUnitTest second() end => " + Thread.currentThread().getName());
    }

    @Test
    public void third() throws Exception{
        System.out.println("Test3 TrirdParallelUnitTest third() start => " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Test3 TrirdParallelUnitTest third() end => " + Thread.currentThread().getName());
    }
}
