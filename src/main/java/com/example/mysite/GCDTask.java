package com.example.mysite;

import java.util.concurrent.RecursiveTask;

public class GCDTask extends RecursiveTask<Integer> {

    int m;
    int n;

    public GCDTask(int n, int m) {
        this.m = m;
        this.n = n;
    }

    @Override
    public Integer compute() {

        if (m % n == 0)
            return n;


        return new GCDTask(m % n, n).invoke();
    }
}
