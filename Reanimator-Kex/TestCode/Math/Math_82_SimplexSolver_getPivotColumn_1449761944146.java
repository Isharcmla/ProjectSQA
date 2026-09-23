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
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexSolver_getPivotColumn_1449761944146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64471;
     Object term64593;

    public SimplexSolver_getPivotColumn_1449761944146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64471 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term64593 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term64701 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term64593, term64593.getClass(), "numArtificialVariables", 1);
        setField(term64593, term64593.getClass(), "tableau", term64701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term64593;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term64471, args);
        assertTrue(recursiveEquals(term64593, 34363739368L));
        assertTrue(recursiveEquals(retValue, null));
    }

};


