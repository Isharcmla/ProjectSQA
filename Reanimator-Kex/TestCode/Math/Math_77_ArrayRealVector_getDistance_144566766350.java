package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_getDistance_144566766350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82499;
     Object term82388;
     Object term104807;
     Object term104809;

    public ArrayRealVector_getDistance_144566766350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82499 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term82388 = (double[]) newDoubleArray(0);
        setField(term82499, term82499.getClass(), "data", term82388);
        term104807 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term104808 = (double[]) newDoubleArray(0);
        setField(term104807, term104807.getClass(), "data", term104808);
        term104809 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term82388;
        Object retValue = callMethod(klass, "getDistance", argTypes, term82499, args);
        assertTrue(recursiveEquals(term82499, term104807));
        assertTrue(recursiveEquals(term82388, term104809));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


