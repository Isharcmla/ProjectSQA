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

public class UniformRealDistribution_sample_49920785884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277369;

    public UniformRealDistribution_sample_49920785884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277369 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term277465 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term277557 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        setField(term277465, term277465.getClass(), "randomGenerator", term277557);
        setField(term277369, term277369.getClass(), "random", term277465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term277369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


