package org.apache.commons.math.analysis.solvers;

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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;
import java.lang.Double;

public class BrentSolver_solve_108921612465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16664;
     Object term16776;
     Object term16805;
     Object term16806;

    public BrentSolver_solve_108921612465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16664 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term16664, term16664.getClass(), "maximalIterationCount", 4);
        setDoubleField(term16664, term16664.getClass(), "functionValueAccuracy", 8.88406468984833E14);
        setDoubleField(term16664, term16664.getClass(), "relativeAccuracy", -9.2233720368535296E18);
        setDoubleField(term16664, term16664.getClass(), "absoluteAccuracy", 5.62949953421312E14);
        term16776 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        term16805 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term16805, term16805.getClass(), "functionValueAccuracy", 8.88406468984833E14);
        setDoubleField(term16805, term16805.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term16805, term16805.getClass(), "resultComputed", true);
        setDoubleField(term16805, term16805.getClass(), "result", Double.NEGATIVE_INFINITY);
        setDoubleField(term16805, term16805.getClass(), "functionValue", 0.0);
        setField(term16805, term16805.getClass(), "f", null);
        setDoubleField(term16805, term16805.getClass(), "absoluteAccuracy", 5.62949953421312E14);
        setDoubleField(term16805, term16805.getClass(), "relativeAccuracy", -9.2233720368535296E18);
        setIntField(term16805, term16805.getClass(), "maximalIterationCount", 4);
        setDoubleField(term16805, term16805.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term16805, term16805.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term16805, term16805.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term16805, term16805.getClass(), "iterationCount", 0);
        term16806 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        Object[] args = new Object[7];
        args[0] = term16776;
        args[1] = -3.8938816396328673E-308;
        args[2] = 2.7757736679113433E-289;
        args[3] = Double.NEGATIVE_INFINITY;
        args[4] = -2.7757736679113433E-289;
        args[5] = Double.NEGATIVE_INFINITY;
        args[6] = 1.014585554856626E-267;
        Object retValue = callMethod(klass, "solve", argTypes, term16664, args);
        assertTrue(recursiveEquals(term16664, term16805));
        assertTrue(recursiveEquals(term16776, term16806));
        assertTrue(recursiveEquals(retValue, Double.NEGATIVE_INFINITY));
    }

};


