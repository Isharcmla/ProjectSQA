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

public class BrentOptimizer_init_7559701475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term7;
     Object term656;

    public BrentOptimizer_init_7559701475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = new Double(0.5523635872663106);
        term7 = new Double(0.544608645520025);
        term656 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term657 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term658 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setDoubleField(term656, term656.getClass(), "relativeThreshold", 0.5523635872663106);
        setDoubleField(term656, term656.getClass(), "absoluteThreshold", 0.544608645520025);
        setField(term656, term656.getClass(), "checker", null);
        setIntField(term657, term657.getClass(), "maximalCount", 0);
        setIntField(term657, term657.getClass(), "count", 0);
        setField(term657, term657.getClass(), "maxCountCallback", term658);
        setField(term656, term656.getClass(), "evaluations", term657);
        setField(term656, term656.getClass(), "goal", null);
        setDoubleField(term656, term656.getClass(), "searchMin", 0.0);
        setDoubleField(term656, term656.getClass(), "searchMax", 0.0);
        setDoubleField(term656, term656.getClass(), "searchStart", 0.0);
        setField(term656, term656.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term7;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term656));
        assertTrue(recursiveEquals(term5, 0.5523635872663106));
        assertTrue(recursiveEquals(term7, 0.544608645520025));
    }

};


