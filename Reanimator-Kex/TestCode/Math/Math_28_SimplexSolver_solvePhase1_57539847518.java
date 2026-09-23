package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;

public class SimplexSolver_solvePhase1_57539847518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15598;
     Object term15722;
     Object term15750;
     Object term15751;

    public SimplexSolver_solvePhase1_57539847518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15598 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        term15722 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setIntField(term15722, term15722.getClass(), "numArtificialVariables", 0);
        term15750 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setDoubleField(term15750, term15750.getClass(), "epsilon", 0.0);
        setIntField(term15750, term15750.getClass(), "maxUlps", 0);
        setField(term15750, term15750.getClass(), "function", null);
        setField(term15750, term15750.getClass(), "linearConstraints", null);
        setField(term15750, term15750.getClass(), "goal", null);
        setBooleanField(term15750, term15750.getClass(), "nonNegative", false);
        setIntField(term15750, term15750.getClass(), "maxIterations", 0);
        setIntField(term15750, term15750.getClass(), "iterations", 0);
        term15751 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term15751, term15751.getClass(), "f", null);
        setField(term15751, term15751.getClass(), "constraints", null);
        setBooleanField(term15751, term15751.getClass(), "restrictToNonNegative", false);
        setField(term15751, term15751.getClass(), "columnLabels", null);
        setField(term15751, term15751.getClass(), "tableau", null);
        setIntField(term15751, term15751.getClass(), "numDecisionVariables", 0);
        setIntField(term15751, term15751.getClass(), "numSlackVariables", 0);
        setIntField(term15751, term15751.getClass(), "numArtificialVariables", 0);
        setDoubleField(term15751, term15751.getClass(), "epsilon", 0.0);
        setIntField(term15751, term15751.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term15722;
        callMethod(klass, "solvePhase1", argTypes, term15598, args);
        assertTrue(recursiveEquals(term15598, term15750));
        assertTrue(recursiveEquals(term15722, term15751));
    }

};


