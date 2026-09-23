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
import java.lang.NullPointerException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UniformRealDistribution_sample_49920785881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276350;

    public UniformRealDistribution_sample_49920785881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276350 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term276442 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        int[] term276201 = (int[]) newIntArray(1);
        setIntField(term276442, term276442.getClass(), "count", 0);
        setField(term276442, term276442.getClass(), "rsl", term276201);
        setField(term276350, term276350.getClass(), "random", term276442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term276350, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


