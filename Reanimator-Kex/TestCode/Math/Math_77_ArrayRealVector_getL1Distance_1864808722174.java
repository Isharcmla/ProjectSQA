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

public class ArrayRealVector_getL1Distance_1864808722174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303;
     Object term305;
     Object term12550;
     Object term12552;

    public ArrayRealVector_getL1Distance_1864808722174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term304 = (double[]) newDoubleArray(0);
        setField(term303, term303.getClass(), "data", term304);
        term305 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term306 = (double[]) newDoubleArray(0);
        setField(term305, term305.getClass(), "data", term306);
        term12550 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term12551 = (double[]) newDoubleArray(0);
        setField(term12550, term12550.getClass(), "data", term12551);
        term12552 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term12553 = (double[]) newDoubleArray(0);
        setField(term12552, term12552.getClass(), "data", term12553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term305;
        Object retValue = callMethod(klass, "getL1Distance", argTypes, term303, args);
        assertTrue(recursiveEquals(term303, term12550));
        assertTrue(recursiveEquals(term305, term12552));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


