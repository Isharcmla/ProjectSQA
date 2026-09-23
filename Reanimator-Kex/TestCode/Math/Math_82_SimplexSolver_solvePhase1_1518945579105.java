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

public class SimplexSolver_solvePhase1_1518945579105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51992;
     Object term52114;

    public SimplexSolver_solvePhase1_1518945579105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51992 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term52114 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term52212 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term52114, term52114.getClass(), "numArtificialVariables", -2147483648);
        setIntField(term52212, term52212.getClass(), "columns", 2);
        setIntField(term52212, term52212.getClass(), "blockColumns", 1);
        setField(term52114, term52114.getClass(), "tableau", term52212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term52114;
        callMethod(klass, "solvePhase1", argTypes, term51992, args);
    }

};


