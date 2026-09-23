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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexSolver_doIteration_51255937498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47783;
     Object term47905;

    public SimplexSolver_doIteration_51255937498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47783 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term47783, term47783.getClass(), "iterations", 2147483646);
        setIntField(term47783, term47783.getClass(), "maxIterations", 2147483647);
        term47905 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term48003 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term47905, term47905.getClass(), "numArtificialVariables", 0);
        setField(term47905, term47905.getClass(), "tableau", term48003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term47905;
        callMethod(klass, "doIteration", argTypes, term47783, args);
    }

};


