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

public class BrentSolver_solve_144219186565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18266;
     Object term18380;
     Object term18409;
     Object term18410;

    public BrentSolver_solve_144219186565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18266 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term18266, term18266.getClass(), "iterationCount", 0);
        setBooleanField(term18266, term18266.getClass(), "resultComputed", false);
        setDoubleField(term18266, term18266.getClass(), "functionValueAccuracy", 7.5663288489591439E18);
        term18380 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        term18409 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term18409, term18409.getClass(), "functionValueAccuracy", 7.5663288489591439E18);
        setDoubleField(term18409, term18409.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term18409, term18409.getClass(), "resultComputed", true);
        setDoubleField(term18409, term18409.getClass(), "result", 3.2779109707860705E-259);
        setDoubleField(term18409, term18409.getClass(), "functionValue", 0.0);
        setField(term18409, term18409.getClass(), "f", null);
        setDoubleField(term18409, term18409.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term18409, term18409.getClass(), "relativeAccuracy", 0.0);
        setIntField(term18409, term18409.getClass(), "maximalIterationCount", 0);
        setDoubleField(term18409, term18409.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term18409, term18409.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term18409, term18409.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term18409, term18409.getClass(), "iterationCount", 0);
        term18410 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term18380;
        args[1] = 2.7042260812102257E-259;
        args[2] = 1.195350606317854E-151;
        args[3] = 3.2779109707860705E-259;
        Object retValue = callMethod(klass, "solve", argTypes, term18266, args);
        assertTrue(recursiveEquals(term18266, term18409));
        assertTrue(recursiveEquals(term18380, 2.7042260812102257E-259));
        assertTrue(recursiveEquals(retValue, 3.2779109707860705E-259));
    }

};


