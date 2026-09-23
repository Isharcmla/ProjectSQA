package org.apache.commons.math3.optimization.univariate;

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
import static org.apache.commons.math3.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.univariate.EqualityUtils.*;
import java.lang.Double;
import java.lang.Object;

public class BrentOptimizer_init_13725214984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term630;

    public BrentOptimizer_init_13725214984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term3 = new Double(0.3455959125047594);
        term630 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term631 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term632 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setDoubleField(term630, term630.getClass(), "relativeThreshold", 0.13238746331190498);
        setDoubleField(term630, term630.getClass(), "absoluteThreshold", 0.3455959125047594);
        setField(term630, term630.getClass(), "checker", null);
        setIntField(term631, term631.getClass(), "maximalCount", 0);
        setIntField(term631, term631.getClass(), "count", 0);
        setField(term631, term631.getClass(), "maxCountCallback", term632);
        setField(term630, term630.getClass(), "evaluations", term631);
        setField(term630, term630.getClass(), "goal", null);
        setDoubleField(term630, term630.getClass(), "searchMin", 0.0);
        setDoubleField(term630, term630.getClass(), "searchMax", 0.0);
        setDoubleField(term630, term630.getClass(), "searchStart", 0.0);
        setField(term630, term630.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.optimization.ConvergenceChecker");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term3;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term630));
        assertTrue(recursiveEquals(term1, null));
        assertTrue(recursiveEquals(term3, 0.13238746331190498));
    }

};


