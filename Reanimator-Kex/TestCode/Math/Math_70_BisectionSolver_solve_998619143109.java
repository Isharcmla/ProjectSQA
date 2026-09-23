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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BisectionSolver_solve_998619143109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37556;

    public BisectionSolver_solve_998619143109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37556 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term37670 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$14"));
        setField(term37556, term37556.getClass(), "f", term37670);
        setIntField(term37556, term37556.getClass(), "iterationCount", 0);
        setBooleanField(term37556, term37556.getClass(), "resultComputed", false);
        setIntField(term37556, term37556.getClass(), "maximalIterationCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -6.740615280922806E-289;
        args[1] = 2.7844328144534944E-307;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term37556, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


