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

public class BisectionSolver_solve_998619143121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41712;
     Object term41864;

    public BisectionSolver_solve_998619143121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41712 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term41826 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$14"));
        setField(term41712, term41712.getClass(), "f", term41826);
        setIntField(term41712, term41712.getClass(), "iterationCount", 0);
        setBooleanField(term41712, term41712.getClass(), "resultComputed", false);
        setIntField(term41712, term41712.getClass(), "maximalIterationCount", 1);
        setDoubleField(term41712, term41712.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        term41864 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term41865 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$14"));
        setDoubleField(term41864, term41864.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term41864, term41864.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term41864, term41864.getClass(), "resultComputed", true);
        setDoubleField(term41864, term41864.getClass(), "result", -127.10365545761393);
        setDoubleField(term41864, term41864.getClass(), "functionValue", 0.0);
        setField(term41864, term41864.getClass(), "f", term41865);
        setDoubleField(term41864, term41864.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        setDoubleField(term41864, term41864.getClass(), "relativeAccuracy", 0.0);
        setIntField(term41864, term41864.getClass(), "maximalIterationCount", 1);
        setDoubleField(term41864, term41864.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term41864, term41864.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term41864, term41864.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term41864, term41864.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -513.0429694657241;
        args[1] = 1.542782545089466;
        args[2] = 0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term41712, args);
        assertTrue(recursiveEquals(term41712, term41864));
        assertTrue(recursiveEquals(retValue, -127.10365545761393));
    }

};


