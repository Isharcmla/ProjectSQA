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

public class BrentSolver_solve_108921612491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26706;
     Object term26820;
     Object term26873;
     Object term26874;

    public BrentSolver_solve_108921612491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26706 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term26706, term26706.getClass(), "maximalIterationCount", 2);
        setDoubleField(term26706, term26706.getClass(), "functionValueAccuracy", -9.1828390898443213E18);
        setDoubleField(term26706, term26706.getClass(), "relativeAccuracy", 9.2109871550614907E18);
        setDoubleField(term26706, term26706.getClass(), "absoluteAccuracy", 5.0440315826549555E18);
        term26820 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        term26873 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term26873, term26873.getClass(), "functionValueAccuracy", -9.1828390898443213E18);
        setDoubleField(term26873, term26873.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term26873, term26873.getClass(), "resultComputed", true);
        setDoubleField(term26873, term26873.getClass(), "result", 0.0);
        setDoubleField(term26873, term26873.getClass(), "functionValue", 0.0);
        setField(term26873, term26873.getClass(), "f", null);
        setDoubleField(term26873, term26873.getClass(), "absoluteAccuracy", 5.0440315826549555E18);
        setDoubleField(term26873, term26873.getClass(), "relativeAccuracy", 9.2109871550614907E18);
        setIntField(term26873, term26873.getClass(), "maximalIterationCount", 2);
        setDoubleField(term26873, term26873.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term26873, term26873.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term26873, term26873.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term26873, term26873.getClass(), "iterationCount", 1);
        term26874 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
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
        args[0] = term26820;
        args[1] = 2.3763644578689667E-212;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = -2.84818158589203E-306;
        args[5] = Double.NaN;
        args[6] = -1.0507934888123876E-286;
        Object retValue = callMethod(klass, "solve", argTypes, term26706, args);
        assertTrue(recursiveEquals(term26706, term26873));
        assertTrue(recursiveEquals(term26820, term26874));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


