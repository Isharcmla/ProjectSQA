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

public class SimplexSolver_doIteration_43098773053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37020;
     Object term37144;

    public SimplexSolver_doIteration_43098773053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37020 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setIntField(term37020, term37020.getClass(), "iterations", 2147483646);
        setIntField(term37020, term37020.getClass(), "maxIterations", 2147483647);
        term37144 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term37254 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term36869 = (Object[]) newArray("[D", 1);
        setIntField(term37144, term37144.getClass(), "numArtificialVariables", 1);
        setField(term37254, term37254.getClass(), "data", term36869);
        setField(term37144, term37144.getClass(), "tableau", term37254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term37144;
        try {
            callMethod(klass, "doIteration", argTypes, term37020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


