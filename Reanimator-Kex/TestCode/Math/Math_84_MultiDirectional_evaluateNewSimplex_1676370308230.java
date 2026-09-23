package org.apache.commons.math.optimization.direct;

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
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.direct.EqualityUtils.*;
import java.lang.Object;

public class MultiDirectional_evaluateNewSimplex_1676370308230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295204;
     Object term295051;
     Object term295347;
     Object term295351;
     Object term295338;

    public MultiDirectional_evaluateNewSimplex_1676370308230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295204 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        setField(term295204, term295204.getClass(), "simplex", null);
        term295051 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 10);
        Object term295320 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term295054 = (double[]) newDoubleArray(0);
        setField(term295320, term295320.getClass(), "point", term295054);
        setElement(term295051, 0, term295320);
        term295347 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term295348 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 1);
        Object term295349 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term295350 = (double[]) newDoubleArray(0);
        setDoubleField(term295347, term295347.getClass(), "khi", 0.0);
        setDoubleField(term295347, term295347.getClass(), "gamma", 0.0);
        setField(term295349, term295349.getClass(), "point", term295350);
        setDoubleField(term295349, term295349.getClass(), "value", 0.0);
        setElement(term295348, 0, term295349);
        setField(term295347, term295347.getClass(), "simplex", term295348);
        setField(term295347, term295347.getClass(), "f", null);
        setField(term295347, term295347.getClass(), "checker", null);
        setIntField(term295347, term295347.getClass(), "maxIterations", 0);
        setIntField(term295347, term295347.getClass(), "iterations", 0);
        setIntField(term295347, term295347.getClass(), "maxEvaluations", 0);
        setIntField(term295347, term295347.getClass(), "evaluations", 0);
        setField(term295347, term295347.getClass(), "startConfiguration", null);
        term295351 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 10);
        Object term295352 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term295353 = (double[]) newDoubleArray(0);
        setField(term295352, term295352.getClass(), "point", term295353);
        setDoubleField(term295352, term295352.getClass(), "value", 0.0);
        setElement(term295351, 0, term295352);
        term295338 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term295339 = (double[]) newDoubleArray(0);
        setField(term295338, term295338.getClass(), "point", term295339);
        setDoubleField(term295338, term295338.getClass(), "value", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term295051;
        args[1] = 0.0;
        args[2] = null;
        Object retValue = callMethod(klass, "evaluateNewSimplex", argTypes, term295204, args);
        assertTrue(recursiveEquals(term295204, term295347));
        assertTrue(recursiveEquals(term295051, null));
        assertTrue(recursiveEquals(retValue, term295338));
    }

};


