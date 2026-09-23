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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexSolver_doIteration_43098773051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36339;
     Object term36463;

    public SimplexSolver_doIteration_43098773051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36339 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setIntField(term36339, term36339.getClass(), "iterations", 2147483646);
        setIntField(term36339, term36339.getClass(), "maxIterations", 2147483647);
        term36463 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term36573 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setIntField(term36463, term36463.getClass(), "numArtificialVariables", 1);
        setField(term36463, term36463.getClass(), "tableau", term36573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term36463;
        try {
            callMethod(klass, "doIteration", argTypes, term36339, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


