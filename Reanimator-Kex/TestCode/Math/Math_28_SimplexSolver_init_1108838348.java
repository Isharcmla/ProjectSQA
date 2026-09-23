package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;
import java.lang.Double;
import java.lang.Integer;

public class SimplexSolver_init_1108838348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5804;

    public SimplexSolver_init_1108838348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term3 = new Integer(568599855);
        term5804 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setDoubleField(term5804, term5804.getClass(), "epsilon", 0.13238746331190498);
        setIntField(term5804, term5804.getClass(), "maxUlps", 568599855);
        setField(term5804, term5804.getClass(), "function", null);
        setField(term5804, term5804.getClass(), "linearConstraints", null);
        setField(term5804, term5804.getClass(), "goal", null);
        setBooleanField(term5804, term5804.getClass(), "nonNegative", false);
        setIntField(term5804, term5804.getClass(), "maxIterations", 100);
        setIntField(term5804, term5804.getClass(), "iterations", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5804));
        assertTrue(recursiveEquals(term1, 0.13238746331190498));
        assertTrue(recursiveEquals(term3, 568599855));
    }

};


