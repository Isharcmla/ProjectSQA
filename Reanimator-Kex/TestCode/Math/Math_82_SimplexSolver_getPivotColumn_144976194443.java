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

public class SimplexSolver_getPivotColumn_144976194443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25135;
     Object term25257;
     Object term25648;
     Object term25649;

    public SimplexSolver_getPivotColumn_144976194443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25135 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term25257 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term25365 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term25257, term25257.getClass(), "numArtificialVariables", 0);
        setField(term25257, term25257.getClass(), "tableau", term25365);
        term25648 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term25648, term25648.getClass(), "epsilon", 0.0);
        setIntField(term25648, term25648.getClass(), "maxIterations", 0);
        setIntField(term25648, term25648.getClass(), "iterations", 0);
        setField(term25648, term25648.getClass(), "f", null);
        setField(term25648, term25648.getClass(), "constraints", null);
        setField(term25648, term25648.getClass(), "goalType", null);
        setBooleanField(term25648, term25648.getClass(), "restrictToNonNegative", false);
        term25649 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term25650 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term25649, term25649.getClass(), "f", null);
        setField(term25649, term25649.getClass(), "constraints", null);
        setBooleanField(term25649, term25649.getClass(), "restrictToNonNegative", false);
        setField(term25650, term25650.getClass(), "data", null);
        setField(term25650, term25650.getClass(), "lu", null);
        setField(term25649, term25649.getClass(), "tableau", term25650);
        setIntField(term25649, term25649.getClass(), "numDecisionVariables", 0);
        setIntField(term25649, term25649.getClass(), "numSlackVariables", 0);
        setIntField(term25649, term25649.getClass(), "numArtificialVariables", 0);
        setDoubleField(term25649, term25649.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term25257;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term25135, args);
        assertTrue(recursiveEquals(term25135, term25648));
        assertTrue(recursiveEquals(term25257, term25649));
        assertTrue(recursiveEquals(retValue, null));
    }

};


