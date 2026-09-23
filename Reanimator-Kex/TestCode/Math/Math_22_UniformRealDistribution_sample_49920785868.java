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

public class UniformRealDistribution_sample_49920785868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252017;

    public UniformRealDistribution_sample_49920785868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252017 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term252113 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term252201 = newInstance(Class.forName("org.apache.commons.math3.random.Well1024a"));
        setField(term252113, term252113.getClass(), "randomGenerator", term252201);
        setField(term252017, term252017.getClass(), "random", term252113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term252017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


