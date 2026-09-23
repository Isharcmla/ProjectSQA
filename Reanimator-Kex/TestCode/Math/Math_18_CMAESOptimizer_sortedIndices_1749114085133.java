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

public class CMAESOptimizer_sortedIndices_1749114085133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72858;
     Object term72677;
     Object term72947;
     Object term72948;
     Object term72949;
     Object term72950;
     Object term72910;

    public CMAESOptimizer_sortedIndices_1749114085133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72858 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term72677 = (double[]) newDoubleArray(3);
        term72947 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term72947, term72947.getClass(), "value", 0.0);
        setIntField(term72947, term72947.getClass(), "index", 2);
        term72948 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term72948, term72948.getClass(), "value", 0.0);
        setIntField(term72948, term72948.getClass(), "index", 1);
        term72949 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term72949, term72949.getClass(), "value", 0.0);
        setIntField(term72949, term72949.getClass(), "index", 1);
        term72950 = (double[]) newDoubleArray(3);
        term72910 = (int[]) newIntArray(3);
        setIntElement(term72910, 1, 1);
        setIntElement(term72910, 2, 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term72677;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term72858, args);
        assertTrue(recursiveEquals(term72858, term72947));
        assertTrue(recursiveEquals(term72677, term72948));
        assertTrue(recursiveEquals(retValue, term72910));
    }

};


