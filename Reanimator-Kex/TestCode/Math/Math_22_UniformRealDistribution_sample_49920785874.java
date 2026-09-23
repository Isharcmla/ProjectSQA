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

public class UniformRealDistribution_sample_49920785874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274180;

    public UniformRealDistribution_sample_49920785874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274180 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term274276 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term274372 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term274468 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term274372, term274372.getClass(), "randomGenerator", term274468);
        setField(term274276, term274276.getClass(), "randomGenerator", term274372);
        setField(term274180, term274180.getClass(), "random", term274276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term274180, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


