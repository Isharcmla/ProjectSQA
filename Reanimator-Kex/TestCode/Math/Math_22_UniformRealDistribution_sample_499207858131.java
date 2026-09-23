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

public class UniformRealDistribution_sample_499207858131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298831;

    public UniformRealDistribution_sample_499207858131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298831 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term298927 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term299019 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        setIntField(term299019, term299019.getClass(), "count", -1);
        setField(term298927, term298927.getClass(), "randomGenerator", term299019);
        setField(term298831, term298831.getClass(), "random", term298927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term298831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


