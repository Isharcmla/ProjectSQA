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

public class DiscreteDistribution_sample_43215751572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42435;

    public DiscreteDistribution_sample_43215751572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42435 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term42527 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        int[] term42293 = (int[]) newIntArray(1);
        setIntField(term42527, term42527.getClass(), "count", 0);
        setField(term42527, term42527.getClass(), "rsl", term42293);
        setField(term42435, term42435.getClass(), "random", term42527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term42435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


