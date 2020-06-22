package com.demo;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloFutureTest {
    @Test
    public void test() throws ExecutionException, InterruptedException {
        HelloFuture hf = new HelloFuture();

        // call the method and get back a future
        Future<String> future = hf.hello();

        // wait for the future to complete
        String message = future.get();

        assertEquals("Hello, World!", message);
    }
}
