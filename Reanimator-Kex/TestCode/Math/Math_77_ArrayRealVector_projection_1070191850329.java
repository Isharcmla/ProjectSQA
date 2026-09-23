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

public class ArrayRealVector_projection_1070191850329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77250;
     Object term77348;
     Object term98238;
     Object term98240;
     Object term98236;

    public ArrayRealVector_projection_1070191850329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77250 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term75151 = (double[]) newDoubleArray(0);
        setField(term77250, term77250.getClass(), "data", term75151);
        term77348 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term75150 = (double[]) newDoubleArray(0);
        setField(term77348, term77348.getClass(), "data", term75150);
        term98238 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98239 = (double[]) newDoubleArray(0);
        setField(term98238, term98238.getClass(), "data", term98239);
        term98240 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98241 = (double[]) newDoubleArray(0);
        setField(term98240, term98240.getClass(), "data", term98241);
        term98236 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98237 = (double[]) newDoubleArray(0);
        setField(term98236, term98236.getClass(), "data", term98237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term77348;
        Object retValue = callMethod(klass, "projection", argTypes, term77250, args);
        assertTrue(recursiveEquals(term77250, term98238));
        assertTrue(recursiveEquals(term77348, term98240));
        assertTrue(recursiveEquals(retValue, term98236));
    }

};


