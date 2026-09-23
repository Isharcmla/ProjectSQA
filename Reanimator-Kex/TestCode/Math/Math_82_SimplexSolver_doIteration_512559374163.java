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

public class SimplexSolver_doIteration_512559374163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71319;
     Object term71441;

    public SimplexSolver_doIteration_512559374163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71319 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term71319, term71319.getClass(), "iterations", 2147483646);
        setIntField(term71319, term71319.getClass(), "maxIterations", 2147483647);
        term71441 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term71549 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term71170 = (Object[]) newArray("[D", 1);
        setIntField(term71441, term71441.getClass(), "numArtificialVariables", 1);
        setField(term71549, term71549.getClass(), "data", term71170);
        setField(term71441, term71441.getClass(), "tableau", term71549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term71441;
        callMethod(klass, "doIteration", argTypes, term71319, args);
    }

};


