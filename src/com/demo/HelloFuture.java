package com.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import static java.lang.Thread.sleep;

public class HelloFuture {
    public Future<String> hello() {
        // create a completable future of the type we want
        CompletableFuture<String> future = new CompletableFuture<>();

        new Thread(() -> {
            try {
                // wait to simulate a request etc. taking some time
                sleep(1000);

                // complete with a message
                future.complete("Hello, World!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // return the future
        return future;
    }
}
