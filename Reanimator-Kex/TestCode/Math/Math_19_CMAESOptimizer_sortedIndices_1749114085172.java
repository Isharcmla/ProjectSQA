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

public class CMAESOptimizer_sortedIndices_1749114085172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87932;
     Object term87765;
     Object term88005;
     Object term88006;
     Object term88007;
     Object term88008;
     Object term87970;

    public CMAESOptimizer_sortedIndices_1749114085172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87932 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term87765 = (double[]) newDoubleArray(2);
        term88005 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term88005, term88005.getClass(), "value", 0.0);
        setIntField(term88005, term88005.getClass(), "index", 1);
        term88006 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term88006, term88006.getClass(), "value", 0.0);
        setIntField(term88006, term88006.getClass(), "index", 0);
        term88007 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term88007, term88007.getClass(), "value", 0.0);
        setIntField(term88007, term88007.getClass(), "index", 0);
        term88008 = (double[]) newDoubleArray(2);
        term87970 = (int[]) newIntArray(2);
        setIntElement(term87970, 1, 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term87765;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term87932, args);
        assertTrue(recursiveEquals(term87932, term88005));
        assertTrue(recursiveEquals(term87765, term88006));
        assertTrue(recursiveEquals(retValue, term87970));
    }

};


