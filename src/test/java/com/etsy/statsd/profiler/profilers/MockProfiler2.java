package com.etsy.statsd.profiler.profilers;

import com.etsy.statsd.profiler.Profiler;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Mock profiler for testing
 *
 * @author Andrew Johnson
 */
public class MockProfiler2 extends Profiler {
    private Set<String> output;

    public MockProfiler2(Set<String> output) {
        super(null);
        this.output = output;
    }

    @Override
    public void profile() {
        output.add(this.getClass().getSimpleName() + "-profile");
    }

    @Override
    public void flushData() {
        output.add(this.getClass().getSimpleName() + "-flushData");
    }

    @Override
    public long getPeriod() {
        return 0;
    }

    @Override
    public TimeUnit getTimeUnit() {
        return null;
    }
}