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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UniformRealDistribution_sample_499207858121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287557;

    public UniformRealDistribution_sample_499207858121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287557 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term287653 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term287745 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        int[] term287408 = (int[]) newIntArray(0);
        setIntField(term287745, term287745.getClass(), "count", 0);
        setField(term287745, term287745.getClass(), "rsl", term287408);
        setField(term287653, term287653.getClass(), "randomGenerator", term287745);
        setField(term287557, term287557.getClass(), "random", term287653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term287557, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


