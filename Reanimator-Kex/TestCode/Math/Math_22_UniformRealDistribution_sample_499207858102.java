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

public class UniformRealDistribution_sample_499207858102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282433;

    public UniformRealDistribution_sample_499207858102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282433 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term282529 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term282625 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term282715 = newInstance(Class.forName("org.apache.commons.math3.random.Well44497a"));
        setField(term282625, term282625.getClass(), "randomGenerator", term282715);
        setField(term282529, term282529.getClass(), "randomGenerator", term282625);
        setField(term282433, term282433.getClass(), "random", term282529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term282433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


