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

public class UniformRealDistribution_sample_499207858126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289334;

    public UniformRealDistribution_sample_499207858126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289334 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term289430 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term289526 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term289616 = newInstance(Class.forName("org.apache.commons.math3.random.Well44497a"));
        int[] term289187 = (int[]) newIntArray(0);
        setField(term289616, term289616.getClass(), "iRm1", term289187);
        setIntField(term289616, term289616.getClass(), "index", 0);
        setField(term289526, term289526.getClass(), "randomGenerator", term289616);
        setField(term289430, term289430.getClass(), "randomGenerator", term289526);
        setField(term289334, term289334.getClass(), "random", term289430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term289334, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


