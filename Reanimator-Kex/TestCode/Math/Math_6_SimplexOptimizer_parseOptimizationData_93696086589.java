package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Object;

public class SimplexOptimizer_parseOptimizationData_93696086589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47519;
     Object term47220;
     Object term47891;
     Object term47893;

    public SimplexOptimizer_parseOptimizationData_93696086589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47519 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term47519, term47519.getClass(), "start", null);
        setField(term47519, term47519.getClass(), "function", null);
        term47220 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term47655 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term47819 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setField(term47655, term47655.getClass(), "function", null);
        setElement(term47220, 0, term47655);
        setElement(term47220, 1, term47819);
        setElement(term47220, 2, term47819);
        setElement(term47220, 3, term47819);
        setElement(term47220, 4, term47655);
        setElement(term47220, 5, term47819);
        term47891 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term47892 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setDoubleField(term47892, term47892.getClass(), "khi", 0.0);
        setDoubleField(term47892, term47892.getClass(), "gamma", 0.0);
        setField(term47892, term47892.getClass(), "simplex", null);
        setField(term47892, term47892.getClass(), "startConfiguration", null);
        setIntField(term47892, term47892.getClass(), "dimension", 0);
        setField(term47891, term47891.getClass(), "simplex", term47892);
        setField(term47891, term47891.getClass(), "function", null);
        setField(term47891, term47891.getClass(), "goal", null);
        setField(term47891, term47891.getClass(), "start", null);
        setField(term47891, term47891.getClass(), "lowerBound", null);
        setField(term47891, term47891.getClass(), "upperBound", null);
        setField(term47891, term47891.getClass(), "evaluations", null);
        setField(term47891, term47891.getClass(), "iterations", null);
        setField(term47891, term47891.getClass(), "checker", null);
        term47893 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term47894 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term47895 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setField(term47894, term47894.getClass(), "function", null);
        setElement(term47893, 0, term47894);
        setDoubleField(term47895, term47895.getClass(), "khi", 0.0);
        setDoubleField(term47895, term47895.getClass(), "gamma", 0.0);
        setField(term47895, term47895.getClass(), "simplex", null);
        setField(term47895, term47895.getClass(), "startConfiguration", null);
        setIntField(term47895, term47895.getClass(), "dimension", 0);
        setElement(term47893, 1, term47895);
        setElement(term47893, 2, term47895);
        setElement(term47893, 3, term47895);
        setElement(term47893, 4, term47894);
        setElement(term47893, 5, term47895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term47220;
        callMethod(klass, "parseOptimizationData", argTypes, term47519, args);
        assertTrue(recursiveEquals(term47519, term47891));
        assertTrue(recursiveEquals(term47220, term47893));
    }

};


