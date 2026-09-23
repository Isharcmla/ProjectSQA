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

public class SimplexSolver_isPhase1Solved_36987646353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30122;
     Object term30244;
     Object term30649;
     Object term30650;

    public SimplexSolver_isPhase1Solved_36987646353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30122 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term30244 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term30352 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term30244, term30244.getClass(), "numArtificialVariables", 8192);
        setField(term30244, term30244.getClass(), "tableau", term30352);
        term30649 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term30649, term30649.getClass(), "epsilon", 0.0);
        setIntField(term30649, term30649.getClass(), "maxIterations", 0);
        setIntField(term30649, term30649.getClass(), "iterations", 0);
        setField(term30649, term30649.getClass(), "f", null);
        setField(term30649, term30649.getClass(), "constraints", null);
        setField(term30649, term30649.getClass(), "goalType", null);
        setBooleanField(term30649, term30649.getClass(), "restrictToNonNegative", false);
        term30650 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term30651 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term30650, term30650.getClass(), "f", null);
        setField(term30650, term30650.getClass(), "constraints", null);
        setBooleanField(term30650, term30650.getClass(), "restrictToNonNegative", false);
        setField(term30651, term30651.getClass(), "data", null);
        setField(term30651, term30651.getClass(), "lu", null);
        setField(term30650, term30650.getClass(), "tableau", term30651);
        setIntField(term30650, term30650.getClass(), "numDecisionVariables", 0);
        setIntField(term30650, term30650.getClass(), "numSlackVariables", 0);
        setIntField(term30650, term30650.getClass(), "numArtificialVariables", 8192);
        setDoubleField(term30650, term30650.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term30244;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term30122, args);
        assertTrue(recursiveEquals(term30122, term30649));
        assertTrue(recursiveEquals(term30244, term30650));
        assertTrue(recursiveEquals(retValue, true));
    }

};


