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

public class UniformRealDistribution_sample_49920785891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279365;

    public UniformRealDistribution_sample_49920785891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279365 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term279457 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        int[] term279214 = (int[]) newIntArray(0);
        setIntField(term279457, term279457.getClass(), "count", -1);
        setIntField(term279457, term279457.getClass(), "isaacI", 0);
        setIntField(term279457, term279457.getClass(), "isaacJ", 0);
        setIntField(term279457, term279457.getClass(), "isaacB", 0);
        setIntField(term279457, term279457.getClass(), "isaacC", 0);
        setField(term279457, term279457.getClass(), "mem", term279214);
        setField(term279365, term279365.getClass(), "random", term279457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term279365, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


