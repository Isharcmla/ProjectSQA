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

public class SimplexSolver_doIteration_43098773047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33218;
     Object term33342;

    public SimplexSolver_doIteration_43098773047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33218 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setIntField(term33218, term33218.getClass(), "iterations", 2147483646);
        setIntField(term33218, term33218.getClass(), "maxIterations", 2147483647);
        term33342 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setIntField(term33342, term33342.getClass(), "numArtificialVariables", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term33342;
        try {
            callMethod(klass, "doIteration", argTypes, term33218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


