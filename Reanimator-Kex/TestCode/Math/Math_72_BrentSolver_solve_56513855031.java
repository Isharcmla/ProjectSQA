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

public class BrentSolver_solve_56513855031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6911;
     Object term7661;

    public BrentSolver_solve_56513855031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6911 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        Object term7025 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$10"));
        setField(term6911, term6911.getClass(), "f", term7025);
        setIntField(term6911, term6911.getClass(), "iterationCount", 0);
        setBooleanField(term6911, term6911.getClass(), "resultComputed", false);
        term7661 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        Object term7662 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$10"));
        setDoubleField(term7661, term7661.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term7661, term7661.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term7661, term7661.getClass(), "resultComputed", true);
        setDoubleField(term7661, term7661.getClass(), "result", 0.0);
        setDoubleField(term7661, term7661.getClass(), "functionValue", 0.0);
        setField(term7661, term7661.getClass(), "f", term7662);
        setDoubleField(term7661, term7661.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term7661, term7661.getClass(), "relativeAccuracy", 0.0);
        setIntField(term7661, term7661.getClass(), "maximalIterationCount", 0);
        setDoubleField(term7661, term7661.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term7661, term7661.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term7661, term7661.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term7661, term7661.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -4.635732427493495E77;
        args[1] = -4.105162769787572E-289;
        args[2] = -32.01269270759076;
        Object retValue = callMethod(klass, "solve", argTypes, term6911, args);
        assertTrue(recursiveEquals(term6911, term7661));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


