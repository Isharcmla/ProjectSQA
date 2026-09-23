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

public class UniformRealDistribution_sample_499207858124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288562;

    public UniformRealDistribution_sample_499207858124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288562 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term288658 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term288748 = newInstance(Class.forName("org.apache.commons.math3.random.Well44497a"));
        int[] term288417 = (int[]) newIntArray(0);
        setField(term288748, term288748.getClass(), "iRm1", term288417);
        setIntField(term288748, term288748.getClass(), "index", 0);
        setField(term288658, term288658.getClass(), "randomGenerator", term288748);
        setField(term288562, term288562.getClass(), "random", term288658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term288562, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


