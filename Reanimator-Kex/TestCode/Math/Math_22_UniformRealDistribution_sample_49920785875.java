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

public class UniformRealDistribution_sample_49920785875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274910;

    public UniformRealDistribution_sample_49920785875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274910 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term274996 = newInstance(Class.forName("org.apache.commons.math3.random.Well512a"));
        int[] term274764 = (int[]) newIntArray(0);
        setField(term274996, term274996.getClass(), "iRm1", term274764);
        setIntField(term274996, term274996.getClass(), "index", -1);
        setField(term274910, term274910.getClass(), "random", term274996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term274910, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


