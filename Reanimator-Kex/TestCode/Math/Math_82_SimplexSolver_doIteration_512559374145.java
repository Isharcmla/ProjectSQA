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

public class SimplexSolver_doIteration_512559374145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66035;
     Object term66157;

    public SimplexSolver_doIteration_512559374145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66035 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term66035, term66035.getClass(), "iterations", 2147483646);
        setIntField(term66035, term66035.getClass(), "maxIterations", 2147483647);
        term66157 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term66253 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term65886 = (Object[]) newArray("[D", 1);
        setIntField(term66157, term66157.getClass(), "numArtificialVariables", 0);
        setField(term66253, term66253.getClass(), "data", term65886);
        setField(term66157, term66157.getClass(), "tableau", term66253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term66157;
        callMethod(klass, "doIteration", argTypes, term66035, args);
    }

};


