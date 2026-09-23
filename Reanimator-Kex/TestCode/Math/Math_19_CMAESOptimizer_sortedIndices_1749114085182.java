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

public class CMAESOptimizer_sortedIndices_1749114085182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91877;
     Object term91686;
     Object term91982;
     Object term91983;
     Object term91984;
     Object term91985;
     Object term91943;

    public CMAESOptimizer_sortedIndices_1749114085182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91877 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term91686 = (double[]) newDoubleArray(4);
        term91982 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term91982, term91982.getClass(), "value", 0.0);
        setIntField(term91982, term91982.getClass(), "index", 3);
        term91983 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term91983, term91983.getClass(), "value", 0.0);
        setIntField(term91983, term91983.getClass(), "index", 2);
        term91984 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer$DoubleIndex"));
        setDoubleField(term91984, term91984.getClass(), "value", 0.0);
        setIntField(term91984, term91984.getClass(), "index", 2);
        term91985 = (double[]) newDoubleArray(4);
        term91943 = (int[]) newIntArray(4);
        setIntElement(term91943, 1, 1);
        setIntElement(term91943, 2, 2);
        setIntElement(term91943, 3, 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term91686;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term91877, args);
        assertTrue(recursiveEquals(term91877, term91982));
        assertTrue(recursiveEquals(term91686, term91983));
        assertTrue(recursiveEquals(retValue, term91943));
    }

};


