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
import java.lang.Object;

public class BisectionSolver_solve_1803972182147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53372;
     Object term53521;

    public BisectionSolver_solve_1803972182147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53372 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term53484 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        setField(term53372, term53372.getClass(), "f", term53484);
        setIntField(term53372, term53372.getClass(), "iterationCount", 0);
        setBooleanField(term53372, term53372.getClass(), "resultComputed", false);
        setIntField(term53372, term53372.getClass(), "maximalIterationCount", 1);
        setDoubleField(term53372, term53372.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        term53521 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term53522 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        setDoubleField(term53521, term53521.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term53521, term53521.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term53521, term53521.getClass(), "resultComputed", true);
        setDoubleField(term53521, term53521.getClass(), "result", -127.10365545761393);
        setDoubleField(term53521, term53521.getClass(), "functionValue", 0.0);
        setField(term53521, term53521.getClass(), "f", term53522);
        setDoubleField(term53521, term53521.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        setDoubleField(term53521, term53521.getClass(), "relativeAccuracy", 0.0);
        setIntField(term53521, term53521.getClass(), "maximalIterationCount", 1);
        setDoubleField(term53521, term53521.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term53521, term53521.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term53521, term53521.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term53521, term53521.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -513.0429694657241;
        args[1] = 1.542782545089466;
        Object retValue = callMethod(klass, "solve", argTypes, term53372, args);
        assertTrue(recursiveEquals(term53372, term53521));
        assertTrue(recursiveEquals(retValue, -127.10365545761393));
    }

};


