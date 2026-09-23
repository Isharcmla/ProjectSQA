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

public class UniformRealDistribution_sample_49920785850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239578;

    public UniformRealDistribution_sample_49920785850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239578 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term239674 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term239770 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        setField(term239674, term239674.getClass(), "randomGenerator", term239770);
        setField(term239578, term239578.getClass(), "random", term239674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term239578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


