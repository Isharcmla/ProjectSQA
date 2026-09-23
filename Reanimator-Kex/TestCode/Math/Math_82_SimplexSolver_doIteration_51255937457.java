package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexSolver_doIteration_51255937457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32939;
     Object term33061;

    public SimplexSolver_doIteration_51255937457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32939 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term32939, term32939.getClass(), "iterations", 2147483646);
        setIntField(term32939, term32939.getClass(), "maxIterations", 2147483647);
        term33061 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term33159 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term33061, term33061.getClass(), "numArtificialVariables", 1);
        setIntField(term33159, term33159.getClass(), "columns", 4);
        setField(term33061, term33061.getClass(), "tableau", term33159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term33061;
        try {
            callMethod(klass, "doIteration", argTypes, term32939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


