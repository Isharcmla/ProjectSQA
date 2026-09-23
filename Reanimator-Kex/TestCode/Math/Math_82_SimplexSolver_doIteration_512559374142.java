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

public class SimplexSolver_doIteration_512559374142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65643;
     Object term65765;

    public SimplexSolver_doIteration_512559374142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65643 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term65643, term65643.getClass(), "iterations", 2147483646);
        setIntField(term65643, term65643.getClass(), "maxIterations", 2147483647);
        term65765 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term65861 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term65494 = (Object[]) newArray("[D", 1);
        setIntField(term65765, term65765.getClass(), "numArtificialVariables", 1);
        setField(term65861, term65861.getClass(), "data", term65494);
        setField(term65765, term65765.getClass(), "tableau", term65861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term65765;
        callMethod(klass, "doIteration", argTypes, term65643, args);
    }

};


