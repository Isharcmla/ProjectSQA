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

public class UniformRealDistribution_sample_49920785896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280520;

    public UniformRealDistribution_sample_49920785896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280520 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term280616 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term280712 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term280802 = newInstance(Class.forName("org.apache.commons.math3.random.Well19937c"));
        setField(term280712, term280712.getClass(), "randomGenerator", term280802);
        setField(term280616, term280616.getClass(), "randomGenerator", term280712);
        setField(term280520, term280520.getClass(), "random", term280616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term280520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


