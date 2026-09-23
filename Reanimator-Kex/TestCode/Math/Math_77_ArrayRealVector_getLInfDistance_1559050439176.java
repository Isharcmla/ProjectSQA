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

public class ArrayRealVector_getLInfDistance_1559050439176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;
     Object term311;
     Object term12810;
     Object term12812;

    public ArrayRealVector_getLInfDistance_1559050439176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term310 = (double[]) newDoubleArray(0);
        setField(term309, term309.getClass(), "data", term310);
        term311 = (double[]) newDoubleArray(0);
        term12810 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term12811 = (double[]) newDoubleArray(0);
        setField(term12810, term12810.getClass(), "data", term12811);
        term12812 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term311;
        Object retValue = callMethod(klass, "getLInfDistance", argTypes, term309, args);
        assertTrue(recursiveEquals(term309, term12810));
        assertTrue(recursiveEquals(term311, term12812));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


