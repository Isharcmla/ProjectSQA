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

public class UniformRealDistribution_sample_49920785880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276011;

    public UniformRealDistribution_sample_49920785880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276011 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term276107 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term276197 = newInstance(Class.forName("org.apache.commons.math3.random.Well44497a"));
        setField(term276107, term276107.getClass(), "randomGenerator", term276197);
        setField(term276011, term276011.getClass(), "random", term276107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term276011, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


