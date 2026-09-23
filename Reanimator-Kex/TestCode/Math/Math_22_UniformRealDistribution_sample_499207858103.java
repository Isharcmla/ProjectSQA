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

public class UniformRealDistribution_sample_499207858103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283251;

    public UniformRealDistribution_sample_499207858103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283251 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term283347 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term283437 = newInstance(Class.forName("org.apache.commons.math3.random.Well19937a"));
        int[] term283106 = (int[]) newIntArray(0);
        setField(term283437, term283437.getClass(), "iRm1", term283106);
        setIntField(term283437, term283437.getClass(), "index", 0);
        setField(term283347, term283347.getClass(), "randomGenerator", term283437);
        setField(term283251, term283251.getClass(), "random", term283347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term283251, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


