package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;

public class CMAESOptimizer_sortedIndices_1749114085135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74250;
     Object term74059;
     Object term83309;
     Object term83310;
     Object term83311;
     Object term83312;
     Object term83270;

    public CMAESOptimizer_sortedIndices_1749114085135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74250 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term74059 = (double[]) newDoubleArray(4);
        term83309 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term83309, term83309.getClass(), "value", 0.0);
        setIntField(term83309, term83309.getClass(), "index", 3);
        term83310 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term83310, term83310.getClass(), "value", 0.0);
        setIntField(term83310, term83310.getClass(), "index", 2);
        term83311 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term83311, term83311.getClass(), "value", 0.0);
        setIntField(term83311, term83311.getClass(), "index", 2);
        term83312 = (double[]) newDoubleArray(4);
        term83270 = (int[]) newIntArray(4);
        setIntElement(term83270, 1, 1);
        setIntElement(term83270, 2, 2);
        setIntElement(term83270, 3, 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74059;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term74250, args);
        assertTrue(recursiveEquals(term74250, term83309));
        assertTrue(recursiveEquals(term74059, term83310));
        assertTrue(recursiveEquals(retValue, term83270));
    }

};


