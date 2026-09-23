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

public class UniformRealDistribution_sample_499207858128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290106;

    public UniformRealDistribution_sample_499207858128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290106 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term290202 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term290298 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term290384 = newInstance(Class.forName("org.apache.commons.math3.random.Well512a"));
        int[] term289959 = (int[]) newIntArray(0);
        setField(term290384, term290384.getClass(), "iRm1", term289959);
        setIntField(term290384, term290384.getClass(), "index", 0);
        setField(term290298, term290298.getClass(), "randomGenerator", term290384);
        setField(term290202, term290202.getClass(), "randomGenerator", term290298);
        setField(term290106, term290106.getClass(), "random", term290202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term290106, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


