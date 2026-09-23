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

public class SimplexSolver_doIteration_512559374139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65264;
     Object term65386;

    public SimplexSolver_doIteration_512559374139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65264 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setIntField(term65264, term65264.getClass(), "iterations", 2147483646);
        setIntField(term65264, term65264.getClass(), "maxIterations", 2147483647);
        term65386 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term65484 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object[] term65093 = (Object[]) newArray("[D", 1);
        setIntField(term65386, term65386.getClass(), "numArtificialVariables", 1);
        setIntField(term65484, term65484.getClass(), "columns", 4);
        setIntField(term65484, term65484.getClass(), "blockColumns", -2);
        setField(term65484, term65484.getClass(), "blocks", term65093);
        setField(term65386, term65386.getClass(), "tableau", term65484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term65386;
        callMethod(klass, "doIteration", argTypes, term65264, args);
    }

};


