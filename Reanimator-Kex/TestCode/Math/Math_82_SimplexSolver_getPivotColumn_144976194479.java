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

public class SimplexSolver_getPivotColumn_144976194479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39463;
     Object term39585;
     Object term39701;
     Object term39702;

    public SimplexSolver_getPivotColumn_144976194479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39463 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term39585 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term39681 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setIntField(term39585, term39585.getClass(), "numArtificialVariables", 0);
        setField(term39585, term39585.getClass(), "tableau", term39681);
        term39701 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term39701, term39701.getClass(), "epsilon", 0.0);
        setIntField(term39701, term39701.getClass(), "maxIterations", 0);
        setIntField(term39701, term39701.getClass(), "iterations", 0);
        setField(term39701, term39701.getClass(), "f", null);
        setField(term39701, term39701.getClass(), "constraints", null);
        setField(term39701, term39701.getClass(), "goalType", null);
        setBooleanField(term39701, term39701.getClass(), "restrictToNonNegative", false);
        term39702 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term39703 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term39702, term39702.getClass(), "f", null);
        setField(term39702, term39702.getClass(), "constraints", null);
        setBooleanField(term39702, term39702.getClass(), "restrictToNonNegative", false);
        setField(term39703, term39703.getClass(), "data", null);
        setField(term39703, term39703.getClass(), "lu", null);
        setField(term39702, term39702.getClass(), "tableau", term39703);
        setIntField(term39702, term39702.getClass(), "numDecisionVariables", 0);
        setIntField(term39702, term39702.getClass(), "numSlackVariables", 0);
        setIntField(term39702, term39702.getClass(), "numArtificialVariables", 0);
        setDoubleField(term39702, term39702.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term39585;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term39463, args);
        assertTrue(recursiveEquals(term39463, term39701));
        assertTrue(recursiveEquals(term39585, term39702));
        assertTrue(recursiveEquals(retValue, null));
    }

};


