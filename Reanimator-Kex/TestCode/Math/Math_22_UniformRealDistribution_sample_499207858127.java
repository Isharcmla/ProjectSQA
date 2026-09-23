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

public class UniformRealDistribution_sample_499207858127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289768;

    public UniformRealDistribution_sample_499207858127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289768 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term289864 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term289954 = newInstance(Class.forName("org.apache.commons.math3.random.Well19937a"));
        int[] term289620 = (int[]) newIntArray(0);
        setField(term289954, term289954.getClass(), "iRm1", term289620);
        setIntField(term289954, term289954.getClass(), "index", -1);
        setField(term289864, term289864.getClass(), "randomGenerator", term289954);
        setField(term289768, term289768.getClass(), "random", term289864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term289768, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


