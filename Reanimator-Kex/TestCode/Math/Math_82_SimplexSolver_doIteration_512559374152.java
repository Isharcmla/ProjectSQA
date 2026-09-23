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

public class SimplexSolver_doIteration_512559374152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66889;
     Object term67011;

    public SimplexSolver_doIteration_512559374152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66889 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term66889, term66889.getClass(), "iterations", 2147483646);
        setIntField(term66889, term66889.getClass(), "maxIterations", 2147483647);
        term67011 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term67119 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term67011, term67011.getClass(), "numArtificialVariables", 1);
        setField(term67011, term67011.getClass(), "tableau", term67119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term67011;
        callMethod(klass, "doIteration", argTypes, term66889, args);
    }

};


