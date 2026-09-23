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

public class SimplexSolver_doIteration_51255937476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38379;
     Object term38501;

    public SimplexSolver_doIteration_51255937476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38379 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term38379, term38379.getClass(), "iterations", 2147483646);
        setIntField(term38379, term38379.getClass(), "maxIterations", 2147483647);
        term38501 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term38599 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term38501, term38501.getClass(), "numArtificialVariables", 1);
        setIntField(term38599, term38599.getClass(), "columns", 4);
        setIntField(term38599, term38599.getClass(), "blockColumns", 1);
        setField(term38501, term38501.getClass(), "tableau", term38599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term38501;
        try {
            callMethod(klass, "doIteration", argTypes, term38379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


