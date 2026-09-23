package org.apache.commons.math3.distribution;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UniformRealDistribution_sample_499207858119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292111;

    public UniformRealDistribution_sample_499207858119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292111 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term292203 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        int[] term290388 = (int[]) newIntArray(512);
        int[] term290906 = (int[]) newIntArray(512);
        setIntField(term292203, term292203.getClass(), "count", 0);
        setField(term292203, term292203.getClass(), "rsl", term290388);
        setIntField(term292203, term292203.getClass(), "isaacI", 0);
        setIntField(term292203, term292203.getClass(), "isaacJ", 0);
        setIntField(term292203, term292203.getClass(), "isaacB", 0);
        setIntField(term292203, term292203.getClass(), "isaacC", 0);
        setField(term292203, term292203.getClass(), "mem", term290906);
        setIntField(term292203, term292203.getClass(), "isaacX", 0);
        setIntField(term292203, term292203.getClass(), "isaacA", 0);
        setField(term292111, term292111.getClass(), "random", term292203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term292111, args);
    }

};


