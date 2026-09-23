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

public class BrentSolver_solve_108921612425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6235;
     Object term6539;

    public BrentSolver_solve_108921612425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6235 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term6235, term6235.getClass(), "maximalIterationCount", 1);
        setDoubleField(term6235, term6235.getClass(), "functionValueAccuracy", 4.620693320761344E18);
        term6539 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term6539, term6539.getClass(), "functionValueAccuracy", 4.620693320761344E18);
        setDoubleField(term6539, term6539.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term6539, term6539.getClass(), "resultComputed", true);
        setDoubleField(term6539, term6539.getClass(), "result", 0.0);
        setDoubleField(term6539, term6539.getClass(), "functionValue", 0.0);
        setField(term6539, term6539.getClass(), "f", null);
        setDoubleField(term6539, term6539.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term6539, term6539.getClass(), "relativeAccuracy", 0.0);
        setIntField(term6539, term6539.getClass(), "maximalIterationCount", 1);
        setDoubleField(term6539, term6539.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term6539, term6539.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term6539, term6539.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term6539, term6539.getClass(), "iterationCount", 0);
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
        args[0] = null;
        args[1] = Double.NaN;
        args[2] = 0.0;
        args[3] = Double.NaN;
        args[4] = 2.3949660656400497E-212;
        args[5] = 0.0;
        args[6] = -2.5765184783170906E-231;
        Object retValue = callMethod(klass, "solve", argTypes, term6235, args);
        assertTrue(recursiveEquals(term6235, term6539));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


