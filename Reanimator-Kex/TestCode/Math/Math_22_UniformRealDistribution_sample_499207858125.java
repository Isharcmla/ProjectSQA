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

public class UniformRealDistribution_sample_499207858125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288900;

    public UniformRealDistribution_sample_499207858125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288900 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term288996 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term289092 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term289182 = newInstance(Class.forName("org.apache.commons.math3.random.Well19937c"));
        int[] term288753 = (int[]) newIntArray(0);
        setField(term289182, term289182.getClass(), "iRm1", term288753);
        setIntField(term289182, term289182.getClass(), "index", 0);
        setField(term289092, term289092.getClass(), "randomGenerator", term289182);
        setField(term288996, term288996.getClass(), "randomGenerator", term289092);
        setField(term288900, term288900.getClass(), "random", term288996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term288900, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


